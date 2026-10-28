package com.biolab.security.DTO;

import com.biolab.security.entities.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuarioDTO {

    private UUID id;
    private String nome;
    @Email
    private String email;
    @Size(min = 6, message = "A senhe deve conter no minimo 6 caracteres")
    private String senha;
    private Role role;
}

