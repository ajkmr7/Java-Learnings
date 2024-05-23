package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
//    @Bean(name = {"desktop", "desktop1", "beast"})
////    @Scope(value = "prototype")
//    public Desktop hello() {
//        return new Desktop();
//    }
//
//    @Bean(name = {"laptop", "acer"})
////    @Primary
////    @Scope(value = "prototype")
//    public Laptop hi() {
//        return new Laptop();
//    }
//
//    @Bean(name = "naan_oru_alien")
//    public Alien alien(@Autowired @Qualifier("acer") Computer computer) {
//        Alien obj = new Alien();
//        obj.setAge(12);
//        obj.setComputer(computer);
//        return obj;
//    }
}
