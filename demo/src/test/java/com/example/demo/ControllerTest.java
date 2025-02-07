package com.example.demo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.mockito.Mockito.*;

import static org.hamcrest.Matchers.equalTo;

public class ControllerTest {
    @Test
    public void heathTest()
    {
        RestAssured.get("http://localhost:8080/health")
                .then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().body("status",equalTo("healthy"));


    }

    @Mock
    Controller c=new Controller();
    @Test
    public void getStatusTest()
    {
        when(c.getStatus(ArgumentMatchers.anyString())).thenReturn(new Health("fail"));
        Health obj=c.getStatus("fail");
        Assertions.assertNotNull(obj);

    }





}
