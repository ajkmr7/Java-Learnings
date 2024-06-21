package com.example.spring_jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
@Data
public class Student {
    @Id
    private int registerNo;
    private String name;
    private int marks;
}
