package com.example.test.service;

import com.example.test.model.Car;
import com.example.test.repository.CarRepository;
import com.example.test.request.CreateCarRequest;
import com.example.test.request.UpdateCarRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import java.util.Vector;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public Vector<Car> getCars(){
        return carRepository.getAllCar();
    }

    public Car getCarById(String carId){
        return carRepository.getCarById(carId);
    }

    public Car createCar(CreateCarRequest createCarRequest){
        if(createCarRequest.getName() == null || createCarRequest.getManufacturer().isEmpty()){
            throw new ResourceAccessException("Name & manufacturer must be filled");
        }
        Car car = createCarRequest.createCarObj();
        carRepository.createCar(car);
        return car;
    }

    public Car updateCar(UpdateCarRequest updateCarRequest, String carId){
        if(updateCarRequest.getName() == null || updateCarRequest.getManufacturer().isEmpty()){
            throw new ResourceAccessException("Title must be filled");
        }

        Car existingCar = carRepository.getCarById(carId);
        existingCar.setName(updateCarRequest.getName());
        if(updateCarRequest.getPrice() != null){
            existingCar.setPrice(updateCarRequest.getPrice());
        }
        if(updateCarRequest.getManufacturer() != null){
            existingCar.setManufacturer(updateCarRequest.getManufacturer());
        }
        carRepository.updateCar(existingCar, carId);
        return existingCar;
    }

    public boolean deleteCar(String carId){
        return carRepository.deleteCar(carId);
    }
}
