/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp.Usuarios.Estructuras;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author pokes
 */
public class Tarjeta implements Serializable {
    String nombre;
    long numero;
    LocalDate caducidad;

    public Tarjeta(String nombre, long numero, LocalDate caducidad) {
        this.nombre = nombre;
        this.numero = numero;
        this.caducidad = caducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }
}
