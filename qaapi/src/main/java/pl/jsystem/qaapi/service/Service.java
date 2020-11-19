package pl.jsystem.qaapi.service;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.client.methods.RequestBuilder;
import pl.jsystem.qaapi.User;
import pl.jsystem.qaapi.configuration.ApiConfig;

public class Service {

    public static Response returnResponse(String host) {
        return RestAssured
                .given()
                .get(host)
                .andReturn();
    }

    public static JsonPath returnResponseUnPack(String host) {
        return returnResponse(host).then().extract().body().jsonPath();
    }




}
