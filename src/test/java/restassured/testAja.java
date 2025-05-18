package restassured;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class testAja {
    String token;
    int id;

    @BeforeSuite
    public void login(){
        // Set the base URI for the REST API
        RestAssured.baseURI = "https://whitesmokehouse.com/";

        //Create Login request
        String requestBody = "{\n" +
                "  \"email\": \"alifatesting1@mail.com\",\n" +
                "  \"password\": \"testing123!\"\n" +
                "}";

        // Send a POST request to the login endpoint
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .log().all()
                .when()
                .post("webhook/api/login");
        System.out.println("Response: " + response.asPrettyString());
        token = response.jsonPath().getString("token");
        System.out.println("Token: " + token);
    }

    @Test
    public void addObject(){
        // Set the base URI for the REST API
        RestAssured.baseURI = "https://whitesmokehouse.com/";

        // Create Add object request
        String requestBody = "{\n" +
                "  \"name\": \"Produk coba coba\",\n" +
                "  \"data\": {\n" +
                "    \"year\": 2019,\n" +
                "    \"price\": 1849.99,\n" +
                "    \"cpu_model\": \"Intel Core i9\",\n" +
                "    \"hard_disk_size\": \"1 TB\",\n" +
                "    \"capacity\": \"2 cpu\",\n" +
                "    \"screen_size\": \"14 Inch\",\n" +
                "    \"color\": \"red\"\n" +
                "  }\n" +
            "}";

        // Send a POST request to the add object endpoint
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody)
                .log().all()
                .when()
                .post("webhook/api/objects");
        System.out.println("Response: " + response.asPrettyString());
        id = response.jsonPath().getInt("[0].id");
        System.out.println("ID: " + id);
    }

    @Test(priority = 2)
    public void getSingleObject(){
        // int id = 9;
        // Set the base URI for the REST API
        RestAssured.baseURI = "https://whitesmokehouse.com/";

        // Create Get single object request
        Response response = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .log().all()
                .when()
                .get("webhook/8749129e-f5f7-4ae6-9b03-93be7252443c/api/objects/" + id);

        System.out.println("Response: " + response.asPrettyString());
        assert response.getStatusCode() == 200 : "Expected status code 200, but got " + response.getStatusCode();
        assert response.jsonPath().getString("id").equals(String.valueOf(id)) : 
        "Expected ID " + id + ", but got " + response.jsonPath().getString("id");
    }
}
