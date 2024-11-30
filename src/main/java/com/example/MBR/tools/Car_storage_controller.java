package com.example.MBR.tools;

import com.example.MBR.Car_storage;
import com.example.MBR.entities.Car;
import org.springframework.stereotype.Component;
import java.util.Scanner;


@Component
public class Car_storage_controller {

    private boolean keep_alive = true;
    private final Car_storage car_storage;

    public Car_storage_controller(Car_storage car_storage) {
        this.car_storage = car_storage;
    }


    public void add_car_to_storage(Car car){
        car.setId(car_storage.getCars().size()+1);
        car_storage.add_car(car);
    }

    public void rent_car(Car car){
        car_storage.rent_car(car);
    }

    public void get_cars_from_storage(){
        System.out.println(car_storage.toString());
    }



    public void remove_car_from_storage(Car car) {
        car_storage.remove_car(car);
    }
}
