package org.example;

import java.beans.ConstructorProperties;

public class Alien {
    private int age;
    private int salary;
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
        computer.compile();
    }
}
