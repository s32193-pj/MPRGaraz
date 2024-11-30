package com.example.MBR;

import com.example.MBR.entities.Car;
import com.example.MBR.entities.Honda;
import com.example.MBR.entities.Mercedes;
import com.example.MBR.entities.Rent_period;
import com.example.MBR.tools.Car_storage_controller;
import com.example.MBR.tools.Car_storage_comparator;
import org.joda.time.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class MbrSpringApplication {

    public MbrSpringApplication(Car_storage_controller car_storage_controller) {

        Car test_car = new Mercedes();
        Rent_period rent_period = new Rent_period();
        rent_period.setDate_from(new DateTime(new Date(2024,8,13)));
        rent_period.setDate_to(new DateTime(new Date(2024,8,15)));
        test_car.rent(rent_period);
        test_car.setId(1);

        Car_storage_comparator comparator = new Car_storage_comparator();

        Car test_car2 = new Honda(2);
        Car test_car3 = new Honda();


        while(car_storage_controller.keep_app_alive()){

          int action = car_storage_controller.choose_action();
          switch (action){
              case 1:
                  car_storage_controller.kill_app();
                  break;
              case 2:
                  car_storage_controller.get_cars_from_storage();
                  break;
              case 3:
                  car_storage_controller.rent_car(test_car);
                  break;
              case 4:
                  car_storage_controller.add_car_to_storage(test_car);
                  break;
              case 5:
                  car_storage_controller.remove_car_from_storage(test_car2);
                  break;

          }
      }
    }


    public static void main(String[] args) {
		SpringApplication.run(MbrSpringApplication.class, args);
	}

}
