package tn.esprit.ds.skilouay.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ds.skilouay.Entities.Inscription;
import tn.esprit.ds.skilouay.Repositories.InscriptionRepository;

import java.util.List;
@Service
public class InscriptionService implements IInscriptionService{
    @Autowired
    InscriptionRepository inscriptionRepository;
    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepository.save(inscription);
    }

    @Override
    public void removeInscription(Long numInscription) {
        inscriptionRepository.deleteById(numInscription);
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return inscriptionRepository.findById(numInscription).orElse(null);
    }
    @Override
    public Inscription updateInscription(Inscription inscription){
        return inscriptionRepository.save(inscription);
    }
}
