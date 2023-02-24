package tn.esprit.ds.skilouay.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.skilouay.Entities.Piste;
import tn.esprit.ds.skilouay.Entities.Skieur;
import tn.esprit.ds.skilouay.Repositories.PisteRepository;
import tn.esprit.ds.skilouay.Repositories.SkieurRepository;

import java.util.List;

@Service
public class SkieurService implements ISkieurService{
    @Autowired
    SkieurRepository skieurRepository;
    @Autowired
    PisteRepository pisteRepository;
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
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        //verification non null
        if(skieur != null && piste != null){
            //Traitement
            piste.getSkieurs().add(skieur);
            /*List<Piste> pistes = skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes);*/

            //save
            pisteRepository.save(piste);
        }
        return skieurRepository.findById(numSkieur).orElse(null);
    }

}
