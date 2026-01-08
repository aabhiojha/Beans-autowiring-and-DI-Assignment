package dev.abhishek.beans.implementation.speakers;

import dev.abhishek.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("bose")
public class BoseSpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("Bose Speakers make small sound. LLLLLLLLLLIIIIIIIILLLLLLLLLL");
    }
}
