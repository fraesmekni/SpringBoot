package tn.esprit.spring.entity;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name ="DetailEquipe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDetailEquipe")
    private Long idDetailEquipe; // Clé primaire

    private Long salle;
    private String thematique;

    @OneToOne(mappedBy="detailEquipe")
    private Equipe equipe;

}
