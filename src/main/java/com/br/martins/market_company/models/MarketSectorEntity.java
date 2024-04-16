package com.br.martins.market_company.models;

import com.br.martins.market_company.dto.MarketSectorDTO;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MarketSectorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sector;

    @Column(name = "SECTOR_NAME")
    private String name_sector;

    public MarketSectorEntity(MarketSectorDTO dto_entity){
        this.id_sector = dto_entity.id();
        this.name_sector = dto_entity.name();
    }
}
