package com.example.SpringBoot.security.service;

import com.example.SpringBoot.security.enums.RolNombre;
import com.example.SpringBoot.security.model.Rol;
import com.example.SpringBoot.security.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol){
        rolRepository.save(rol);
    }
}
