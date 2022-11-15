package tn.esprit.spring.entity;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name ="Universite")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Universite implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idUniversite")
    private Long idUniversite; // Clé primaire

    private String nomUniv;

    @OneToMany
    private Set<Departement> departements;

    @OneToMany( mappedBy="universites")
    private Set<Partenaire> partenaires;

}
