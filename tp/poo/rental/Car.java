package tp.poo.rental;

public class Car extends Transport{
    private String modele;

    public Car(String modele, int date) {
        super(date);
        this.modele = modele;
        setDateVente(2);
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

   /* public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }*/

    @Override
    public String toString() {
        return this.modele +" "+ this.getDate();
    }
}
