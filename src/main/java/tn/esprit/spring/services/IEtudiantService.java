package tn.esprit.spring.services;

import tn.esprit.spring.entity.Etudiant;
import java.util.Optional;


public interface IEtudiantService {
    public Long ajouter_etudiant(Etudiant e);
    public Iterable<Etudiant> retrieveAllEtudiant();
    Optional< Etudiant > findEtudiantById(Long id);
    Etudiant retrieveEtudiant(Long idEtudiant);

    public void deleteEtudiant(Long id);
    Etudiant updateEtudiant(Etudiant e);
    public void assignEtudiantDepartement( Long idEtud , Long idDep);
   public Etudiant AddAssignEtudiantToEquipeAndContrat ( Etudiant e , Long idContrat , Long idEtudiant);


}
