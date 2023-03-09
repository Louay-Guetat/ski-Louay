package tn.esprit.ds.skilouay.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ds.skilouay.Entities.Cours;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours,Long> {
}
