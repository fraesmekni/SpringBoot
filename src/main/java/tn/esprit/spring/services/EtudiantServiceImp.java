package tn.esprit.spring.services;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.spring.entity.Contrat;
import tn.esprit.spring.entity.Departement;
import tn.esprit.spring.entity.Equipe;
import tn.esprit.spring.entity.Etudiant;
import tn.esprit.spring.repositories.ContratRepository;
import tn.esprit.spring.repositories.DepartementRepository;
import tn.esprit.spring.repositories.EquipeRepository;
import tn.esprit.spring.repositories.EtudiantRepository;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class EtudiantServiceImp implements IEtudiantService{



    DepartementRepository departementRepository;

    ContratRepository contratRepository;

    EquipeRepository equipeRepository;

    EtudiantRepository etudiantRepository;





    public Long ajouter_etudiant(Etudiant e) {
        etudiantRepository.save(e);
        log.info("Ajouter Etudiant");
        return e.getIdEtudiant();
    }

    @Override
    public Iterable<Etudiant> retrieveAllEtudiant() {return etudiantRepository.findAll();}

    @Override
    public Optional< Etudiant > findEtudiantById(Long id) {
        return etudiantRepository.findById(id);
    }

    @Override
    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);}

    @Override
    public Etudiant updateEtudiant(Etudiant e) {return etudiantRepository.save(e);}



    public void assignEtudiantDepartement( Long idEtud , Long idDep) {

        Etudiant etudiant = etudiantRepository.findById(idEtud).orElse(null);
        Departement departement = departementRepository.findById(idDep).orElse(null);
       // departement.getEtudiants().add(etudiant);
       // departementRepository.save(departement);
        etudiant.setDepartement(departement);
        etudiantRepository.save(etudiant);
    }

 @Transactional
  public Etudiant AddAssignEtudiantToEquipeAndContrat( Etudiant e , Long idContrat , Long idequipe){

            Contrat contrat = contratRepository.findById(idContrat).orElse(null);
            Equipe equipe = equipeRepository.findById(idequipe).orElse(null);
            contrat.setEtudiant(e);
            equipe.getEtudiants().add(e);
            return etudiantRepository.save(e);

        }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }


}
