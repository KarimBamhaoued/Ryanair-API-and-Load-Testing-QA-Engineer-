package com.rya.tests;

import com.rya.utils.ResponseValidator;
import com.rya.utils.RequestBuilder;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class BookingTests {

    @Test
    public void createBookingTest() {
        String requestBody = "{ \"date\": \"2024-11-20\", \"destination\": \"JFK\", \"origin\": \"LHR\", \"userId\": 1 }";

        Response response = RequestBuilder.buildRequest()
                .body(requestBody)
                .post("/booking");

        // Validate that the status code is 201 (Created)
        ResponseValidator.validateStatusCode(response, 201);
        System.out.println("Create Booking Response: " + response.asPrettyString());
    }

    @Test
    public void getAllBookingsForUserTest() {
        Response response = RequestBuilder.buildRequest()
                .param("user", 1)
                .get("/booking");

        // Validate that the status code is 200 (OK)
        ResponseValidator.validateStatusCode(response, 200);
        System.out.println("Get All Bookings for User Response: " + response.asPrettyString());
    }

    @Test
    public void getBookingByIdTest() {
        int bookingId = 1; // Assuming the booking ID we want to fetch is 1

        Response response = RequestBuilder.buildRequest()
                .get("/booking/" + bookingId);

        // Validate that the status code is 200 (OK)
        ResponseValidator.validateStatusCode(response, 200);
        System.out.println("Get Booking by ID Response: " + response.asPrettyString());
    }
}
