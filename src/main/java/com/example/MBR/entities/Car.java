package com.example.MBR.entities;


import java.util.ArrayList;


public interface Car {
    public String getType();
    public String getName();
    public int getId();
    public void setId(int id);
    public void rent(Rent_period rentPeriod);
//    public DateTime get_date_from();
//    public DateTime get_date_to();
    public ArrayList<Rent_period> get_dates();

}
