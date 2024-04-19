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
import mx.utng.cjge.model.entity.Proveedor;
import mx.utng.cjge.model.service.IProveedorService;

@Controller
@SessionAttributes("proveedor")
public class ProveedorController {
    //Inyectamos una dependencia del servicio
    @Autowired
    private IProveedorService proveedorService;

    //Manda llamar este metodo en una peticion GET que contenga como final de la query string "", "/", "/list"
    @GetMapping({"/proveedor/list","/proveedor","/proveedor/"})
    public String list(Model model){
        model.addAttribute("title", "Listado de Proveedores");
    model.addAttribute("proveedores", proveedorService.list());
    return "plist";
    }

    //Peticion que contenga al final de la url /form
    @GetMapping("/proveedor/form")
    public String create (Model model){
        model.addAttribute("title", "Formulario de Proveedores");
        model.addAttribute("proveedor", new Proveedor());
        return "pform";
    }

    @GetMapping("/proveedor/form/{id}")
    public String update(@PathVariable Long id,Model model){
        Proveedor proveedor = null;
        if (id>0) {
            proveedor = proveedorService.getById(id);
        }else{
            return "redirect:plist";
        }

        model.addAttribute("title", "Editar Proveedor");
        model.addAttribute("proveedor", proveedor);
        return "pform";
    }


    @PostMapping ("/proveedor/form")
    public String save(@Valid Proveedor proveedor, BindingResult br, Model model){

        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de Proveedores");
            return "pform";
        }

        proveedorService.save(proveedor);
        return "redirect:/proveedor/list";
    }

    @GetMapping("/proveedor/delete/{id}")
    public String delete (@PathVariable Long id, Model model){
        if (id>0) {
            proveedorService.delete(id);
        }
        return "redirect:/proveedor/list";
    }

}

