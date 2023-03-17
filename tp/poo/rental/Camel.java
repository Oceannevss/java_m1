package tp.poo.rental;

public class Camel extends Transport {

    //private int dateDeNaissance;

    public Camel(int date) {
        super(date);
        setDateVente(5);
    }

    /*public int getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(int dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }*/

    @Override
    public String toString() {
        return "camel "+ this.getDate();
    }

}
