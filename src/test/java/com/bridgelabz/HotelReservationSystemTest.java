package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
    @Test
    public void givenHotelDetails_WhenCreated_ShouldReturnTrue() {
        HotelReservation hotelReservation = new HotelReservation();
        boolean result = hotelReservation.addHotel();
        Assert.assertEquals(true, result);
    }
}
