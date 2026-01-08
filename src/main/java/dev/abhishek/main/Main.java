package dev.abhishek.main;

import dev.abhishek.beans.Vehicle;
import dev.abhishek.beans.services.VehicleServices;
import dev.abhishek.config.Projectconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//            String tyre1 = "Bridgestone";
//            String tyre2 = "Michelin";
//            String speaker1 = "Sony";
//            String speaker2 = "Bose";
            var context = new AnnotationConfigApplicationContext(Projectconfig.class);
            Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
            VehicleServices vehicleServices = context.getBean("vehicleServices", VehicleServices.class);
            vehicleServices.makeSound();
            vehicleServices.rotate();



    }
}