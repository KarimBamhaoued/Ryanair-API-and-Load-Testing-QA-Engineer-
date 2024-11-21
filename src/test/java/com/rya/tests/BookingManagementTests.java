package com.rya.tests;

import com.intuit.karate.junit5.Karate;

public class BookingManagementTests {

    @Karate.Test
    Karate testBookingManagement() {
        return Karate.run("BookingManagement").relativeTo(getClass());
    }
}
