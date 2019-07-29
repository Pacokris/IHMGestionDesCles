package fr.pe.IHMGestionDesCles.controller;

import fr.pe.IHMGestionDesCles.model.CleEntity;
import fr.pe.IHMGestionDesCles.model.ListCleEntity;
import fr.pe.IHMGestionDesCles.service.CleRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class CleController {
    @Autowired
    CleRestService cleRestService;

    /**
     * Controller pour afficher la page cles.html
     * @param model modele MVC
     * @return la page groupes.html
     */
    @GetMapping("/cles")
    public ModelAndView displayGroupes(Map<String, Object> model) {
        CleEntity group1 = new CleEntity("","130C9C51515018D16203DBF","2019-07-16 00:00:00","","","2019-07-16 00:00:00","");
        CleEntity group2 = new CleEntity("","130C9C51515018D16203DBF","2019-07-16 00:00:00","","","2019-07-16 00:00:00","");
        CleEntity group3 = new CleEntity("","130C9C51515018D16203DBF","2019-07-16 00:00:00","","","2019-07-16 00:00:00","");
        List<CleEntity> myList = new ArrayList<>();
        myList.add(group1);
        myList.add(group2);
        myList.add(group3);

        //List<CleEntity> myList = cleRestService.getCleAll();
        //nom de la template mustache {{#cles}}....{{/cles}}
        model.put("cles", myList);

        return new ModelAndView("cles", model);
    }

    /**
     * Controller pour afficher la page cleModif.html
     * @return la page cleModif.html
     */
    @GetMapping("/cleModif")
    public ModelAndView displayClesModif() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cleModif");

        return modelAndView;
    }

    /**
     * Controller pour afficher la page cleAjout.html
     * @return la page cleAjout.html
     */
    @GetMapping("/cleAjout")
    public ModelAndView displayClesAjout() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("cleAjout");

        return modelAndView;
    }
}

