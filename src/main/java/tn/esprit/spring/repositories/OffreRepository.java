package tn.esprit.spring.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entity.Offre;

public interface OffreRepository extends JpaRepository<Offre, Long> {
}
