package com.co.globant.cine.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reservas")
public class ReservaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reserva_id")
    private long idReserva;

    @Column(name = "reserva_fecha")
    private String fechaReserva;

    @Column(name = "reserva_hora")
    private String horaReserva;

    @Column(name = "reserva_puesto")
    private int puestosReserva;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    ClienteModel cliente;

    @ManyToOne
    @JoinColumn(name = "pelicula_id")
    PeliculaModel pelicula;

    public ReservaModel(){

    }

    public ReservaModel(long idReserva, String fechaReserva, String horaReserva, int puestosReserva, ClienteModel cliente) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.puestosReserva = puestosReserva;
    }

    public long getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(long idReserva) {
        this.idReserva = idReserva;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    public int getPuestosReserva() {
        return puestosReserva;
    }

    public void setPuestosReserva(int puestosReserva) {
        this.puestosReserva = puestosReserva;
    }

}
