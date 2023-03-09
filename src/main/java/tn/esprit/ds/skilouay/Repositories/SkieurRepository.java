package tn.esprit.ds.skilouay.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.skilouay.Entities.Skieur;
import tn.esprit.ds.skilouay.Entities.TypeAbonnement;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    List<Skieur> findByAbonnement_TypeAbon(TypeAbonnement typeAbonnement);
}
