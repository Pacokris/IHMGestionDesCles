package fr.pe.IHMGestionDesCles.controller;

import fr.pe.IHMGestionDesCles.model.GroupEntity;
import fr.pe.IHMGestionDesCles.model.ListGroupEntity;
import fr.pe.IHMGestionDesCles.service.GroupeRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class GroupeController {
    @Autowired
    GroupeRestService groupeRestService;

    /**
     * Controller pour afficher la page groupes.html
     * @param model modele MVC
     * @return la page groupes.html
     */
    @GetMapping("/groupes")
    public ModelAndView displayGroupes(Map<String, Object> model) {
//        GroupEntity group1 = new GroupEntity("Partenaires SPE", "Structures DGEFP, CAP EMPLOI et Mission Locale", "2019-07-16 17:45:00", "2019-07-16 17:45:00");
//        GroupEntity group2 = new GroupEntity("Partenaires SPE", "Structures DGEFP, CAP EMPLOI et Mission Locale", "2019-07-16 17:45:00", "2019-07-16 17:45:00");
//        List<GroupEntity> myList = new ArrayList<>();
//        myList.add(group1);
//        myList.add(group2);

        ListGroupEntity myList = groupeRestService.getGroupAll();
        //nom de la template mustache {{#groupes}}....{{/groupes}}
        model.put("groupes", myList);

        return new ModelAndView("groupes", model);
    }

    /**
     * Controller pour afficher la page groupeModif.html
     * @return la page groupeModif.html
     */
    @GetMapping("/groupeModif")
    public ModelAndView displayGroupesModif() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("groupeModif");

        return modelAndView;
    }

    /**
     * Controller pour afficher la page groupeAjout.html
     * @return la page groupeAjout.html
     */
    @GetMapping("/groupeAjout")
    public ModelAndView displayGroupesAjout() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("groupeAjout");

        return modelAndView;
    }
}
