package com.br.martins.market_company.repository;

import com.br.martins.market_company.models.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProducts extends JpaRepository<ProductsEntity, > {
}
