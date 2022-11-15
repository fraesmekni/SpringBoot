package tn.esprit.spring.services;



import tn.esprit.spring.entity.Contrat;

import java.util.Date;
import java.util.Optional;

public interface IContratService {
    public Long ajouter_contrat(Contrat c);
    public Iterable<Contrat> retrieveAllContrat();
    Optional< Contrat > findContratById(Long id);
    public void deleteContrat(long id);
    Contrat updateContrat(Contrat c);
    Contrat retrieveContrat (Long idContrat);
   public Contrat affectContratToEtudiant (Contrat ce, String nomE,String prenomE);
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate)
    ;
}
