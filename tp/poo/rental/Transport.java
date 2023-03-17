package tp.poo.rental;

public class Transport {
    private int date;
    private int dateVente;

    public Transport(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDateVente() {
        return dateVente;
    }

    public void setDateVente(int dateVente) {
        this.dateVente = dateVente;
    }

}
