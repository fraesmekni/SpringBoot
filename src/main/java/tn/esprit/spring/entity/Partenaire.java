package tn.esprit.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name ="Partenaire")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Partenaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPartenaire")
    private Long idPartenaire; // Clé primaire
    private String nomPartenaire;
    private String localisation;
    private String email;
    private int numTelPar;
    private boolean mobilite;
    @Enumerated(EnumType.STRING)
    Support support ;

    @ManyToOne
   Universite universites;
    @OneToMany( mappedBy="partenaire")
    private Set<Offre> offres;

}
