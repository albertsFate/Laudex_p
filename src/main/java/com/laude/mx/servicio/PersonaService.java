package com.laude.mx.servicio;

import com.laude.mx.domain.Persona;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface PersonaService {
    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);
}
