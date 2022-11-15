package tn.esprit.spring.services;
import tn.esprit.spring.entity.Partenaire;

public interface IpartenaireService
{

    public Long ajouterPartenaire(Partenaire p);
    public Iterable<Partenaire> retrieveAllPartenaire();
    Partenaire retrievePartenaire(Long idPartenaire);

    public void deletePartenaire(Long id);
    Partenaire updatePartenaire(Partenaire p);
    public void assignPartenaireToUniversite( Long idPartenaire, Long idUniversite);
}
