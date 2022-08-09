package com.bridgelabz;

public class Hotel {
    private String hotelName;
    private int rating;
    private double regularCustomerRate;
    private double weekendRegularCustomerRate;

    /**
     * Default Constructor
     */
    public Hotel() {
    }
    public Hotel(String hotelName, int rating, double regularCustomerRate, double weekendRegularCustomerRate) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.regularCustomerRate = regularCustomerRate;
        this.weekendRegularCustomerRate = weekendRegularCustomerRate;
    }

    /**
     * Getters and Setters for hotelName, rating and regualrCustomerRate
     *
     */
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRate() {
        return rating;
    }

    public void setRate(int rate) {
        this.rating = rate;
    }

    public double getRegularCustomerRate() {
        return regularCustomerRate;
    }

    public void setRegularCustomerRate(double regularCustomerRate) {
        this.regularCustomerRate = regularCustomerRate;
    }

    public double getWeekendRegularCustomerRate() {
        return weekendRegularCustomerRate;
    }

    public void setWeekendRegularCustomerRate(double weekendRegularCustomerRate) {
        this.weekendRegularCustomerRate = weekendRegularCustomerRate;
    }

    /**
     * toSring Method to make list of hotels to String form for printing.
     */
    @Override
    public String toString() {
        return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", regularCustomerRate=" + regularCustomerRate
                + ", weekendRegularCustomerRate=" + weekendRegularCustomerRate + "]";
    }
}
