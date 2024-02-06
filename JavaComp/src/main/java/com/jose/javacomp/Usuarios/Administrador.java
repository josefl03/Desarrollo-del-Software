/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp.Usuarios;

import java.io.Serializable;

/**
 *
 * @author pokes
 */
public class Administrador extends Usuario implements Serializable {

    public Administrador(String correo, String clave) {
        super(correo, clave);
    }
    
}
