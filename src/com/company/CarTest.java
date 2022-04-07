package com.company;

public class CarTest {
    public static void main(String[] args) {
        Car newCar = new Car();
        newCar.carName = "BMW";
        newCar.model = "M2";
        newCar.power = 111;
        newCar.printInfo();

        Car newCar2 = new Car();
        newCar2.carName = "BMW";
        newCar2.model = "M3";
        newCar2.power = 222;
        newCar2.printInfo();

        Car newCar3 = new Car();
        newCar3.carName = "BMW";
        newCar3.model = "M5";
        newCar3.power = 333;
        newCar3.printInfo();
    }
}