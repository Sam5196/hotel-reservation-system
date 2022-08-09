package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class HotelReservation {
    /**
     * hotelName - Name of the hotel. rating - Rating of Hotel. regularCustomerRate
     * - Rate for regular customers.
     */
    String hotelName;
    int rating;
    double regularCustomerRate;
    Scanner sc = new Scanner(System.in);
    /**
     * Creating ArrayList of Hotel named hotelList of Hotel type
     */
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    /**
     * hotel - Instance (object) of Hotel Class
     */
    Hotel hotel;
    public boolean addHotel() {

        System.out.println("Enter hotel name:");
        hotelName = sc.next();
        System.out.println("Enter hotel rating:");
        rating = sc.nextInt();
        System.out.println("Enter regular customer rate:");
        regularCustomerRate = sc.nextDouble();
        hotel = new Hotel(hotelName, rating, regularCustomerRate);
        return hotelList.add(hotel);
    }

    /**
     * Method to Print ArrayList hotelList
     */
    public void printHotelList() {
        System.out.println(hotelList);
    }
    public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate) {


        Optional<Hotel> sortedHotelList = hotelList.stream().min(Comparator.comparing(Hotel::getRegularCustomerRate));
        return sortedHotelList.get();
    }
}