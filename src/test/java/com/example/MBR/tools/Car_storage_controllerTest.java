package com.example.MBR.tools;

import com.example.MBR.Car_storage;
import com.example.MBR.entities.Car;
import com.example.MBR.entities.Mercedes;
import com.example.MBR.entities.Rent_period;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class Car_storage_controllerTest {

    @Mock
    private Car_storage car_storage;
    @InjectMocks
    private Car_storage_controller car_storage_controller;



    @Test
    public void test_storage_controller_exists() {

        assertNotNull(car_storage_controller);
    }

    @Test
    public void test_storage_controller_add_car() {

        Car test_car = new Mercedes();

        assertDoesNotThrow(() -> {
            car_storage_controller.rent_car(test_car);
        });
    }

}