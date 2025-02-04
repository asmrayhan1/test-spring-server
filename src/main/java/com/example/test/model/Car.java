package com.example.test.model;

public class Car {
    private String id;
    private String name;
    private Double price;
    private String manufacturer;
    private Integer year;
    private String color;
    private Double engineSize;
    private String fuelType;
    private Integer horsepower;
    private Integer seats;
    private String transmission;
    private Boolean isAvailable;

    // Default constructor
    public Car() {
        this.id = "";
        this.name = "";
        this.price = 0.0;
        this.manufacturer = "";
        this.year = 0;
        this.color = "";
        this.engineSize = 0.0;
        this.fuelType = "";
        this.horsepower = 0;
        this.seats = 0;
        this.transmission = "";
        this.isAvailable = false;
    }

    // Parameterized constructor
    public Car(String id, String name, Double price, String manufacturer,
               Integer year, String color, Double engineSize, String fuelType,
               Integer horsepower, Integer seats, String transmission, Boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.horsepower = horsepower;
        this.seats = seats;
        this.transmission = transmission;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(Double engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Optionally, you can add a toString() method to easily print the Car object
    @Override
    public String toString() {
        return "Car [id=" + id + ", name=" + name + ", price=" + price + ", manufacturer=" + manufacturer +
                ", year=" + year + ", color=" + color + ", engineSize=" + engineSize + ", fuelType=" + fuelType +
                ", horsepower=" + horsepower + ", seats=" + seats + ", transmission=" + transmission + ", isAvailable=" + isAvailable + "]";
    }
}
