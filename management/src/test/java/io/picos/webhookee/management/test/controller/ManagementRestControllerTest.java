package io.picos.webhookee.management.test.controller;

import io.picos.webhookee.incoming.dockerhub.DockerHubMessage;
import io.picos.webhookee.management.rest.dto.RouteEntitySaveParam;
import io.picos.webhookee.outgoing.bearychat.BearyChatMessage;
import io.restassured.http.ContentType;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ManagementRestControllerTest extends AbstractTest {

//    @Test
    public void test1CreateWebhookee() throws Exception {
        RouteEntitySaveParam saveParam = new RouteEntitySaveParam();
        saveParam.setName("DockerHub 2 BearyChat");
        saveParam.setType(DockerHubMessage.MESSAGE_TYPE);
        saveParam.setTargetType(BearyChatMessage.MESSAGE_TYPE);
        saveParam.setTargetUrl("https://hook.bearychat.com/=bwBrq/incoming/403427090b0555b1804f0160f338ae29");

        given().log().all()
               .contentType(ContentType.JSON)
               .body(saveParam)
               .when()
               .post("/api/route-entities")
               .then()
               .log().all()
               .assertThat()
               .statusCode(201);
    }

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
