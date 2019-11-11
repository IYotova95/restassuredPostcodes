package com.spartaglobal.restassuredPostcodes;

import static org.junit.Assert.assertTrue;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class singlePostcodeTest
{
    /**
     * Rigorous Test :-)
     */

    private static Response singlePostcodeResponse;
    @BeforeClass
    public static void setup(){
        baseURI = "https://api.postcodes.io";
        basePath = "/postcodes/";
        singlePostcodeResponse = get("n111nb");
    }

    @Test
    public void postCodeRequestSuccessful()
    {
       singlePostcodeResponse
               .then()
               .statusCode(200)
               .body("result.postcode",equalTo("N11 1NB"));
    }


}
