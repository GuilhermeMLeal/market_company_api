package com.br.martins.market_company.customer.repository;

import com.br.martins.market_company.customer.model.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RepositoryCustomers extends JpaRepository<CustomersEntity, UUID> {
}
