/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp.Usuarios;

import com.jose.javacomp.Items.Producto;
import com.jose.javacomp.Items.ProductoCarrito;
import com.jose.javacomp.Usuarios.Estructuras.Direccion;
import com.jose.javacomp.Usuarios.Estructuras.Tarjeta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author pokes
 */
public class Cliente extends Usuario implements Serializable{
    String nombre;
    Direccion direccion;
    Tarjeta tarjeta;
    int telefono;
    List<ProductoCarrito> carrito;
    
    public Cliente(String correo, String clave, String nombre, Direccion direccion, Tarjeta tarjeta, int telefono) {
        super(correo, clave);
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
        this.telefono = telefono;
        
        carrito = new ArrayList<ProductoCarrito>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<ProductoCarrito> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<ProductoCarrito> carrito) {
        this.carrito = carrito;
    }
}
