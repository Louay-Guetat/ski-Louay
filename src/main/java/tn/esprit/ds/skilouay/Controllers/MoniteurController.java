package tn.esprit.ds.skilouay.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.skilouay.Entities.Moniteur;
import tn.esprit.ds.skilouay.Entities.Skieur;
import tn.esprit.ds.skilouay.Services.IMoniteurService;

import java.util.List;
@RestController
@RequestMapping("/moniteur")
public class MoniteurController {
    @Autowired
    IMoniteurService moniteurService;
    @GetMapping
    public List<Moniteur> getAll(){
        return moniteurService.retrieveAllMoniteurs();
    }
    @GetMapping("/{numMoniteur}")
    public Moniteur retrieveMoniteur (@PathVariable Long numMoniteur){
        return moniteurService.retrieveMoniteur(numMoniteur);
    }
    @PostMapping
    public Moniteur postMoniteur(@RequestBody Moniteur moniteur){
        return moniteurService.addMoniteur(moniteur);
    }
    @PutMapping
    public Moniteur updateMoniteur(@RequestBody Moniteur moniteur){
        return moniteurService.updateMoniteur(moniteur);
    }
    @DeleteMapping("/{id}")
    public void removeMoniteur (@PathVariable(name = "id") Long numMoniteur){
        moniteurService.removeMoniteur(numMoniteur);
    }
    @PostMapping("/{numCours}")
    public Moniteur addInstructorAndAssignToCourse(@RequestBody Moniteur moniteur, @PathVariable Long numCours){
        return moniteurService.addInstructorAndAssignToCourse(moniteur,numCours);
    }
}
