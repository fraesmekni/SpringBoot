package tn.esprit.spring.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity

public class  Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idContrat ;
    @ManyToOne
    private Etudiant e;
private Date dateDebutContrat;
private Date dateFinContrat;

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public int getMontantContrat() {
        return montantContrat;
    }

    public void setMontantContrat(int montantContrat) {
        this.montantContrat = montantContrat;
    }

    private Specialite specialite;
private Boolean archive;
private int montantContrat;
    public int getIdContrat() {
        return idContrat;
    }

    public Contrat() {
    }
}
