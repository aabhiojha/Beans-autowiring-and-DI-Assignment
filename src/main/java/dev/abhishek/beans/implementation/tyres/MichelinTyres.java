package dev.abhishek.beans.implementation.tyres;

import dev.abhishek.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component("michelin")
public class MichelinTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("Michelin Tyres are slower");
    }
}
