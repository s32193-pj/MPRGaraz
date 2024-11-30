package com.example.MBR;

import com.example.MBR.entities.Car;
import com.example.MBR.entities.Mercedes;
import com.example.MBR.entities.Rent_period;
import com.example.MBR.tools.Car_storage_controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;


@SpringBootApplication
public class MbrSpringApplication {

    public MbrSpringApplication(Car_storage_controller car_storage_controller) {

        Car test_car = new Mercedes();
        Rent_period rent_period = new Rent_period();
        rent_period.setDate_from(LocalDate.of(2024,8,10));
        rent_period.setDate_to(LocalDate.of(2024,8,12));
        test_car.rent(rent_period);
        test_car.setId(1);

        Car test_car2 = new Mercedes();
        Rent_period rent_period2 = new Rent_period();
        rent_period2.setDate_from(LocalDate.of(2024,8,13));
        rent_period2.setDate_to(LocalDate.of(2024,8,14));
        test_car2.rent(rent_period2);
        test_car2.setId(1);

//        Car test_car3 = new Mercedes();
//        Rent_period rent_period3 = new Rent_period();
//        rent_period3.setDate_from(LocalDate.of(2024,8,8));
//        rent_period3.setDate_to(LocalDate.of(2024,8,13));
//        test_car3.rent(rent_period3);
//        test_car3.setId(1);
//
//        Car test_car4 = new Mercedes();
//        Rent_period rent_period4 = new Rent_period();
//        rent_period4.setDate_from(LocalDate.of(2024,8,13));
//        rent_period4.setDate_to(LocalDate.of(2024,8,20));
//        test_car4.rent(rent_period4);
//        test_car4.setId(1);
//
//        Car test_car5 = new Mercedes();
//        Rent_period rent_period5 = new Rent_period();
//        rent_period5.setDate_from(LocalDate.of(2024,8,12));
//        rent_period5.setDate_to(LocalDate.of(2024,8,14));
//        test_car5.rent(rent_period5);
//        test_car5.setId(1);
//
//        Car test_car6 = new Mercedes();
//        Rent_period rent_period6 = new Rent_period();
//        rent_period6.setDate_from(LocalDate.of(2024,8,15));
//        rent_period6.setDate_to(LocalDate.of(2024,8,17));
//        test_car6.rent(rent_period6);
//        test_car6.setId(1);
//
//        Car test_car7 = new Mercedes();
//        Rent_period rent_period7 = new Rent_period();
//        rent_period7.setDate_from(LocalDate.of(2024,8,8));
//        rent_period7.setDate_to(LocalDate.of(2024,8,10));
//        test_car7.rent(rent_period7);
//        test_car7.setId(1);


//        car_storage_controller.rent_car(test_car);
        car_storage_controller.rent_car(test_car);
        car_storage_controller.rent_car(test_car2);
//        car_storage_controller.rent_car(test_car3);
//        car_storage_controller.rent_car(test_car4);
//        car_storage_controller.rent_car(test_car5);
//        car_storage_controller.rent_car(test_car6);
//        car_storage_controller.rent_car(test_car7);



    }


    public static void main(String[] args) {
		SpringApplication.run(MbrSpringApplication.class, args);
	}

}
