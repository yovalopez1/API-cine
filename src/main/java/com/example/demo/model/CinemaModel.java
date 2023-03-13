package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cinema")
public class CinemaModel {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "cinema_id")
    private long idPelicula;

    @Column(name = "cinema_nombre")
    private String nombrePelicula;

    @Column(name = "cinema_fecha")
    private String fechaPelicula;

    @Column(name = "cinema_hora")
    private String horaPelicula;

    @Column(name = "cinema_sala")
    private int sala;

    @Column(name = "cinema_genero")
    private String generoPelicula;

    public CinemaModel(){

    }

    public CinemaModel( String nombrePelicula, String fechaPelicula, String horaPelicula, int sala, String generoPelicula) {
        this.nombrePelicula = nombrePelicula;
        this.fechaPelicula = fechaPelicula;
        this.horaPelicula = horaPelicula;
        this.sala = sala;
        this.generoPelicula = generoPelicula;
    }

    public long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getFechaPelicula() {
        return fechaPelicula;
    }

    public void setFechaPelicula(String fechaPelicula) {
        this.fechaPelicula = fechaPelicula;
    }

    public String getHoraPelicula() {
        return horaPelicula;
    }

    public void setHoraPelicula(String horaPelicula) {
        this.horaPelicula = horaPelicula;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }
}
