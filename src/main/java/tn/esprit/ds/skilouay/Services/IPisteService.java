package tn.esprit.ds.skilouay.Services;

import tn.esprit.ds.skilouay.Entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste (Piste piste);
    void removePiste (Long numPiste);
    Piste retrievePiste (Long numPiste);
    Piste updatePiste(Piste piste);
}
