package tn.esprit.ds.skilouay.Services;

import tn.esprit.ds.skilouay.Entities.Skieur;

import java.util.List;

public interface ISkieurService{
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);
    Skieur updateSkieur(Skieur skieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
}
