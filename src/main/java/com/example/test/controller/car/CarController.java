package com.example.test.controller.car;

import com.example.test.model.Car;
import com.example.test.request.CreateCarRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.ResourceAccessException;

import java.util.Random;
import java.util.Vector;

@RestController
@RequestMapping(value = "/car")
public class CarController {
    Vector<Car> myCars = new Vector<>();

    @GetMapping(value = "/get-cars")
    public ResponseEntity<Vector<Car>> getCar() {
        try {
            ResponseEntity<Vector<Car>> response = ResponseEntity.status(HttpStatus.OK).body(myCars);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @PostMapping(value = "/create-car")
    public ResponseEntity<CreateCarRequest> createCar(@RequestBody CreateCarRequest createCar){
        try {
            if (createCar.getName() == null || createCar.getPrice() == null || createCar.getManufacturer() == null || createCar.getIsAvailable() == null){
                throw new ResourceAccessException("Fill the required information!");
            }
            Car newCar = createCar.createCarObj();
            CreateCarRequest tmpCar = new CreateCarRequest(newCar.getName(), newCar.getPrice(), newCar.getManufacturer(), newCar.getHorsepower(), newCar.getIsAvailable());

            myCars.add(newCar);

            ResponseEntity response = ResponseEntity.status(HttpStatus.OK).body(tmpCar);
            return response;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }
}
