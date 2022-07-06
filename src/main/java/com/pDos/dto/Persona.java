package com.pDos.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.aspectj.weaver.patterns.PerObject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Persona implements Serializable {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private String apellido;

    private String phone_number;

    private Integer cp;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String phone_number, Integer cp) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.phone_number = phone_number;
        this.cp = cp;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", cp=" + cp +
                '}';
    }

    public static Boolean isValid(Persona persona){
        if(persona.getApellido() != null &&
           persona.getNombre() != null)
            return true;
        else
            return false;
    }

}
