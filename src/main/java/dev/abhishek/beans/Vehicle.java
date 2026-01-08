package dev.abhishek.beans;

import dev.abhishek.beans.services.VehicleServices;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;
    private final VehicleServices vehicleServices;

    // constructor injection again
    // Vehicle bean is dependent on vehicle services
    public Vehicle(VehicleServices vehicleServices) {
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }
}
