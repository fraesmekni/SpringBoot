package tn.esprit.spring.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name ="Contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat  implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Long idContrat; // Clé primaire

    @Temporal(TemporalType.DATE)
    private Date datedeb;

    @Temporal(TemporalType.DATE)
    private Date datefin;
    private Boolean archive;
    private Long montantContrat ;
    @Enumerated(EnumType.STRING)
    Specialite specialite ;
    @JsonIgnore
    @ManyToOne
    Etudiant etudiant;




}
