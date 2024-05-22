package com.br.martins.market_company.customer.model;

import com.br.martins.market_company.customer.dto.CustomersDTO;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Data
@Entity
@Table(name = "Customer_Table")
public class CustomersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idUser;

    @Column(name = "NAME_USER")
    private String nameUser;

    @Column(name = "AGE_USER")
    private int ageUser;

    @Column(name = "EMAIL_USER")
    private String emailUser;

    @Column(name = "PASSWORD_USER")
    private String passwordUser;

    public CustomersEntity(CustomersDTO dtoEntity) {
        this.nameUser = dtoEntity.nameUser();
        this.ageUser = dtoEntity.ageUser();
        this.emailUser = dtoEntity.emailUser();
        this.passwordUser = dtoEntity.passwordUser();
    }
}
