package com.bridgelabz;

import java.time.LocalDate;
import java.time.Month;

public class HotelReservationMain {
    public static void main(String[] args) {
        System.out.println(" Welcome To Hotel Reservation System......!");

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        hotelReservation.addHotel();
        hotelReservation.addHotel();
        hotelReservation.printHotelList();
        /**
         * Defining Start Date and End Date
         */
        LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 11);
        /**
         * Calling method getCheapestHotel with start and end dates as params
         * Printing the result: Hotel
         */
        String hotel = hotelReservation.getCheapestHotel(startDate, endDate);
        System.out.println("The cheapest hotel is : \n " + hotel);
    }
}

