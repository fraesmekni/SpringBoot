package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Equipe;
import tn.esprit.spring.services.IEquipeService;


@RestController
@RequestMapping("/EquipeC")
public class EquipeController {
    @Autowired
    IEquipeService iEquipeService;

    @GetMapping("/")
    public Iterable<Equipe>  GetAllEquipe(){
        return iEquipeService.retrieveAllEquipe();
    }

    @PostMapping("/addEquipe")
    @ResponseBody
    public void addEquipe(@RequestBody Equipe equipe) {
        iEquipeService.ajouterEquipe(equipe);
    }

    @GetMapping("/retrieve-equipe/{equipe-id}")
    public Equipe retrieveEquipe(@PathVariable("equipe-id") Long equipeId) {
        return iEquipeService.retrieveEquipe(equipeId);
    }

        @PutMapping("/updateEquipe")
    @ResponseBody
    public void updateEquipe(@RequestBody Equipe equipe) {
        iEquipeService.updateEquipe(equipe);
    }

    @DeleteMapping("/deleteEquipe/{equipe-id}")
    @ResponseBody
    public void deleteEquipe(@PathVariable("equipe-id") Long equipeId ) {
        iEquipeService.deleteEquipe(equipeId);
    }
}
