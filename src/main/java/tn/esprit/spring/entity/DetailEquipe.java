package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailEq;
    private int salle;
    private String thematique;
    @OneToOne (mappedBy = "D_Eq")
    Equipe Eq;

    public DetailEquipe() {
    }

    public int getIdDetailEq() {
        return idDetailEq;
    }

}
