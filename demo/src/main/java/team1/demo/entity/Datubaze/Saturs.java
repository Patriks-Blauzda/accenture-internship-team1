package team1.demo.entity.Datubaze;


import org.springframework.context.annotation.Bean;

import javax.persistence.*;


@Entity
@Table
public class Saturs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Nr;
    @Column
    private String Ievaditie_dati;

    public Saturs(){}//Constructor

    public Saturs(String Ievaditie_dati){
        this.Ievaditie_dati = Ievaditie_dati;
    }

    public Long getNr() {
        return Nr;
    }

    public void setNr(Long Nr) {
        this.Nr = Nr;
    }

    public String getIevaditie_dati() {
        return Ievaditie_dati;
    }

    public void setIevaditie_dati(String Ievaditie_dati) {
        this.Ievaditie_dati = Ievaditie_dati;
    }


}
