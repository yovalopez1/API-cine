package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cine")
public class CineModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cine_id")
    private long id;
    @Column(name = "cine_nombre")
    private String nombre;
    @Column(name = "cine_apellido")
    private String apellido;
    @Column(name = "cine_correo")
    private String correo;


    public CineModel(){

    }

    public CineModel(String nombre, String apellido, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
