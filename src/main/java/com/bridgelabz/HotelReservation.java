package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class HotelReservation {
    String hotelName;
    int rating;
    double regularCustomerRate;
    double weekendRegularCustomerRate;
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
        System.out.println("Enter regular customer rate on weekdays :");
        regularCustomerRate = sc.nextDouble();
        System.out.println("Enter regular customer rate on weekends :");
        weekendRegularCustomerRate = sc.nextDouble();
        hotel = new Hotel(hotelName, rating, regularCustomerRate, weekendRegularCustomerRate);
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