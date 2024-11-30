package com.example.MBR.entities;


import java.util.ArrayList;


public class Honda implements Car {
    private int id;
    private String name = "Honda";
    private String type = "Civic";
    private ArrayList<Rent_period> rent_periods = new ArrayList<>();

    public Honda(int id) {
        this.id = id;
    }
    public Honda() {}


    public void rent(Rent_period period) {
        rent_periods.add(period);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



//    @Override
//    public DateTime get_date_from() {
//        return null;
//    }
//
//    @Override
//    public DateTime get_date_to() {
//        return null;
//    }

    @Override
    public ArrayList<Rent_period> get_dates() {
        return rent_periods;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}
