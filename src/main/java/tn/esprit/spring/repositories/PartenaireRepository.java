package tn.esprit.spring.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entity.Partenaire;

public interface PartenaireRepository extends JpaRepository<Partenaire, Long> {
}
