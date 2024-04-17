package com.br.martins.market_company.models;

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
public class ProfessionalsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_professional;

    @Column(name = "NAME_USER")
    private String name_professional;

    @Column(name = "AGE_USER")
    private int age_professional;

    @Column(name = "EMAIL_USER")
    private String email_professional;

    @Column(name = "PASSWORD_PROFESSIONAL")
    private String password_professional;
}
