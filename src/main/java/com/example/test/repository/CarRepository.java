package com.example.test.repository;
import com.example.test.model.Car;
import org.springframework.stereotype.Repository;

import java.util.Objects;
import java.util.Vector;

@Repository
public class CarRepository {
    Vector<Car> myCars = new Vector<>();

    public Vector<Car> getAllCar() {
        return this.myCars;
    }

    public Car getCarById(String carId){
        for (int i = 0; i < myCars.size(); i++){
            if(Objects.equals(myCars.get(i).getId(), carId)){
                return myCars.get(i);
            }
        }
        return null;
    }

    public Car createCar(Car car){
        if(car.getId() == null){
            throw new NullPointerException("Id must not be null");
        }
        this.myCars.add(car);
        return car;
    }

    public Car updateCar(Car updatedCar, String carId){
        if(updatedCar.getId() == null){
            throw new NullPointerException("Id must not be null");
        }
        for (int i = 0; i < myCars.size(); i++){
            if(Objects.equals(myCars.get(i).getId(), carId)){
                myCars.set(i, updatedCar);
                break;
            }
        }
        return updatedCar;
    }

    public boolean deleteCar(String carId){
        int index = -1;
        for (int i = 0; i < myCars.size(); i++){
            if(Objects.equals(myCars.get(i).getId(), carId)){
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        } else {
            myCars.remove(index);
            return true;
        }
    }
}
