package com.example.javastacktrace.space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpaceShipControllerTest {
    @Autowired
    SpaceShipController controller;

    @Test
    void launchSomething() {
        SpaceShip spaceShip = controller.launchSomething();
        Assertions.assertEquals(65, spaceShip.fuelleft());
        System.out.println(spaceShip);
    }
}