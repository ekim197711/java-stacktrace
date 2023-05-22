package com.example.javastacktrace.space;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RefuellingService {

    public SpaceShip fuelship(SpaceShip ship) {
        log.info("Adding 50 % fuel");
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement[] stackTracefromThrowable = new Throwable().getStackTrace();
        log.info("Stacktrace", new Throwable());
        String stackTrace1 = ExceptionUtils.getStackTrace(new Throwable());
        log.info("Stacktrace from Apace commons {}", stackTrace1);
        String collect = Arrays.stream(stackTracefromThrowable).map(Object::toString).collect(Collectors.joining("\n"));
        log.info("Stacktrace from manual stream join {}", collect);


        SpaceShip fuelledSpaceShip = new SpaceShip(
                ship.fuelleft() + 50,
                ship.captain()
        );
        log.info("Return ship {}", fuelledSpaceShip);
        return fuelledSpaceShip;
    }
}
