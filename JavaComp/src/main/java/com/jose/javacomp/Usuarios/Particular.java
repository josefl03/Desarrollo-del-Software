/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp.Usuarios;

import com.jose.javacomp.Usuarios.Estructuras.Direccion;
import com.jose.javacomp.Usuarios.Estructuras.Tarjeta;
import java.io.Serializable;

/**
 *
 * @author pokes
 */
public class Particular extends Cliente implements Serializable {
    String DNI;

    public Particular(String correo, String clave, String nombre, Direccion direccion, Tarjeta tarjeta, int telefono, String DNI) {
        super(correo, clave, nombre, direccion, tarjeta, telefono);
        this.DNI = DNI;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
