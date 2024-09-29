package org.coookies.crctc.dao;

import java.time.LocalDate;


public class TrainSchedule {

    String toCity;
    String fromCity;
    LocalDate journeyDate;

    public TrainSchedule(String toCity, String fromCity, LocalDate journeyDate) {
        this.toCity = toCity;
        this.fromCity = fromCity;
        this.journeyDate = journeyDate;
    }


    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public LocalDate getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(LocalDate journeyDate) {
        this.journeyDate = journeyDate;
    }
}
