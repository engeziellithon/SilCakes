package br.com.cakes.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cakes.data.entities.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
