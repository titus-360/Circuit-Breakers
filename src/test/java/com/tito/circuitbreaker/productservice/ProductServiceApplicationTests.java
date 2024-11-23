//package com.tito.circuitbreaker.productservice;
//
//import com.tito.circuitbreaker.productservice.dto.ProductRequest;
//import io.restassured.RestAssured;
//import org.hamcrest.Matchers;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
//import org.springframework.context.annotation.Import;
//import org.testcontainers.containers.MongoDBContainer;
//
//import java.math.BigDecimal;
//
//@Import(TestcontainersConfiguration.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class ProductServiceApplicationTests {
//
//    @ServiceConnection
//    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:7.0.5");
//
//    @LocalServerPort
//    private Integer port;
//
//    @BeforeEach
//    void setUp() {
//        RestAssured.baseURI = "http://localhost";
//        RestAssured.port = port;
//    }
//
//    static {
//        try {
//            mongoDBContainer.start();
//        } catch (Exception e) {
//            throw new IllegalStateException("Could not start MongoDB container. Ensure Docker is running and properly configured.", e);
//        }
//    }
//
//    @Test
//    void shouldCreateProduct() throws Exception {
//        ProductRequest productRequest = getProductRequest();
//        RestAssured.given()
//                .contentType("application/json")
//                .body(productRequest)
//                .when()
//                .post("/api/v1/products")
//                .then()
//                .log().all()
//                .statusCode(201)
//                .body("id", Matchers.notNullValue())
//                .body("name", Matchers.equalTo(productRequest.name()))
//                .body("description", Matchers.equalTo(productRequest.description()))
//                .body("price", Matchers.is(productRequest.price().intValueExact()));
//    }
//
//    private ProductRequest getProductRequest() {
//        return new ProductRequest("Product 1", "Product 1 description", "100.0", new BigDecimal("100.0"));
//    }
//
//}
