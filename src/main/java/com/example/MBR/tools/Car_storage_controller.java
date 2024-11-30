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

    public int choose_action(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your action: ");
        int action = scan.nextInt();

        return action;
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



    public boolean keep_app_alive(){
        return keep_alive;
    }

    public void kill_app(){
        keep_alive = false;
    }

    public void remove_car_from_storage(Car car) {
        car_storage.remove_car(car);
    }
}
