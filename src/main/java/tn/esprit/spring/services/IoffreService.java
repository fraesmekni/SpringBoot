package tn.esprit.spring.services;

import tn.esprit.spring.entity.Etudiant;
import tn.esprit.spring.entity.Offre;

import java.util.Optional;

public interface IoffreService {

    public Long ajouterOffre(Offre o);
    public Iterable<Offre> retrieveAllOffre();
    Offre retrieveOffre(Long idOffre);

    public void deleteOffre(Long id);
    Offre updateOffre(Offre o);
    public void assignOffreToPartenaire( Long idOffre , Long idPartenaire);
}
