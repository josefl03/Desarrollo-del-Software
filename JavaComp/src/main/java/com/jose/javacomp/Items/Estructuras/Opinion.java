/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp.Items.Estructuras;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author pokes
 */
public class Opinion implements Serializable {
    //Calificación del 1 al 5
    int calificacion;
    //Opinión del producto
    String comentario;
    //Fecha de publicación
    LocalDate fecha;

    public Opinion(int calificacion, String comentario, LocalDate fecha) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
