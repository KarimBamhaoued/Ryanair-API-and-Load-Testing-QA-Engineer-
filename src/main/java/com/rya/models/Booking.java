package com.rya.models;

public class Booking {
    private String date;
    private String destination;
    private String origin;
    private int userId;

    public Booking(String date, String destination, String origin, int userId) {
        this.date = date;
        this.destination = destination;
        this.origin = origin;
        this.userId = userId;
    }

    // Getters and Setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
