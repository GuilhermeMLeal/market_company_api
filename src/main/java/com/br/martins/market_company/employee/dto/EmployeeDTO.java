package com.br.martins.market_company.employee.dto;

import com.br.martins.market_company.marketSector.model.MarketSectorEntity;

public record EmployeeDTO(String name_worker, int id_worker, int age_worker,
                          MarketSectorEntity sector_market, String email_worker,
                          String password_worker) {
}
