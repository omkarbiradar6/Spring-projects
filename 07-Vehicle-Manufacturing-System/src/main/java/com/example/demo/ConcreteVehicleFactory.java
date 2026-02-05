package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConcreteVehicleFactory implements VehicleFactory {

    @Autowired
    @Qualifier("diesel")
    private Engine dieselEngine;

    @Autowired
    @Qualifier("electric")
    private Engine electricEngine;

    @Override
    public Vehicle createVehicle(String type, String engineType) {

        Engine selectedEngine;

        if (engineType.equalsIgnoreCase("diesel")) {
            selectedEngine = dieselEngine;
        } else if (engineType.equalsIgnoreCase("electric")) {
            selectedEngine = electricEngine;
        } else {
            throw new IllegalArgumentException("Invalid engine type");
        }

        if (type.equalsIgnoreCase("car")) {
            return new Car(selectedEngine, 4);
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck(selectedEngine, 5000);
        } else {
            throw new IllegalArgumentException("Invalid vehicle type");
        }
    }
}
