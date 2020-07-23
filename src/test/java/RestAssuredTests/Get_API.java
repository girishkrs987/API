package RestAssuredTests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class Get_API {

	@Test
	public void getdetails() {
	/*	
		given()
		.when()
		.get("http://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=439d4b804bc8187953eb36d2a8c26a02")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("temp", equalTo("300.15"))
		.header("content-type", "application/json");
		
		*/
		
		System.out.println("Test");
	}
}
