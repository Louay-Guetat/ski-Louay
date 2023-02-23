package tn.esprit.ds.skilouay.Entities;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;

enum TypeAbonnement{
    ANNUEL,SEMESTRIEL,MENSUEL
}
@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbon;
    private TypeAbonnement typeAbon;
}
