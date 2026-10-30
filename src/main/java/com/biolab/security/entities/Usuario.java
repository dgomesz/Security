package com.biolab.security.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;


import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity


public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    @Email
    private String email;
    @Size(min = 6, message = "A senhe deve conter no minimo 6 caracteres")
    private String senha;
    @Enumerated (EnumType.STRING)
    private Role role;
    @Size(min = 11, max = 11)

    private String cpf;
}
