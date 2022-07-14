package com.devsuperior.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.backend.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
