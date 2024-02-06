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
public class Empresa extends Cliente implements Serializable {
    String CIF;
    String web;

    public Empresa(String correo, String clave, String nombre, Direccion direccion, Tarjeta tarjeta, int telefono, String CIF, String web) {
        super(correo, clave, nombre, direccion, tarjeta, telefono);
        this.CIF = CIF;
        this.web = web;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }
}
