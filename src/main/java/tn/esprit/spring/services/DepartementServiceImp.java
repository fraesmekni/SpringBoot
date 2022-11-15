package tn.esprit.spring.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Contrat;
import tn.esprit.spring.entity.Departement;
import tn.esprit.spring.entity.Etudiant;
import tn.esprit.spring.repositories.DepartementRepository;
import tn.esprit.spring.repositories.EtudiantRepository;


import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Slf4j
@AllArgsConstructor
public class DepartementServiceImp implements IDepartementService{

    DepartementRepository departementRepository;
    EtudiantRepository etudiantRepository;

    public Long ajouterDepartement(Departement d) {
        departementRepository.save(d);
        log.info("Ajouter Departement");
        return d.getIdDepartement();
    }

    @Override
    public Iterable<Departement> retrieveAllDepartement() {return departementRepository.findAll();}

    @Override
    public Optional< Departement > findDepartementById(Long id) {
        return departementRepository.findById(id);
    }

    @Override
    public void deleteDepartement(Long id) {
        departementRepository.deleteById(id);}

    @Override
    public Departement updateDepartement(Departement d) {return departementRepository.save(d);}

    @Override
    public Departement retrieveDepartement(Long idDep) {
        return departementRepository.findById(idDep).get();
    }

    public Set<Etudiant> getEtudiantsByDepar (Long idDepartement){
        return  retrieveDepartement(idDepartement).getEtudiants();
    }

}
