package kz.aitu.oop.practice.practice2;

public class Locomotive extends TrainCar {
    private String type;

    public Locomotive(int capacity, String type) {
        super(capacity);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}