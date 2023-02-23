package tn.esprit.ds.skilouay.Entities;

import javax.persistence.*;
import java.util.List;


enum Couleur{
    VERT,BLEU,ROUGE,NOIR
}
@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int longeur;
    private int pente;
    @ManyToMany()
    private List<Skieur> skieurs;
}
