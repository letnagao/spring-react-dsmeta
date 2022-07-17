package com.springreact.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springreact.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
