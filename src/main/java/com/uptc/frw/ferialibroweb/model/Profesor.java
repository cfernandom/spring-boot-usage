package com.uptc.frw.ferialibroweb.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PROFESOR")
public class Profesor {
    @Id
    @Column(name = "ID_PROFESOR")
    private long id;
    @Column(name = "NOMBRES_PROFESOR")
    private String nombres;
    @Column(name = "APELLIDOS_PROFESOR")
    private String apellidos;
    @Column(name = "CODIGO_PROFESOR")
    private long codigo;
    @Column(name = "PROFESION")
    private String profesion;
    @OneToMany(mappedBy = "profesor")
    private List<Materia> materias;

    public Profesor() {
    }

    public long getId() {
        return id;
    }

    public void setId(long profesorId) {
        this.id = profesorId;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "profesorId=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", codigo=" + codigo +
                ", profesion='" + profesion + '\'' +
                '}';
    }
}
