package com.br.martins.market_company.models;

import com.br.martins.market_company.dto.CustomersDTO;
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
@Table(name = "Customer_Table")
public class CustomersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name = "NAME_USER")
    private String nameUser;

    @Column(name = "AGE_USER")
    private int ageUser;

    @Column(name = "EMAIL_USER")
    private String emailUser;

    @Column(name = "PASSWORD_USER")
    private String passwordUser;

    public CustomersEntity(CustomersDTO dtoEntity) {
        this.idUser = dtoEntity.idUser();
        this.nameUser = dtoEntity.nameUser();
        this.ageUser = dtoEntity.ageUser();
        this.emailUser = dtoEntity.emailUser();
        this.passwordUser = dtoEntity.passwordUser();
    }
}
