package team1.demo.entity.Datubaze;


import org.springframework.context.annotation.Bean;

import javax.persistence.*;


@javax.persistence.Entity
@Table(name = "Datubaze")
public class Datubaze {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Nr;
    @Column
    private String Ievaditie_dati;


    public Datubaze(){}
    public void setIevaditie_dati(String Ievaditie_dati) {
        this.Ievaditie_dati = Ievaditie_dati;
    }

    public int getNr() {
        return Nr;
    }

    public void setNr(int Nr) {
        this.Nr = Nr;
    }

    public String getIevaditie_dati() {
        return Ievaditie_dati;
    }

    public static Datubaze create(String Ievaditie_dati) {
        Datubaze Datubaze = new Datubaze();
        Datubaze.setIevaditie_dati(Ievaditie_dati);
        return Datubaze;}
    @Override
    public String toString() {
        return "Datubaze{" +
                "Nr=" + Nr +
                ", Ievaditie_dati='" + Ievaditie_dati + '\'' +
                '}';}
}
