package com.example.MBR.entities;


import java.time.Duration;
import java.time.LocalDate;


public class Rent_period {
    private LocalDate date_from;
    private LocalDate date_to;

    public Duration returnDuration(){
        return Duration.between(date_from, date_to);
    }

    public LocalDate getDate_from() {
        return date_from;
    }

    public LocalDate getDate_to() {
        return date_to;
    }

    public void setDate_from(LocalDate date_from) {
        this.date_from = date_from;
    }

    public void setDate_to(LocalDate date_to) {
        this.date_to = date_to;
    }

    @Override
    public String toString() {
        return "Rent_period{" +
                "date_from=" + date_from +
                ", date_to=" + date_to +
                '}';
    }
}
