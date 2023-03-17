package tp.poo.rental;

public class Main {
    public static void main(String[] args) {
        Car mustang = new Car("ford mustang", 2014);
        Car s = new Car("s", 2021);
        Car t = new Car("t", 2022);
        System.out.println(mustang);

        CarRental rental = new CarRental();
        rental.add(mustang);
        rental.add(s);
        rental.add(t);

        System.out.println(rental);
        System.out.println(rental.findACarByModel("s"));
    }
}
