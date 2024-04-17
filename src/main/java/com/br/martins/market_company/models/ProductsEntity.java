package com.br.martins.market_company.models;

import com.br.martins.market_company.dto.MarketSectorDTO;
import com.br.martins.market_company.dto.ProductsDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products_Table")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_product;

    @ManyToOne
    @JoinColumn(name = "sector_id")
    private MarketSectorEntity sector_market;

    @Column(name = "PRODUCT_NAME")
    private String name_product;

    @Column(name="PRODUCT_PRICE")
    private double price_product;

    @Column(name = "PRODUCT_QUANTITY")
    private int quantity_product;

    public ProductsEntity(ProductsDTO dto_entity){
        this.id_product = dto_entity.id_product();
        this.sector_market = dto_entity.sector_market();
        this.quantity_product = dto_entity.quantity_product();
        this.name_product = dto_entity.name_product();
        this.price_product = dto_entity.price_product();
    }
}
