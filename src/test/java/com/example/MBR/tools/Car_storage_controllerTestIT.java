package com.example.MBR.tools;

import com.example.MBR.Car_storage;
import com.example.MBR.entities.Car;
import com.example.MBR.entities.Mercedes;
import com.example.MBR.entities.Rent_period;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Car_storage_controllerTestIT {

    @Autowired
    Car_storage car_storage;
    Car car;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @Test
    public void rent_car_test() {
        Car_storage_controller car_storage_controller = new Car_storage_controller(car_storage);
        Car test_car = new Mercedes();
        Rent_period rent_period = new Rent_period();
        rent_period.setDate_from(LocalDate.of(2024, 8, 10));
        rent_period.setDate_to(LocalDate.of(2024, 8, 12));
        test_car.rent(rent_period);
        test_car.setId(1);

        car_storage_controller.rent_car(test_car);

        assertEquals(test_car.getName(), car_storage.getCars().get(0).getName());
        assertEquals(test_car.getId(), car_storage.getCars().get(0).getId());
        assertEquals(test_car.getType(), car_storage.getCars().get(0).getType());
        assertEquals(test_car.get_dates(), car_storage.getCars().get(0).get_dates());

    }

    @Test
    public void car_storage_controller_toString() {
        Car_storage_controller car_storage_controller = new Car_storage_controller(car_storage);
        Car test_car = new Mercedes();
        Rent_period rent_period = new Rent_period();
        rent_period.setDate_from(LocalDate.of(2024, 8, 10));
        rent_period.setDate_to(LocalDate.of(2024, 8, 12));
        test_car.rent(rent_period);
        test_car.setId(1);

        car_storage_controller.rent_car(test_car);

        car_storage_controller.get_cars_from_storage();

        assertEquals(test_car.toString(), outContent.toString());

    }


}