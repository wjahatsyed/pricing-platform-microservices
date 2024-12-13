package com.adiltech.pricing_platform_microservices.repositories;

import com.adiltech.pricing_platform_microservices.entities.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
    // Additional query methods can be defined here if needed
}
