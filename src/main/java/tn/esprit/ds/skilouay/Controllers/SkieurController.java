package tn.esprit.ds.skilouay.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.skilouay.Entities.Skieur;
import tn.esprit.ds.skilouay.Services.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("/skieur")
public class SkieurController {
    @Autowired
    ISkieurService skieurService;
    @GetMapping
    public List<Skieur> getAll(){
        return skieurService.retrieveAllSkieurs();
    }
    @GetMapping("/{numSkieur}")
    public Skieur retrieveSkieur (@PathVariable Long numSkieur){
        return skieurService.retrieveSkieur(numSkieur);
    }
    @PostMapping
    public Skieur postSkieur(@RequestBody Skieur skieur){
        return skieurService.addSkieur(skieur);
    }
    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur skieur){
        return skieurService.updateSkieur(skieur);
    }
    @DeleteMapping("/{id}")
    public void removeSkieur (@PathVariable(name = "id") Long numSkieur){
        skieurService.removeSkieur(numSkieur);
    }
}