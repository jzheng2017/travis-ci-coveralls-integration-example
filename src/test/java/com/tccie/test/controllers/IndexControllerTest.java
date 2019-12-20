package com.tccie.test.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

public class IndexControllerTest {
    private IndexController indexController;

    @BeforeEach
    void setup() {
        indexController = new IndexController();
    }

    @Test
    public void indexReturnsStatus200() {
        final HttpStatus expectedStatusCode = HttpStatus.OK;
        final HttpStatus actualStatusCode = indexController.index().getStatusCode();

        Assertions.assertEquals(expectedStatusCode, actualStatusCode);
    }

    @Test
    public void indexReturnsHelloWorld() {
        final String expectedString = "Hello World";
        final String actualString = indexController.index().getBody();

        Assertions.assertEquals(expectedString, actualString);
    }
}
