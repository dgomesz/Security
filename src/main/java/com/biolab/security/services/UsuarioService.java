package com.biolab.security.services;

import com.biolab.security.DTO.UsuarioDTO;
import com.biolab.security.entities.Usuario;
import com.biolab.security.repositories.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuarioRepository repo;
    private final PasswordEncoder passwordEncoder;
    public UsuarioService(UsuarioRepository repo, PasswordEncoder passwordEncoder) {
        this.repo = repo;
        this.passwordEncoder = passwordEncoder;
    }


    public Usuario saveUser(UsuarioDTO dto){
        Usuario u = new Usuario();
        u.setNome(dto.getNome());
        u.setEmail(dto.getEmail());
        u.setSenha(passwordEncoder.encode(dto.getSenha()));
        u.setRole(dto.getRole());
        repo.save(u);
        return u;
    }
}
