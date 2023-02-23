package tn.esprit.ds.skilouay.Entities;

import javax.persistence.*;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numInscription;
    private int numSemaine;
    @ManyToOne
    private Cours cour;
    @ManyToOne()
    private Skieur skieur;
}
