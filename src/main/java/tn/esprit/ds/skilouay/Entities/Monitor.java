package tn.esprit.ds.skilouay.Entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@javax.persistence.Entity
public class Monitor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long numMonitor;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;

    @OneToMany()
    public List<Cours> cours;
}
