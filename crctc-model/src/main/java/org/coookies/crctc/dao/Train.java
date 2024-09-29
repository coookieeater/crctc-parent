package org.coookies.crctc.dao;

public class Train {

    String name;
    Integer capacity;
    Integer available;
    Integer filled;
    Integer price;
    TrainSchedule trainSchedule;

    public Train(Integer capacity, String name, Integer available, Integer filled, Integer price, TrainSchedule trainSchedule) {
        this.capacity = capacity;
        this.name = name;
        this.available = available;
        this.filled = filled;
        this.price = price;
        this.trainSchedule = trainSchedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getFilled() {
        return filled;
    }

    public void setFilled(Integer filled) {
        this.filled = filled;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public TrainSchedule getTrainSchedule() {
        return trainSchedule;
    }

    public void setTrainSchedule(TrainSchedule trainSchedule) {
        this.trainSchedule = trainSchedule;
    }
}
