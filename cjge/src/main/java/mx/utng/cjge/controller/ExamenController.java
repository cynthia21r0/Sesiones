package mx.utng.cjge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import jakarta.validation.Valid;
import mx.utng.cjge.model.entity.Examen;
import mx.utng.cjge.model.service.IExamenService;

@Controller
@SessionAttributes("examen")
public class ExamenController {
    //Inyectamos una dependencia del servicio
    @Autowired
    private IExamenService examenService;

    //Manda llamar este metodo en una peticion GET que contenga como final de la query string "", "/", "/list"
    @GetMapping({"/examen/list","/examen","/examen/"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Examenes");
    model.addAttribute("examenes", examenService.list());
    return "elist";
    }

    //Peticion que contenga al final de la url /form
    @GetMapping("/examen/form")
    public String create (Model model){
        model.addAttribute("title", "Formulario de Examenes");
        model.addAttribute("examen", new Examen());
        return "eform";
    }

    @GetMapping("/examen/form/{id}")
    public String update(@PathVariable Long id,Model model){
        Examen examen = null;
        if (id>0) {
            examen = examenService.getById(id);
        }else{
            return "redirect:elist";
        }

        model.addAttribute("title", "Editar Examen");
        model.addAttribute("examen", examen);
        return "eform";
    }


    @PostMapping ("/examen/form")
    public String save(@Valid Examen examen, BindingResult br, Model model){

        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de Examenes");
            return "eform";
        }

        examenService.save(examen);
        return "redirect:/examen/list";
    }

    @GetMapping("/examen/delete/{id}")
    public String delete (@PathVariable Long id, Model model){
        if (id>0) {
            examenService.delete(id);
        }
        return "redirect:/examen/list";
    }

}

