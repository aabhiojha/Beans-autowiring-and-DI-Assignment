package dev.abhishek.beans.implementation.speakers;

import dev.abhishek.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeakers implements Speakers {
    @Override
    public void makeSound() {
        System.out.println("Sony speakers are loud. HIIIIIIIIIIHHHHHHHHHHHH");
    }
}
