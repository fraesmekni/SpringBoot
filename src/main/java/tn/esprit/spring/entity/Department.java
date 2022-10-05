package tn.esprit.spring.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepart;
    private String nomDepart;
@OneToMany(mappedBy ="dept")
private List<Etudiant>etds;
@ManyToOne
private Universite Uni;


    public Department() {
    }
}
