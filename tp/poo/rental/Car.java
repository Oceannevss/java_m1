package tp.poo.rental;

import java.util.Objects;

public class Car extends Transport{
    private String modele;

    public Car(String modele, int date) {
        super(date);
        if(modele == null){
            throw new NullPointerException();
        }else{
            this.modele = modele;
        }
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
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getDate() == car.getDate() && Objects.equals(modele, car.modele);
    }

}
