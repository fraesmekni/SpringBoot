package tn.esprit.spring.services;
import tn.esprit.spring.entity.Departement;
import tn.esprit.spring.entity.Etudiant;
import java.util.Optional;
import java.util.Set;

public interface IDepartementService {

    public Long ajouterDepartement(Departement d);
    public Iterable<Departement> retrieveAllDepartement();
    Optional< Departement > findDepartementById(Long id);
    public Departement retrieveDepartement(Long idDep);

    public void deleteDepartement(Long id);
    public Departement updateDepartement(Departement d);
    public Set<Etudiant> getEtudiantsByDepar (Long idDepartement);
}
