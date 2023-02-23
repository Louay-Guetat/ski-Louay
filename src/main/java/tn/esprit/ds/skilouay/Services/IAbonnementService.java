package tn.esprit.ds.skilouay.Services;

import tn.esprit.ds.skilouay.Entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    void removeAbonnement (Long numAbon);
    Abonnement retrieveAbonnement (Long numAbon);
    Abonnement updateAbonnement(Abonnement abonnement);
}
