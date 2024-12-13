package com.adiltech.pricing_platform_microservices.controllers;

import com.adiltech.pricing_platform_microservices.entities.Price;
import com.adiltech.pricing_platform_microservices.repositories.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @Autowired
    private PriceRepository priceRepository;

    @GetMapping
    public List<Price> getAllPrices() {
        return priceRepository.findAll();
    }

    @PostMapping
    public Price addPrice(@RequestBody Price price) {
        return priceRepository.save(price);
    }

    @DeleteMapping("/{id}")
    public void deletePrice(@PathVariable Long id) {
        priceRepository.deleteById(id);
    }

    @GetMapping("/test")
    public String test() {
        return "Controller is working!";
    }
}
