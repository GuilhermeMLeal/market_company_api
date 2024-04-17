package com.br.martins.market_company.repository;

import com.br.martins.market_company.models.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCustomers extends JpaRepository<CustomersEntity, Integer> {
}
