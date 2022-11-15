package tn.esprit.spring.services;

import tn.esprit.spring.entity.Equipe;

public interface IEquipeService {

    public Long ajouterEquipe(Equipe e);
    public Iterable<Equipe> retrieveAllEquipe();

    public void deleteEquipe(Long id);
    Equipe updateEquipe(Equipe e);

    Equipe retrieveEquipe (Long idEquipe);
}
