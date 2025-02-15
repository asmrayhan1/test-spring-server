package com.example.test.controller.car;

import com.example.test.model.Car;
import com.example.test.request.CreateCarRequest;
import com.example.test.request.UpdateCarRequest;
import com.example.test.service.CarService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Vector;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    private final CarService carService;
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping(value = "/get-cars")
    public ResponseEntity<Vector<Car>> getCar() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carService.getCars());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @GetMapping(value = "/get-car-by-id/{id}")
    public Car getCarById(@PathVariable String id) {
        return carService.getCarById(id);
    }

    @PostMapping(value = "/create-car")
    public ResponseEntity<Car> createCar(@RequestBody CreateCarRequest createCar){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carService.createCar(createCar));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @PutMapping(value = "/update-car/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable String id, @RequestBody UpdateCarRequest updateCarRequest) {
        // Car car = myCars.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carService.updateCar(updateCarRequest, id));
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    @DeleteMapping(value = "/delete-car/{id}")
    public ResponseEntity<Boolean> deleteCar(@PathVariable String id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carService.deleteCar(id));
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }
}
