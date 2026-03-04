package utils;
import net.datafaker.Faker;

public class ConfigManager {

    private static final String BASE_URL = "https://demoqa.com";
    private static final Faker FAKER = new Faker();

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getUserName() {
        return "ExampleUserName";
    }

    public static String getPassword() {
        return "ExamplePassword@123";
    }

    public static String getFirstName() {
        return "Example First Name";
    }

    public static String getLastName() {
        return "Example Last Name";
    }

    public static String getRandomUserName() {
        return FAKER.internet().username();
    }

    public static String getRandomPassword() {
        return FAKER.internet().password(0, 7, false, false, false);
    }
}
