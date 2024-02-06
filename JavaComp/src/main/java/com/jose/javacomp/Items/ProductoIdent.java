/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp.Items;

/**
 *
 * @author pokes
 */
public class ProductoIdent {
    int identificacion;
    Producto producto;

    public ProductoIdent(int identificacion, Producto producto) {
        this.identificacion = identificacion;
        this.producto = producto;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
