package tn.esprit.ds.skilouay.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.skilouay.Entities.Cours;
import tn.esprit.ds.skilouay.Entities.Moniteur;
import tn.esprit.ds.skilouay.Repositories.CoursRepository;
import tn.esprit.ds.skilouay.Repositories.MoniteurRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoniteurService implements IMoniteurService{
    @Autowired
    MoniteurRepository moniteurRepository;
    @Autowired
    CoursRepository coursRepository;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {
        moniteurRepository.deleteById(numMoniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepository.findById(numMoniteur).orElse(null);
    }
    @Override
    public Moniteur updateMoniteur(Moniteur moniteur){
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        Cours cours = coursRepository.findById(numCourse).orElse(null);
        List<Moniteur> allMoniteurs = moniteurRepository.findAll();
        if(moniteur != null && cours != null){
            List<Cours> coursList = allMoniteurs.get(0).getCours();
            coursList.add(cours);
            moniteur.setCours(coursList);
            return moniteurRepository.save(moniteur);
        }
        return null;
    }
}
