package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        /** XML Config **/

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Alien obj1 = (Alien) context.getBean(Alien.class);
//        Alien obj2 = (Alien) context.getBean(Alien.class);
//
//        obj1.setAge(12);
//        obj2.setAge(27);
//
//        obj1.code();

//        Desktop desktop = (Desktop) context.getBean(Desktop.class);
//        desktop.compile();

        /** Java Based Config **/

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = (Alien) context.getBean(Alien.class);
//        Alien obj2 = (Alien) context.getBean("naan_oru_alien");
        Alien obj2 = (Alien) context.getBean(Alien.class);

//        obj1.setAge(12);
//        obj2.setAge(27);

        obj1.code();

        Desktop beast = (Desktop) context.getBean("beast");
        Desktop desktop = (Desktop) context.getBean(Desktop.class);
        System.out.println(beast.hashCode() + "\n" + desktop.hashCode());
        beast.compile();
    }
}
