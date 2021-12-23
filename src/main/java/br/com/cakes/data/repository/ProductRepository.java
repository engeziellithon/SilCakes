package br.com.cakes.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cakes.data.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
