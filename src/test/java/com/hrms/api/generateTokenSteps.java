package com.hrms.api;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class generateTokenSteps {
    String BaseURI= RestAssured.baseURI="http://3.237.189.167/syntaxapi/api";

    @Given("a JWT is generated")

    public void a_JWT_is_generated() {

        RequestSpecification generateTokenRequest = given().header("Content-type", "application/json")
                .body("{\"email\":\"Moazzamsadiq85@gmail.com\"" +
                        ",\"password\":\"123456789\"}");
        Response generateTokenResponse = generateTokenRequest.when().post("/generateToken.php");
        generateTokenResponse.prettyPrint();


    }

}
