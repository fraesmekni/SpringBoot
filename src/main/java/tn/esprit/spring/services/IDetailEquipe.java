package tn.esprit.spring.services;

import tn.esprit.spring.entity.Contrat;
import tn.esprit.spring.entity.DetailEquipe;
import tn.esprit.spring.entity.Equipe;

import java.util.Optional;

public interface IDetailEquipe {

    public Long ajouterDetailEquipe(DetailEquipe detailEquipe);
    public Iterable<DetailEquipe> retrieveAllDetailEquipe();
    Optional< DetailEquipe > findDetailEquipeById(Long id);
    DetailEquipe retrieveDetailEquipe(Long idDetailEquipe);
    public void deleteDetailEquipe(long id);
    DetailEquipe updateDetailEquipe(DetailEquipe d);

}
