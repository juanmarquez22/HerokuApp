package com.example.SpringBoot.security.repository;

import com.example.SpringBoot.security.enums.RolNombre;
import com.example.SpringBoot.security.model.Rol;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
