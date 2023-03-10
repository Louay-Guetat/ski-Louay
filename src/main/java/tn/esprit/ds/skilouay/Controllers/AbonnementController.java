package tn.esprit.ds.skilouay.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ds.skilouay.Entities.Abonnement;
import tn.esprit.ds.skilouay.Entities.TypeAbonnement;
import tn.esprit.ds.skilouay.Services.IAbonnementService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/abonnement")
public class AbonnementController {
    @Autowired
    IAbonnementService abonnementService;
    @GetMapping
    public List<Abonnement> getAll(){
        return abonnementService.retrieveAllAbonnements();
    }
    @GetMapping("/{numAbonnement}")
    public Abonnement retrieveAbonnement (@PathVariable Long numAbonnement){
        return abonnementService.retrieveAbonnement(numAbonnement);
    }
    @PostMapping
    public Abonnement postAbonnement(@RequestBody Abonnement abonnement){
        return abonnementService.addAbonnement(abonnement);
    }
    @PutMapping
    public Abonnement updateAbonnement(@RequestBody Abonnement abonnement){
        return abonnementService.updateAbonnement(abonnement);
    }
    @DeleteMapping("/{id}")
    public void removeAbonnement (@PathVariable(name = "id") Long numAbonnement){
        abonnementService.removeAbonnement(numAbonnement);
    }
    @GetMapping("/{typeAbonnement}")
    public Set<Abonnement> getSubscriptionByType(@PathVariable TypeAbonnement typeAbonnement){
        return abonnementService.getSubscriptionByType(typeAbonnement);
    }
    @GetMapping()
    public List<Abonnement> retreiveSubscriptionsByDates(@RequestBody LocalDate startDate, @RequestBody LocalDate endDate){
        return abonnementService.retreiveSubscriptionsByDates(startDate,endDate);
    }
}
