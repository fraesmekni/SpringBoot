package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.spring.entity.Equipe;

import java.util.List;


public interface EquipeRepository  extends JpaRepository<Equipe,Long> {
    @Query("SELECT e FROM Equipe e WHERE e.nomEquipe LIKE %?1%")
    public List<Equipe> search(String keyword);
    @Query("SELECT  e.niveau, COUNT(e) from Equipe e join DetailEquipe De on e=De.equipe group by e.niveau  ")
    List<String> stats();
}
