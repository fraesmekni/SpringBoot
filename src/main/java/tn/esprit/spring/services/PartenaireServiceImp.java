package tn.esprit.spring.services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Offre;
import tn.esprit.spring.entity.Partenaire;
import tn.esprit.spring.entity.Universite;
import tn.esprit.spring.repositories.PartenaireRepository;
import tn.esprit.spring.repositories.UniversiteRepository;

@Service
@Slf4j
@AllArgsConstructor
public class PartenaireServiceImp implements IpartenaireService{

    PartenaireRepository partenaireRepository;
    UniversiteRepository universiteRepository;

    @Override
    public Long ajouterPartenaire(Partenaire p) {
        partenaireRepository.save(p);
        log.info("Ajouter Offre");
        return p.getIdPartenaire();
    }
    @Override
    public Iterable<Partenaire> retrieveAllPartenaire() {return partenaireRepository.findAll();}


    @Override
    public void deletePartenaire(Long id) {
        partenaireRepository.deleteById(id);}

    @Override
    public Partenaire updatePartenaire(Partenaire p) {return partenaireRepository.save(p);}

    @Override
    public Partenaire retrievePartenaire(Long idPartenaire) {
        return partenaireRepository.findById(idPartenaire).get();
    }


    @Override
    public void assignPartenaireToUniversite( Long idPartenaire , Long idUniver) {

        Partenaire partenaire = partenaireRepository.findById(idPartenaire).orElse(null);
        Universite universite = universiteRepository.findById(idUniver).orElse(null);
        partenaire.setUniversites(universite);
        partenaireRepository.save(partenaire);
    }
}
