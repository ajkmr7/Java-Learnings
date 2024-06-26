package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {
    @Value("25")
    private int age;
    @Value("70000")
    private int salary;

//    @Autowired
//    @Qualifier("beast")
    private Computer computer;

//    @ConstructorProperties({"age", "salary", "laptop"})
//    public Alien(int age, int salary, Computer computer) {
//        this.age = age;
//        this.salary = salary;
//        this.computer = computer;
//        System.out.println("Age: " + age + " Laptop: " + computer.toString() + " Salary: " + salary);
//    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("beast")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age set to: " + age);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void code() {
        System.out.println("Coding...");
        System.out.println("Age: " + age + " Salary: " + salary);
        computer.compile();
    }
}
