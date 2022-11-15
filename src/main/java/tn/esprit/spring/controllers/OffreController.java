package tn.esprit.spring.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Offre;
import tn.esprit.spring.entity.Partenaire;
import tn.esprit.spring.services.IoffreService;
import tn.esprit.spring.services.IpartenaireService;

@RestController
@RequestMapping("/OffreC")
public class OffreController {

    @Autowired
    IoffreService ioffreService;

    @GetMapping("/")
    public Iterable<Offre>  GetAllOffre(){
        return ioffreService.retrieveAllOffre();
    }

    @GetMapping("/retrieve-Offre/{Offre-id}")
    public Offre retrieveOffre(@PathVariable("Offre-id") Long OffreId) {
        return ioffreService.retrieveOffre(OffreId);
    }

    @PostMapping("/addOffre")
    @ResponseBody
    public void addOffre(@RequestBody Offre offre) {
        ioffreService.ajouterOffre(offre);
    }

    @PutMapping("/updateOffre")
    @ResponseBody
    public void updatePOffre(@RequestBody Offre offre) {
        ioffreService.updateOffre(offre);
    }

    @DeleteMapping("/deleteOffre/{Offre-id}")
    @ResponseBody
    public void deleteEtudiant(@PathVariable("Offre-id") Long OffreId ) {
        ioffreService.deleteOffre(OffreId);
    }
    @PutMapping(value = "/affectationOffre_Partenaire/{offre-id}/{par-id}")
    public void affectationOffrePartenaire(@PathVariable("offre-id}") Long offretId ,@PathVariable("par-id}") Long parId )
    {
        ioffreService.assignOffreToPartenaire(offretId,parId);
    }

}
