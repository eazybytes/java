package com.eazybytes.java22;

public sealed interface Vehicle permits Car, Bike, Truck {

}

final class Bike implements Vehicle {
    private final String brand;

    public Bike(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

final class Car implements Vehicle {
    private final String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

final class Truck implements Vehicle {
    private final String manufacturer;

    public Truck(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
