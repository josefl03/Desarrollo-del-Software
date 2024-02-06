/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jose.javacomp;

import com.jose.javacomp.Items.Producto;
import com.jose.javacomp.Usuarios.Administrador;
import com.jose.javacomp.Usuarios.Usuario;
import com.jose.javacomp.Ventanas.VentanaLogin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author pokes
 */
public class JavaComp {
    //(Integer) "key": Identificación del producto
    //(Producto) "value": Producto
    public static HashMap<Integer, Producto> prod;
    public static List<Usuario> users;
    
    public static void main(String[] args) {
        prod = new HashMap<Integer, Producto>();
        Almacenamiento.cargarProductos();
        users = new ArrayList<Usuario>();
        Almacenamiento.cargarUsuarios();
        
        //Registramos al usuario administrador por defecto
        users.add(new Administrador("admin@javacomp.com", "admin"));
                
        VentanaLogin vl = new VentanaLogin();
        vl.setVisible(true);
        
        /*ImageIcon img = new ImageIcon("java/resources/grafica1.jpg");
        int ident1 = Utilidades.generarIdentificacion();
        prod.put(ident1, new Producto("Gráfica RTX 3060", "Tarjeta gráfica RTX 3060 con 12GB GDDR6", Categorias.COMPONENTES, 499.95f, img, 34, LocalDate.now(), new ArrayList<Opinion>()));
        int ident2 = Utilidades.generarIdentificacion();
        prod.put(ident2, new Producto("SEXO", "asasasasasasasas", Categorias.CONSOLAS_VIDEOJUEGOS, 499.95f, img, 34, LocalDate.now(), new ArrayList<Opinion>()));
       
        VentanaTienda vt = new VentanaTienda();
        vt.setVisible(true);*/
    }
}
