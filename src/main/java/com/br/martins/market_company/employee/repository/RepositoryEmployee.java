package com.br.martins.market_company.employee.repository;

import com.br.martins.market_company.employee.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryEmployee extends JpaRepository<EmployeeEntity, Integer > {
}
