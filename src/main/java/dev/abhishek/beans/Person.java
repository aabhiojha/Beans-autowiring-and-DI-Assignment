package dev.abhishek.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private final Vehicle vehicle;

    // constructor injection
    // no need to annotate
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
