package tn.esprit.ds.skilouay.Services;

import tn.esprit.ds.skilouay.Entities.Abonnement;
import tn.esprit.ds.skilouay.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();
    Abonnement addAbonnement(Abonnement abonnement);
    void removeAbonnement (Long numAbon);
    Abonnement retrieveAbonnement (Long numAbon);
    Abonnement updateAbonnement(Abonnement abonnement);
    Set<Abonnement> getSubscriptionByType(TypeAbonnement typeAbonnement);
    List<Abonnement> retreiveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);
}
