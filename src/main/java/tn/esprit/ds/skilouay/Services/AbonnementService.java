package tn.esprit.ds.skilouay.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.skilouay.Entities.Abonnement;
import tn.esprit.ds.skilouay.Entities.TypeAbonnement;
import tn.esprit.ds.skilouay.Repositories.AbonnementRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class AbonnementService implements IAbonnementService{
    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public void removeAbonnement(Long numAbon) {
        abonnementRepository.deleteById(numAbon);
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbon) {
        return abonnementRepository.findById(numAbon).orElse(null);
    }
    @Override
    public Abonnement updateAbonnement(Abonnement abonnement){
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement typeAbonnement) {
        return abonnementRepository.findByTypeAbonOrderByDateDebut(typeAbonnement);
    }

    @Override
    public List<Abonnement> retreiveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return abonnementRepository.findByDateDebutAndDateFin(startDate,endDate);
    }
}
