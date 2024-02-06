/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp.Usuarios.Estructuras;

import java.io.Serializable;

/**
 *
 * @author pokes
 */
public class Direccion implements Serializable {
    String calle;
    int numero;
    int cp; //Código postal
    String ciudad;

    public Direccion(String calle, int numero, int cp, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
