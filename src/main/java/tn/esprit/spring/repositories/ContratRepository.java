package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.spring.entity.Contrat;

import java.util.Date;

public interface ContratRepository  extends JpaRepository<Contrat, Long> {

    @Query("select   sum(montantContrat)   from Contrat   where datedeb >= ?1 and datefin <= ?2 and archive = false  group by specialite")
    float getcontratmontantBetween(Date dateDebut , Date dateFin);
}
