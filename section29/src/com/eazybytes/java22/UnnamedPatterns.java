package com.eazybytes.java22;

public class UnnamedPatterns {

    public static void main(String[] args) {
        Vehicle vehicle = new Truck("Toyota");

        switch (vehicle) {
            case Car _ -> processCar(vehicle);
            case Bike _ -> processBike(vehicle);
            case Truck _ -> processTruck(vehicle);
        }
    }

    public static void processCar(Vehicle vehicle) {
        if(vehicle instanceof Car car) {
            System.out.println("Processing car model: " + car.getModel());
        }
    }

    public static void processBike(Vehicle vehicle) {
        if(vehicle instanceof Bike bike) {
            System.out.println("Processing bike brand: " + bike.getBrand());
        }
    }

    public static void processTruck(Vehicle vehicle) {
        if(vehicle instanceof Truck truck) {
            System.out.println("Processing truck manufacturer: " + truck.getManufacturer());
        }
    }

}





