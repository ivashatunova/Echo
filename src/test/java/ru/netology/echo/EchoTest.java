package ru.netology.echo;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class EchoTest {
    @Test
    void EchoTest() {

        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("hello world") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("hello world"))
        ;
    }
}


