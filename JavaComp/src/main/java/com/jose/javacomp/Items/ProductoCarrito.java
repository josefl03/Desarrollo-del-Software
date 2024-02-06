/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp.Items;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author pokes
 */
public class ProductoCarrito implements Serializable {
    String titulo;
    String desc;
    float precio;
    int cantidad;
    LocalDate fecha;

    public ProductoCarrito(String titulo, String desc, float precio, int cantidad, LocalDate fecha) {
        this.titulo = titulo;
        this.desc = desc;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
