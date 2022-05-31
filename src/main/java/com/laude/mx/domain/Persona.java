package com.laude.mx.domain;


import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellidoP;

    @NotEmpty
    private String apellidoM;

    @NotEmpty
    private String fechaN;

    @NotEmpty
    private String sexo;

    @NotEmpty
    private String gradoE;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 10, max = 12, message = "En numero debe tener entre 10 y 12 digitos")
    private String telefono;
    }
