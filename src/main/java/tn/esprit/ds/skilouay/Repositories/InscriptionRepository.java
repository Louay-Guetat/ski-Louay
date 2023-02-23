package tn.esprit.ds.skilouay.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.skilouay.Entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long> {
}
