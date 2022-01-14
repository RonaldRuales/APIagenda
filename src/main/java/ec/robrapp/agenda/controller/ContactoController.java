package ec.robrapp.agenda.controller;


//esta clase me va a permitir mappear las solicitudes http

import ec.robrapp.agenda.model.Contacto;
import ec.robrapp.agenda.repo.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ContactoController {
//agregamos los diferentes metodos

        //metodo para llamar al index
    @Autowired //esta anotacion me permitira traer la lista de contactos
    private ContactoRepository contactoRepository;


     //vamos a mapear desde la carpeta template
    //para llamar a la lista en la plantilla de html o en el inde vamos a cambiar el string  String index(){return "index";}
     @GetMapping("")
    ModelAndView index()

     {
         List<Contacto> contactos= contactoRepository.findAll();
         //return new ModelAndView( viewName:"index")
         return new ModelAndView("index")
         .addObject("contactos",contactos);//esto me jala los datos desde la bd
     }

     //creamos un  nuevo método
    @GetMapping("/nuevo")
    ModelAndView nuevo()
    {
        return new ModelAndView("nuevo") //nueva plantilla
                .addObject("contacto",new Contacto());
    }

    //creamos un nuevo metodo q va a retornar una cadena al momento de guardar desde el formulario nuevo del html
    @PostMapping("/nuevo")
    String crear(Contacto contacto, RedirectAttributes ra)   //Contacto que envia el formulario; Redirect me permite sacar unmensaje al momento de guardar
    {
        contactoRepository.save(contacto); //guardamos el parametro que recibimos del formulario
        ra.addFlashAttribute("msgExito","El Registro se Guardo Correctamente");
        return "redirect:/";   //redireccionamos a la ruta del html al index

    }
}
