package com.example.MBR.tools;

import com.example.MBR.entities.Car;
import com.example.MBR.entities.Rent_period;
import org.springframework.stereotype.Component;

@Component
public class Car_storage_comparator {

    public boolean is_the_same(Car o1, Car o2) {
        boolean is_the_same = true;

        if(!o1.getName().equals(o2.getName())) {
            is_the_same = false;
        }
        if(!o1.getType().equals(o2.getType())) {
            is_the_same = false;
        }
        if(!(o1.getId() == o2.getId())){
            is_the_same = false;
        }

        return is_the_same;
    }

    public long overlap(Rent_period o1, Rent_period o2) {

        return Math.min(o1.getDate_to().toEpochDay(), o2.getDate_to().toEpochDay()) -
                Math.max(o1.getDate_from().toEpochDay(), o2.getDate_from().toEpochDay());
    }


}
