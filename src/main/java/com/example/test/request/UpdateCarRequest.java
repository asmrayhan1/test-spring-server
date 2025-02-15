package com.example.test.request;

public class UpdateCarRequest {
    private String name;
    private Double price;
    private String manufacturer;
    private Integer horsepower;
    private Boolean isAvailable;

    // Constructor to initialize fields
    public UpdateCarRequest(String name, Double price, String manufacturer, Integer horsepower, Boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.horsepower = horsepower;
        this.isAvailable = isAvailable;
    }

    // Default constructor
    public UpdateCarRequest() {
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
}
