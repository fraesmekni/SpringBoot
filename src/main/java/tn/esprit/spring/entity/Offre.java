package tn.esprit.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name ="Offre")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Offre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idOffre")
    private Long idOffre; // Clé primaire
    private String nomOffre;
    private String descriptionOffre;
    private String TypeOffre;

    @ManyToOne
     Partenaire partenaire;
}
