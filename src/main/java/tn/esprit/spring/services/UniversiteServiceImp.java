package tn.esprit.spring.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Departement;
import tn.esprit.spring.entity.Universite;
import tn.esprit.spring.repositories.DepartementRepository;
import tn.esprit.spring.repositories.UniversiteRepository;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

@Service
@Slf4j
@AllArgsConstructor
public class UniversiteServiceImp implements IUniversiteService {


    UniversiteRepository universiteRepository;
    DepartementRepository departementRepository;

    public Long ajouterUniversite(Universite u) {
        universiteRepository.save(u);
        log.info("Ajouter Universite");
        return u.getIdUniversite();
    }

    @Override
    public Iterable<Universite> retrieveAllUniversite() {return universiteRepository.findAll();}

    @Override
    public Optional< Universite > findUniversiteById(Long id) {
        return universiteRepository.findById(id);
    }

    @Override
    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);}

    @Override
    public Universite updateUniversite(Universite u) {return universiteRepository.save(u);}

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }
    public void assignUniversiteToDepartement(Long idUniversite, Long
            idDepartement){

        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement= departementRepository.findById(idDepartement).orElse(null);

        universite.getDepartements().add(departement);
        universiteRepository.save(universite);


    }

    public Set<Departement> retrieveDepartementsByUniversite(Long idUniversite){

        return retrieveUniversite(idUniversite).getDepartements();
    }

    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate){
        return 0;
    }
}
