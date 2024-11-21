package com.rya.utils;

import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class RequestBuilder {
    public static RequestSpecification buildRequest() {
        return given()
                .baseUri("http://127.0.0.1:8900")
                .header("Content-Type", "application/json");
    }
}
