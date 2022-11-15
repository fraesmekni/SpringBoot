package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Equipe;
import tn.esprit.spring.entity.Etudiant;
import tn.esprit.spring.entity.Partenaire;
import tn.esprit.spring.services.IpartenaireService;
import tn.esprit.spring.services.PartenaireServiceImp;

import java.util.Optional;

@RestController
@RequestMapping("/PartenaireC")
public class PartenaireController {

    @Autowired
    IpartenaireService ipartenaireService;

    @GetMapping("/")
    public Iterable<Partenaire>  GetAllEtudiant(){
        return ipartenaireService.retrieveAllPartenaire();
    }

    @GetMapping("/retrieve-partenaire/{Partenaire-id}")
    public Partenaire retrievePartenaire(@PathVariable("Partenaire-id") Long PartenaireId) {
        return ipartenaireService.retrievePartenaire(PartenaireId);
    }

    @PostMapping("/addPartenaire")
    @ResponseBody
    public void addPartenaire(@RequestBody Partenaire Par) {
        ipartenaireService.ajouterPartenaire(Par);
    }

    @PutMapping("/updatePartenaire")
    @ResponseBody
    public void updatePartenaire(@RequestBody Partenaire Par) {
        ipartenaireService.updatePartenaire(Par);
    }

    @DeleteMapping("/deletePartenaire/{partenaire-id}")
    @ResponseBody
    public void deletePartenairet(@PathVariable("partenaire-id") Long PartenairetId ) {
        ipartenaireService.deletePartenaire(PartenairetId);
    }
    @PutMapping(value = "/affectationPartenaire_univer/{Par-id}/{uni-id}")
    public void affectationPartenaireUniversite(@PathVariable("Par-id}") Long partId ,@PathVariable("uni-id}") Long UniId )
    {
        ipartenaireService.assignPartenaireToUniversite(partId,UniId);
    }

}
