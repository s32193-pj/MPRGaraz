package com.example.MBR.entities;
import java.util.ArrayList;


public class Mercedes implements Car{
    private int id;
    private String name = "Mercedes";
    private String type = "Bęc";
    private ArrayList<Rent_period> rent_periods = new ArrayList<>();

    public Mercedes(int id) {
        this.id = id;
    }

    public Mercedes() {
    }

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
//
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
