package com.br.martins.market_company.product.repository;

import com.br.martins.market_company.product.model.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProducts extends JpaRepository<ProductsEntity, Integer> {
}
