package team1.demo;

public class Data {
    private long Nr;
    private String ievaditie_dati;

    public long getId() {
        return Nr;
    }

    public void setId(long id) {
        this.Nr = id;
    }

    public String getIevaditie_dati() {
        return ievaditie_dati;
    }

    public void setIevaditie_dati(String ievaditie_dati) {
        this.ievaditie_dati = ievaditie_dati;
    }

    @Override
    public String toString() {
        return "Data{" +
                "Nr=" + Nr +
                ", Dati='" + ievaditie_dati + '\'' +
                '}';
    }

    public static Data create(String ievade) {
        Data data = new Data();
        data.setIevaditie_dati(ievade);
        return data;
    }
}
