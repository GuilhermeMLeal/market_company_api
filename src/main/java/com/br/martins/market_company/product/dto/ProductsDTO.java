package com.br.martins.market_company.product.dto;

import com.br.martins.market_company.marketSector.model.MarketSectorEntity;

public record ProductsDTO(int id_product, MarketSectorEntity sector_market,
                          String name_product, double price_product,
                          int quantity_product) {
}
