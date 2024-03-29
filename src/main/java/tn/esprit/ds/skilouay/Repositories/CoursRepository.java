package tn.esprit.ds.skilouay.repositories;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.ds.skilouay.Entities.Cours;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours,Long > {
    @Query(value ="SELECT * FROM cours c ORDER BY (SELECT COUNT * FROM inscription i WHERE i.cours_num_cours = c.num_cours)",nativeQuery = true)
    List<Cours> findCoursByNumCours();
}
