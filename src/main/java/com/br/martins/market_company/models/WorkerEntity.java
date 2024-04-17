package com.br.martins.market_company.models;

import com.br.martins.market_company.dto.MarketSectorDTO;
import com.br.martins.market_company.dto.WorkerDTO;
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
@Table(name = "Worker_Table")
public class WorkerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_worker;

    @ManyToOne
    @JoinColumn(name= "SECTOR_WORKER")
    private MarketSectorEntity sector_market;

    @Column(name = "NAME_WORKER")
    private String name_worker;

    @Column(name = "AGE_WORKER")
    private int age_worker;

    @Column(name = "EMAIL_WORKER")
    private String email_worker;

    @Column(name = "PASSWORD_WORKER")
    private String password_worker;

    public WorkerEntity(WorkerDTO dto_entity){
        this.id_worker = dto_entity.id_worker();
        this.sector_market = dto_entity.sector_market();
        this.name_worker = dto_entity.name_worker();
        this.email_worker = dto_entity.email_worker();
        this.password_worker = dto_entity.password_worker();
    }
}
