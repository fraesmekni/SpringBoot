package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Universite;
import tn.esprit.spring.services.IUniversiteService;

import java.util.Optional;


@RestController
@RequestMapping("/UniversiteC")
public class UniversiteController {
    @Autowired
    IUniversiteService iUniversiteService;

    @GetMapping("/")
    public Iterable<Universite>  GetAllUniversite(){
        return iUniversiteService.retrieveAllUniversite();
    }
    @GetMapping("/UniversiteById/{universite-id}")
    public Optional< Universite > GetUniversitebyId(@PathVariable("universite-id") Long Id){
        return iUniversiteService.findUniversiteById(Id);
    }
    @PostMapping("/addUniversite")
    @ResponseBody
    public void addUniversite(@RequestBody Universite universite) {
        iUniversiteService.ajouterUniversite(universite);
    }

    @PutMapping("/updateUniversite")
    @ResponseBody
    public void updateUniversite(@RequestBody Universite universite) {
        iUniversiteService.updateUniversite(universite);
    }

    @DeleteMapping("/deleteUniversite/{universite-id}")
    @ResponseBody
    public void deleteUniversite(@PathVariable("universite-id") Long universiteId ) {
        iUniversiteService.deleteUniversite(universiteId);
    }

    @PutMapping(value = "/affectationUni_dep/{Uni-id}/{dep-id}")
    public void affectationUniversiteDepartement(@PathVariable("Uni-id") Long UniId ,@PathVariable("dep-id") Long depId )
    {
        iUniversiteService.assignUniversiteToDepartement(UniId,depId);
    }
}
