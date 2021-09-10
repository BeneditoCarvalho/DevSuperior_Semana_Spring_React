package com.logos.dsvendas.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logos.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
