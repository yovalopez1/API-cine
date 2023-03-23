package com.co.globant.cine.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clientes")
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

    @Column(name = "cliente_tipo")
    private String tipoDocumento;

    @Column(name="cliente-documento")
    private long numeroDocumento;

    @Column(name = "cliente_edad")
    private int edad;

    public ClienteModel(){

    }
    public ClienteModel(long id, String nombre, String apellido, String correo, String tipoDocumento, long numeroDocumento, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
