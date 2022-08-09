package com.bridgelabz;

public class Hotel {
    /**
     * hotelName - Name of the hotel. rating - Rating of Hotel. regularCustomerRate
     * - Rate for regular customers.
     */
    private String hotelName;
    private int rating;
    private double regularCustomerRate;

    /**
     * Default Constructor
     */
    public Hotel() {
    }

    /**
     *
     * @param hotelName           - Name of the hotel.
     * @param rating              - Rating for the hotel
     * @param regularCustomerRate - Rate for regular customers.
     */
    public Hotel(String hotelName, int rating, double regularCustomerRate) {
        this.hotelName = hotelName;
        this.rating = rating;
        this.regularCustomerRate = regularCustomerRate;
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

    /**
     * toSring Method to make list of hotels to String form for printing.
     */
    @Override
    public String toString() {
        return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", regularCustomerRate=" + regularCustomerRate
                + "]";
    }

}
