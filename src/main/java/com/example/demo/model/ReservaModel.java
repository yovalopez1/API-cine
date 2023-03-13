package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column(name = "reserva_precio")
    private String precioReserva;


    public ReservaModel( String fechaReserva, String horaReserva, String precioReserva) {
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
        this.precioReserva = precioReserva;
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

    public String getPrecioReserva() {
        return precioReserva;
    }

    public void setPrecioReserva(String precioReserva) {
        this.precioReserva = precioReserva;
    }
}
