package kz.aitu.oop.practice.practice2;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<TrainCar> cars;
    private static final int max_passengers = 200;
    public Train() {
        this.cars = new ArrayList<>();
    }

    public void addCar(TrainCar car) {
        if (car instanceof Locomotive ){

            cars.add(car);
        }
        else if (car instanceof PassengerCar && calculateTotalPassengers() + ((PassengerCar) car).getNumberOfPassengers() <= max_passengers)
        {

            cars.add(car);

        } else{

            System.out.println("ERROR");
        }




    }

    public int calculateTotalCapacity() {
        int totalCapacity = 0;
        for (TrainCar car : cars) {
            totalCapacity += car.getCapacity();
        }
        return totalCapacity;
    }

    public int calculateTotalPassengers() {
        int totalPassengers = 0;
        for (TrainCar car : cars) {
            if (car instanceof PassengerCar) {
                totalPassengers += ((PassengerCar) car).getNumberOfPassengers();
            }
        }
        return totalPassengers;
    }
}