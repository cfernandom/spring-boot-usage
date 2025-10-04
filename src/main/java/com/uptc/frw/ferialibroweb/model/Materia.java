package com.uptc.frw.ferialibroweb.model;

import jakarta.persistence.*;

@Entity
@Table(name = "MATERIA")
public class Materia {
    @Id
    @Column(name = "ID_MATERIA")
    private long id;
    @Column(name = "NOMBRE_MATERIA")
    private String nombre;
    @Column(name = "LIGA")
    private String liga;
    @Column(name = "ID_PROFESOR", insertable = false, updatable = false)
    private long profesorId;
    @ManyToOne
    @JoinColumn(name = "ID_PROFESOR")
    private Profesor profesor;

    public Materia() {
    }

    public long getId() {
        return id;
    }

    public void setId(long materiaId) {
        this.id = materiaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public long getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(long profesorId) {
        this.profesorId = profesorId;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "profesorId=" + profesorId +
                ", liga='" + liga + '\'' +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}
