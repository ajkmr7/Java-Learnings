package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Created!");
    }

    public void compile() {
        System.out.println("Compiling with Laptop...");
    }
}
