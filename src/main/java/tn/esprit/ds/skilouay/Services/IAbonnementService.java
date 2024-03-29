package tn.esprit.ds.skilouay.services;

import tn.esprit.ds.skilouay.Entities.Abonnement;
import tn.esprit.ds.skilouay.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface IAbonnementService {

    List<Abonnement> retrieveAllAbonnement();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Optional<Abonnement> retrieveAbonnement(Long numAbon);

    void removeAbonnement(Long numAbon);
    Set<Abonnement> getSubscriptionByType(TypeAbonnement typeAbonnement);
    List<Abonnement> findSubscriptionByDateDebutBetween(LocalDate startDate, LocalDate endDate);
}
