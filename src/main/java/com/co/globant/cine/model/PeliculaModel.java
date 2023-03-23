package com.co.globant.cine.model;

import jakarta.persistence.*;

@Entity
@Table(name = "peliculas")
public class PeliculaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pelicula_id")
    private long idPelicula;

    @Column(name = "pelicula_nombre")
    private String nombrePelicula;

    @Column(name = "pelicula_fecha")
    private String fechaPelicula;

    @Column(name = "pelicula_hora")
    private String horaPelicula;

    @Column(name = "pelicula_precio")
    private long precioPelicula;

    @Column(name = "pelicula_sala")
    private int salaPelicula;

    @Column(name = "pelicula_genero")
    private String generoPelicula;

    public PeliculaModel(){

    }

    public PeliculaModel(long idPelicula, String nombrePelicula, String fechaPelicula, String horaPelicula, long precioPelicula, int idsalaPelicula, String idgeneroPelicula) {
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.fechaPelicula = fechaPelicula;
        this.horaPelicula = horaPelicula;
        this.precioPelicula = precioPelicula;
        this.salaPelicula = salaPelicula;
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

    public long getPrecioPelicula() {
        return precioPelicula;
    }

    public void setPrecioPelicula(long precioPelicula) {
        this.precioPelicula = precioPelicula;
    }

    public int getIdsalaPelicula() {
        return salaPelicula;
    }

    public void setIdsalaPelicula(int idsalaPelicula) {
        this.salaPelicula = idsalaPelicula;
    }

    public String getIdgeneroPelicula() {
        return generoPelicula;
    }

    public void setIdgeneroPelicula(String idgeneroPelicula) {
        this.generoPelicula = idgeneroPelicula;
    }
}
