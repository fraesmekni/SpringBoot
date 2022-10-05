package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity

public class Equipe implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idEquipe; //clé primaire
    private Niveau niveau;
    private String  nomEquipe;
    @ManyToMany(mappedBy = "Eq")
    Set<Etudiant> e;
@OneToOne
DetailEquipe D_Eq;
    public Equipe() {
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }
}
