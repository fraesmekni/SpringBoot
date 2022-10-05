package tn.esprit.spring.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

public class Universite implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idUniv;
    private String nomUniv;

    @OneToMany(mappedBy ="Uni")
    private List<Department> dept  ;
    public Universite() {
    }

    public int getIdUniv() {
        return idUniv;
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }
}
