package com.br.martins.market_company.marketSector.model;

import com.br.martins.market_company.marketSector.dto.MarketSectorDTO;
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
@Table(name = "Sector_Table")
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