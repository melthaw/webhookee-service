package io.picos.webhookee.management.test.controller;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManagementRestControllerTest extends AbstractTest {

    @Test
    public void test2ListWebhookee() throws Exception {
        given()
                .get("/api/route-entities")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);
    }
}
