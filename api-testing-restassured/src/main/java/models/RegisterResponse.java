package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterResponse {

    @JsonProperty("userID")
    private String userID;
    private String username;
    private List<Object> books;
    private int statusCode;
    private String code;
    private String message;
    public RegisterResponse() {}

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public List<Object> getBooks() {
        return books;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getCode() {
        return this.code;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }
}
