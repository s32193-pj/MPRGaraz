package com.example.MBR.entities;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Rent_period {
    private DateTime date_from;
    private DateTime date_to;
    DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");

    public DateTime getDate_from() {
        return date_from;
    }

    public DateTime getDate_to() {
        return date_to;
    }

    public void setDate_from(DateTime date_from) {
        this.date_from = date_from;
    }

    public void setDate_to(DateTime date_to) {
        this.date_to = date_to;
    }

    @Override
    public String toString() {
        return "Rent_period{" +
                "date_from=" + fmt.print(date_from) +
                ", date_to=" + fmt.print(date_to) +
                '}';
    }
}
