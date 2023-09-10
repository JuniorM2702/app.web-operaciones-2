package pe.edu.cibertec.app.weboperaciones2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/index")
    public String inicio(Model model){
        model.addAttribute("mensaje", "HAD");
        return "index";
    }

}
