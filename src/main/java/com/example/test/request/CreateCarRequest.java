package com.example.test.request;

import com.example.test.model.Car;

import static com.example.test.helper.RandomHelper.generateRandomString;

public class CreateCarRequest {
    private String name;
    private Double price;
    private String manufacturer;
    private Integer horsepower;
    private Boolean isAvailable;

    // Constructor to initialize fields
    public CreateCarRequest(String name, Double price, String manufacturer, Integer horsepower, Boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.horsepower = horsepower;
        this.isAvailable = isAvailable;
    }

    // Default constructor
    public CreateCarRequest() {
    }

    // Getter and Setter methods

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

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }


    public Car createCarObj(){
        Car car = new Car();
        car.setId(generateRandomString(10));
        car.setName(this.getName());
        car.setPrice(this.getPrice());
        car.setManufacturer(this.getManufacturer());
        car.setHorsepower(this.getHorsepower());
        car.setIsAvailable(this.getIsAvailable());

        return car;
    }

}
