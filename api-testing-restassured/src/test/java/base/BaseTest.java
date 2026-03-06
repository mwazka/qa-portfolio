package base;

import static io.restassured.RestAssured.given;
// import static io.restassured.specification.ProxySpecification.auth;

import io.restassured.config.RedirectConfig;
import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.ConfigManager;

public class BaseTest {
    protected String userIDToDelete;
    @BeforeClass
    protected void setup() {
        RestAssured.baseURI = ConfigManager.getBaseUrl();
        RestAssured.defaultParser = Parser.JSON;
        RestAssured.config = RestAssured.config()
                .redirect(RedirectConfig.redirectConfig().followRedirects(false));
    }

    @AfterClass
    protected void tearDown() {
        if (userIDToDelete != null) {
            System.out.println("Delete user with ID: " + userIDToDelete);

            given()
                    .auth().preemptive().basic(ConfigManager.getUserName(), ConfigManager.getPassword())
                    .contentType(ContentType.JSON)
                    .when()
                    .delete("/Account/v1/User/" + userIDToDelete)
                    .then()
                    .statusCode(204);

            userIDToDelete = null;
        }
    }
}
