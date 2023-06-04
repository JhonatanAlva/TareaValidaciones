package com.springvalidaciones.tareavalidaciones.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @NotBlank(message = "El nombre no puede estar vacio")
    @Column(name = "nombre")
    private String nombre;

    @NotBlank(message = "El email no puede estar vacio")
    @Column(name = "email")
    private String email;

    private Long carnet;

    private Long puntuacion;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCarnet() {
        return carnet;
    }

    public void setCarnet(Long carnet) {
        this.carnet = carnet;
    }

    public Long getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Long puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
