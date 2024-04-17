package com.br.martins.market_company.dto;

import com.br.martins.market_company.models.MarketSectorEntity;

public record WorkerDTO(String name_worker, int id_worker, int age_worker,
                        MarketSectorEntity sector_market, String email_worker,
                        String password_worker) {
}
