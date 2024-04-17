package com.br.martins.market_company.repository;

import com.br.martins.market_company.models.WorkerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProfessionals extends JpaRepository<WorkerEntity, > {
}
