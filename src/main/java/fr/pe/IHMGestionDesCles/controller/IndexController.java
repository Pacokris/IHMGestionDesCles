package fr.pe.IHMGestionDesCles.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    /**
     * Controller pour afficher la page index.html
     *
     * @return ModelAndView "index"
     */

    @GetMapping("/")
    public ModelAndView displayIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");

        //on renvoit vers la page index.html
        return modelAndView;
    }
}
