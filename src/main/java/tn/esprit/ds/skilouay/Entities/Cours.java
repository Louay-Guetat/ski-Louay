package tn.esprit.ds.skilouay.Entities;

import javax.persistence.*;
import java.util.List;

enum TypeCours{
    COLLECTIF_ENFANT,COLLECTIF_PARENT,PARTICULIER
}

enum Support{
    SKI,SNOWBOARD
}
@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.ORDINAL)
    private Support support;
    private float prix;
    private int creneau;
    @OneToMany(mappedBy = "cour")
    private List<Inscription> inscriptions;

}
