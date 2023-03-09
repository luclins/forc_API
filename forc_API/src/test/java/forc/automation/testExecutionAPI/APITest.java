package forc.automation.testExecutionAPI;

import static io.restassured.RestAssured.*;

import static  org.hamcrest.Matchers.*;
import org.junit.Test;


public class APITest {
	
	@Test
	public void checkHttp200() {
		given()
		.when()
			.get("https://www.football-data.org/")
		.then()
			.statusCode(200);
	}
	

	@Test
	public void checkHttp404() {
		given()
				.when()
				.get("https://www.football-data.org/satadsfhdf")
				.then()
				.statusCode(404);
	}


}


