package dev.abhishek.beans.implementation.tyres;

import dev.abhishek.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("bridgeStone")
public class BridgeStone implements Tyres {
    @Override
    public void rotate() {
        System.out.println("Bridgestone tyres are faster");
    }
}
