package com.example.demo.service;

import com.example.demo.model.Laptop;
import com.example.demo.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository repository;

    public void addLaptop(Laptop laptop) {
        repository.save(laptop);
    }

    public boolean isGoodForProgramming(Laptop laptop) {
        return true;
    }
}
