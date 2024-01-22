package kz.aitu.oop.practice.practice2;

public class PassengerCar extends TrainCar {
    private int numberOfPassengers;

    public PassengerCar(int capacity, int numberOfPassengers) {
        super(capacity);
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}