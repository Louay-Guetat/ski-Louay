package tn.esprit.ds.skilouay.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.ds.skilouay.Entities.Abonnement;
import tn.esprit.ds.skilouay.Entities.Piste;
import tn.esprit.ds.skilouay.Entities.Skieur;
import tn.esprit.ds.skilouay.Entities.TypeAbonnement;
import tn.esprit.ds.skilouay.Repositories.AbonnementRepository;
import tn.esprit.ds.skilouay.Repositories.PisteRepository;
import tn.esprit.ds.skilouay.Repositories.SkieurRepository;

import java.util.List;

@Service
public class SkieurService implements ISkieurService{
    @Autowired
    SkieurRepository skieurRepository;
    @Autowired
    PisteRepository pisteRepository;
    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }
    @Override
    public Skieur updateSkieur(Skieur skieur){
         return skieurRepository.save(skieur);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        //Recuperation des objets
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"Skieur must be not null");
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Assert.notNull(piste,"Piste must be not null");
        //verification non null
        //Traitement
        piste.getSkieurs().add(skieur);
        /*List<Piste> pistes = skieur.getPistes();
        pistes.add(piste);
        skieur.setPistes(pistes);*/
        //save
        pisteRepository.save(piste);
        return skieurRepository.findById(numSkieur).orElse(null);
    }

    @Override
    public Skieur AssignSkierToSubscription(long numSkieur, long numAbon) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"Skieur must be not null");
        Abonnement abonnement = abonnementRepository.findById(numAbon).orElse(null);
        Assert.notNull(abonnement,"Abonnement must be not null");
        skieur.setAbonnement(abonnement);
        return skieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepository.findByAbonnementTypeAbon(typeAbonnement);
    }

}
