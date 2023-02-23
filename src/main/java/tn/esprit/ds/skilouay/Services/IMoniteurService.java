package tn.esprit.ds.skilouay.Services;

import tn.esprit.ds.skilouay.Entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur (Moniteur moniteur);
    void removeMoniteur (Long numMoniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
}
