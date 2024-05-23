package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("beast")
@Scope("prototype")
public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop Created!");
    }

    public void compile() {
        System.out.println("Compiling with Desktop...");
    }
}
