package xeTransport;

import java.util.ArrayList;

public class Car extends Transport{
    private int numberSeat;
    private String engineType;

    public Car() {}

    public Car(String manufacturer, String name, int year, int speed, int numberSeat, String engineType) {
        super(manufacturer, name, year, speed);
        this.numberSeat = numberSeat;
        this.engineType = engineType;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getSpeedBasic() {
        return (double) getSpeed() / numberSeat;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number Seat: " + numberSeat);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Speed Basic: " + getSpeedBasic());
    }

    public static ArrayList<Car> getCarHaveMaxSpeedBasic(ArrayList<Car> cars) {
        ArrayList<Car> maxSpeedBasicCars = new ArrayList<>();
        double maxSpeedBasic = Double.MIN_VALUE;

        for (Car car : cars) {
            if (car.getSpeedBasic() > maxSpeedBasic) {
                maxSpeedBasic = car.getSpeedBasic();
                maxSpeedBasicCars.clear();
                maxSpeedBasicCars.add(car);
            } else if (car.getSpeedBasic() == maxSpeedBasic) {
                maxSpeedBasicCars.add(car);
            }
        }

        return maxSpeedBasicCars;
    }

    public static ArrayList<Car> getCarHaveMaxSeat(ArrayList<Car> cars) {
        ArrayList<Car> maxSeatCars = new ArrayList<>();
        int maxSeat = Integer.MIN_VALUE;

        for (Car car : cars) {
            if (car.getNumberSeat() > maxSeat) {
                maxSeat = car.getNumberSeat();
                maxSeatCars.clear();
                maxSeatCars.add(car);
            } else if (car.getNumberSeat() == maxSeat) {
                maxSeatCars.add(car);
            }
        }

        return maxSeatCars;
    }
}

