package com.rya.tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import com.rya.utils.ResponseValidator;

import static io.restassured.RestAssured.given; // Rest-Assured for API testing
import static org.hamcrest.CoreMatchers.equalTo; // Hamcrest for assertions

public class UserTests {

    @Test
    public void createUserTest() {
        String requestBody = "{ \"email\": \"user@example.com\", \"name\": \"John\", \"surname\": \"Doe\" }";

        Response response = given()
                .baseUri("http://127.0.0.1:8900")
                .contentType("application/json")
                .body(requestBody)
                .when()
                .post("/user")
                .then()
                .statusCode(201)
                .body("email", equalTo("user@example.com"))
                .body("name", equalTo("John"))
                .body("surname", equalTo("Doe"))
                .extract().response();

        ResponseValidator.validateStatusCode(response, 201);
        System.out.println("Create User Response: " + response.asPrettyString());
    }

    @Test
    public void getAllUsersTest() {
        Response response = given()
                .baseUri("http://127.0.0.1:8900")
                .contentType("application/json")
                .when()
                .get("/user")
                .then()
                .statusCode(200)
                .extract().response();

        ResponseValidator.validateStatusCode(response, 200);
        System.out.println("Get All Users Response: " + response.asPrettyString());
    }

    @Test
    public void getUserByIdTest() {
        int userId = 1; // Assuming the user ID to fetch is 1

        Response response = given()
                .baseUri("http://127.0.0.1:8900")
                .contentType("application/json")
                .when()
                .get("/user/" + userId)
                .then()
                .statusCode(200)
                .body("id", equalTo(userId))
                .extract().response();

        ResponseValidator.validateStatusCode(response, 200);
        System.out.println("Get User by ID Response: " + response.asPrettyString());
    }
}
