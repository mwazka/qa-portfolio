//package models;
//
//// POPRAWNE IMPORTY DLA REST ASSURED
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.filter.log.LogDetail;
//import io.restassured.http.ContentType;
//import io.restassured.specification.RequestSpecification;
//import utils.ConfigManager;
//
//public class LinksRequest {
//
//    public static RequestSpecification getBasicSpec() {
//        return new RequestSpecBuilder()
//                .setBaseUri(ConfigManager.getBaseUrl())
//                // Używamy ContentType z io.restassured.http
//                .setAccept(ContentType.JSON)
//                .setContentType(ContentType.JSON)
//                .log(LogDetail.ALL)
//                .build();
//    }
//}