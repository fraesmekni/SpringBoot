package tn.esprit.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Contrat;
import tn.esprit.spring.entity.Equipe;
import tn.esprit.spring.services.IContratService;


import java.sql.Date;
import java.util.Optional;

@RestController
@RequestMapping("/ContratC")
public class ContratController {

    @Autowired
    IContratService iContratService;

    @GetMapping("/")
    public Iterable<Contrat>  GetAllContrat(){
        return iContratService.retrieveAllContrat();
    }
    @GetMapping("/ContratById/{contrat-id}")
    public Optional< Contrat > GetEtudiantbyId(@PathVariable("contrat-id") Long Id){
        return iContratService.findContratById(Id);
    }
    @PostMapping("/addContrat")
    @ResponseBody
    public void addEtudiant(@RequestBody Contrat contrat) {
        iContratService.ajouter_contrat(contrat);
    }

    @PutMapping("/updateContrat")
    @ResponseBody
    public void updateEtudiant(@RequestBody Contrat contrat) {
        iContratService.ajouter_contrat(contrat);
    }

    @DeleteMapping("/deleteContrat/{contrat-id}")
    @ResponseBody
    public void deleteContrat(@PathVariable("contrat-id") Long ContratId ) {
        iContratService.deleteContrat(ContratId);
    }

    @GetMapping("/Get-Date/{dateDebut}/{dateFin}")
    public float GetDateBetween(@PathVariable("dateDebut") Date DateDebut,@PathVariable("dateFin") Date DateFin) {
        return iContratService.getChiffreAffaireEntreDeuxDate(DateDebut,DateFin);
    }
}
