package tn.esprit.spring.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Departement;
import tn.esprit.spring.entity.Etudiant;
import tn.esprit.spring.entity.Offre;
import tn.esprit.spring.entity.Partenaire;
import tn.esprit.spring.repositories.OffreRepository;
import tn.esprit.spring.repositories.PartenaireRepository;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class OffreServiceImp implements IoffreService{

    OffreRepository offreRepository;
    PartenaireRepository partenaireRepository;

    @Override
    public Long ajouterOffre(Offre o) {
        offreRepository.save(o);
        log.info("Ajouter Offre");
        return o.getIdOffre();
    }
    @Override
    public Iterable<Offre> retrieveAllOffre() {return offreRepository.findAll();}


    @Override
    public void deleteOffre(Long id) {
        offreRepository.deleteById(id);}

    @Override
    public Offre updateOffre(Offre o) {return offreRepository.save(o);}

    @Override
    public Offre retrieveOffre(Long idOffre) {
        return offreRepository.findById(idOffre).get();
    }


    @Override
    public void assignOffreToPartenaire( Long idOffre , Long idPar) {

        Offre offre = offreRepository.findById(idOffre).orElse(null);
        Partenaire partenaire = partenaireRepository.findById(idPar).orElse(null);
        offre.setPartenaire(partenaire);
        offreRepository.save(offre);
    }

}
