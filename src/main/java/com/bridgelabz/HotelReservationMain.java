package com.bridgelabz;

public class HotelReservationMain {
    public static void main(String[] args) {
        System.out.println(" Welcome To Hotel Reservation System........!");
        /**
         * addHotel for this instance(hotelReservation) Calling method printHotelList to
         * print created hotelList
         */
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        hotelReservation.printHotelList();
    }
}
