package com.example.javastacktrace.space;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/spaceship")
public class SpaceShipController {
    private final RefuellingService refuellingService;

    @PostMapping("/")
    public SpaceShip launchSomething() {
        SpaceShip newShip = new SpaceShip(15, "Mike");
        SpaceShip refuelledship = refuellingService.fuelship(newShip);
        return refuelledship;
    }
}
