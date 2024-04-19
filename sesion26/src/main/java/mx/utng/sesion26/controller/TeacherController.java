/**
 * @autor:Cynthia Janeth Granados Estrada 
 * @category:GDS0624
 */
package mx.utng.sesion26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.sesion26.model.entity.Teacher;
import mx.utng.sesion26.model.service.ITeacherService;

@Controller
@SessionAttributes("teacher")
public class TeacherController {
    
    @Autowired //Crea una instancia para que puedas utilizarla sin utlizar = new la clase y sin inicializarla desde un contructor
    private ITeacherService service;


    @GetMapping({"/teacher","/teacher/","/teacher/list"})
    public String list(Model model){

    model.addAttribute("title", "Listado");
    model.addAttribute("teachers",service.list());
    return "teacher-list";

    }

    @GetMapping("/teacher/form")//Si usas peticion GET lo tienes que hacer encriptado para que sea seguro. 

    public String create(Model model){
        model.addAttribute("title","Formulario de Profesores");
        model.addAttribute("teacher", new Teacher());
        return "teacher-form";
    }

    @PostMapping("/teacher/form") 
    //Peticion POST para guardar datos de forma mas segura 
    public String save(@Valid Teacher teacher,BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title","Formulario de profesores");
            return "teacher-form";
        }
        service.save(teacher);
        return "redirect:/teacher/list";

    }

    @GetMapping("/teacher/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Teacher teacher = null;
        if(id>0){
            teacher = service.getById(id);
        }else{
            return "redirect:/teacher/list";
        }
        model.addAttribute("title", "Editar Profesor");
        model.addAttribute("teacher",teacher);
        return "teacher-form";
    }

    @GetMapping("/teacher/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if (id>0 ){
            service.delete(id);
        }
        return "redirect:/teacher/list";
    }



}
