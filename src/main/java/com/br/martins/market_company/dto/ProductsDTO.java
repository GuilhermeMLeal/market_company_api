package com.br.martins.market_company.dto;

import com.br.martins.market_company.models.MarketSectorEntity;

public record ProductsDTO(int id_product, MarketSectorEntity sector_market,
                          String name_product, double price_product,
                          int quantity_product) {
}
