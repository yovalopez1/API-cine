package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private long id;
    @Column(name = "cliente_nombre")
    private String nombre;
    @Column(name = "cliente_apellido")
    private String apellido;

    @Column(name = "cliente_correo")
    private String correo;

    @Column(name = "cliente_documento")
    private String tipoDocumento;

    @Column(name = "cliente_edad")
    private int edad;


    public ClienteModel(){

    }

    public ClienteModel(String nombre, String apellido, String correo) {
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
