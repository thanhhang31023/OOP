package xeTransport;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Viet Nam", "VinFast", 2021, 300, 4, "diesel"));
        cars.add(new Car("Ford", "Car", 2020, 400, 2, "petrol"));
        cars.add(new Car("Toyota", "SUV", 2019, 250, 5, "hybrid"));

        System.out.println("Thông tin các xe:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Xe thứ " + (i + 1) + ":");
            cars.get(i).display();
            System.out.println();
        }

        System.out.println("Xe có Speed Basic lớn nhất:");
        ArrayList<Car> maxSpeedBasicCars = Car.getCarHaveMaxSpeedBasic(cars);
        for (Car car : maxSpeedBasicCars) {
            car.display();
            System.out.println();
        }

        System.out.println("Xe có số chỗ ngồi nhiều nhất:");
        ArrayList<Car> maxSeatCars = Car.getCarHaveMaxSeat(cars);
        for (Car car : maxSeatCars) {
            car.display();
            System.out.println();
        }
    }
}