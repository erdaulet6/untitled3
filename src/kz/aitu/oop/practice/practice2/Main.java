package kz.aitu.oop.practice.practice2;


public class Main {
    public static void main(String[] args) {

        Locomotive locomotive = new Locomotive(70, "Electric");
        PassengerCar passengerCar1 = new PassengerCar(40, 101);
        PassengerCar passengerCar2 = new PassengerCar(45, 100);


        Train train = new Train();
        train.addCar(locomotive);
        train.addCar(passengerCar1);
        train.addCar(passengerCar2);

        int totalCapacity = train.calculateTotalCapacity();
        int totalPassengers = train.calculateTotalPassengers();

        System.out.println("Total Train Capacity: " + totalCapacity);
        System.out.println("Total Passengers: " + totalPassengers);
    }
}