package dev.abhishek.beans.services;

import dev.abhishek.interfaces.Speakers;
import dev.abhishek.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices implements Tyres, Speakers {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

//    @Autowired
//    public void setTyres(@Qualifier("michelin") Tyres tyres) {
//        this.tyres = tyres;
//    }

    // constructor injection again
    public VehicleServices(@Qualifier("sony") Speakers speakers, @Qualifier("michelin") Tyres tyres) {
        this.speakers = speakers;
        this.tyres = tyres;
    }

//    public VehicleServices(Speakers speakers, Tyres tyres) {
//        this.speakers = speakers;
//        this.tyres = tyres;
//    }

    @Override
    public void makeSound() {
        speakers.makeSound();
    }

    @Override
    public void rotate() {
        tyres.rotate();
    }
}
