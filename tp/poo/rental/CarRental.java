package tp.poo.rental;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.time.LocalDate;
import java.util.Optional;

public class CarRental {
    //private List<Car> listCar;
    private List<Transport> listCar;

    public CarRental(){
        this.listCar = new ArrayList<>();
    }

    /*public void add(Car car){
        Car newCar = Objects.requireNonNull(car, "Car must be not null");
        this.listCar.add(newCar);
    }*/
    public void add(Transport transport){
        Transport newtrans = Objects.requireNonNull(transport, "Car must be not null");
        this.listCar.add(newtrans);
    }
    public void remove(Transport transport){
        if(this.listCar.contains(transport)){
            this.listCar.remove(transport);
        }else{
            throw new IllegalStateException();
        }
    }
    public List<Transport> toSell(){
        List<Transport> carToSell = new ArrayList<>();
        int currentYear = LocalDate.now().getYear();
        for(Transport trans: this.listCar){
            if(trans.getDate() <= currentYear - trans.getDateVente()){
                carToSell.add(trans);
            }
        }
        return carToSell;
    }

    public Optional<Car> findACarByModel(String modele){
        for(Transport transport: listCar){
            if(transport instanceof Car){
                if(((Car) transport).getModele() == modele){
                     return Optional.of((Car) transport);
                }
            }
        }
        return Optional.empty();
    }
    @Override
    public String toString() {
        String display = "";
        for (Transport trans: listCar) {
            display += trans.toString() + "\n" ;
        }
        return display.trim() ;
    }
}
