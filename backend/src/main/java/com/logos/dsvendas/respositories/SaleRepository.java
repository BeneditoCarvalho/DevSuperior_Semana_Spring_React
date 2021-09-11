package com.logos.dsvendas.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logos.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
