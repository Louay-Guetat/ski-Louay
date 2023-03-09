package tn.esprit.ds.skilouay.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.skilouay.Entities.Cours;
import tn.esprit.ds.skilouay.Entities.Moniteur;

import java.util.List;

public interface MoniteurRepository extends JpaRepository<Moniteur,Long> {

}
