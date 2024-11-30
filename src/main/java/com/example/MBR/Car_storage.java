package com.example.MBR;

import com.example.MBR.entities.Car;
import com.example.MBR.entities.Honda;
import com.example.MBR.entities.Mercedes;
import com.example.MBR.tools.Car_storage_comparator;
import org.joda.time.Interval;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Car_storage {

    Car_storage_comparator comparator;
    ArrayList<Car> cars;


    public Car_storage() {
            cars = new ArrayList<>();
            cars.add(new Mercedes(1));
            cars.add(new Honda(2));
            comparator = new Car_storage_comparator();
    }

    public void rent_car(Car car) {
        boolean rented = false;
        for (int i = 0; i < cars.size(); i++) {
            if (comparator.is_the_same(cars.get(i), car)) {

                Interval interval;
                Interval car_interval = new Interval(car.get_dates().get(0).getDate_from(),car.get_dates().get(0).getDate_to());

                for (int j = 0; j < cars.get(i).get_dates().size(); j++) {

                    interval = new Interval(cars.get(i).get_dates().get(j).getDate_from(), cars.get(i).get_dates().get(j).getDate_to());

                    if (interval.contains(car_interval)) {
                        rented = true;
                    }
                    if (interval.contains(car_interval)) {
                        rented = true;
                    }
                }
            }
        }
        if(rented){
            System.out.println("Car already rented");
        }else {
            for(int i = 0; i < cars.size(); i++){
                if(comparator.is_the_same(cars.get(i), car)){
                    cars.get(i).rent(car.get_dates().get(0));
                    System.out.println(cars.get(i).get_dates().get(0).toString());
                }
            }
            System.out.println("Car now rented");
        }

    }


    public ArrayList<Car> getCars() {
        return cars;
    }

    public void add_car(Car car) {
        cars.add(car);
    }

    public void remove_car(Car car) {
        cars.remove(car);
        for(int i = 0; i < cars.size(); i++){
            if(comparator.is_the_same(cars.get(i), car)){
                cars.remove(i);
            }
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Car_storage:\n");
        for (Car car : cars) {
            sb.append("Name: " + car.getName() + "\n");
            sb.append("Type: " + car.getType() + "\n");
            sb.append("ID: " + car.getId() + "\n");
        }

        return sb.toString();
    }
}
