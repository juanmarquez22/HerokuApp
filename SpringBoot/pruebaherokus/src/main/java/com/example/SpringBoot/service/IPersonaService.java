
package com.example.SpringBoot.service;

import com.example.SpringBoot.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List <Persona> verPersonas ();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona(Long id);
    
}
