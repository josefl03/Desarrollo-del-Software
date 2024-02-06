/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp;

import com.jose.javacomp.Items.Estructuras.Categorias;
import static com.jose.javacomp.Items.Estructuras.Categorias.COMPONENTES;
import static com.jose.javacomp.Items.Estructuras.Categorias.CONSOLAS_VIDEOJUEGOS;
import static com.jose.javacomp.Items.Estructuras.Categorias.MOVILES_TELEFONIA;
import static com.jose.javacomp.Items.Estructuras.Categorias.MULTIMEDIA;
import static com.jose.javacomp.Items.Estructuras.Categorias.ORDENADORES;
import com.jose.javacomp.Items.Producto;
import com.jose.javacomp.Usuarios.Administrador;
import com.jose.javacomp.Usuarios.Empresa;
import com.jose.javacomp.Usuarios.Estructuras.TipoUsuario;
import com.jose.javacomp.Usuarios.Particular;
import com.jose.javacomp.Usuarios.Usuario;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author pokes
 */
public class Utilidades {
    static Random rng = new Random();
    
    public static int generarIdentificacion(){
        //Generamos un número aleatorio para la identificación
        int ident = rng.nextInt(0, Integer.MAX_VALUE);
        //Comprobamos si otro producto ya cuenta con la misma identificación
        if (JavaComp.prod.get(ident) != null)
            //Generamos otra identificación si esta ya existe (recursivamente)
            ident = generarIdentificacion();
        return ident;
    }
    
    public static int generarIdentificacionComentario(Producto p){
        //Generamos un número aleatorio para la identificación del comentario
        int ident = rng.nextInt(0, Integer.MAX_VALUE);
        //Comprobamos si otro comentario tiene ya la misma identificación
        if (p.getOpiniones().get(ident) != null)
            //Generamos otra identificación si esta ya existe (recursivamente)
            ident = generarIdentificacionComentario(p);
        return ident;
    }
    
    public static TipoUsuario obtenerTipoUsuario(Usuario u){
        Class c = u.getClass();
        if (c == Particular.class)
            return TipoUsuario.PARTICULAR;
        else if (c == Empresa.class)
            return TipoUsuario.EMPRESA;
        else if (c == Administrador.class)
            return TipoUsuario.ADMIN;
        
        return TipoUsuario.DESCONOCIDO;
    }
    
    public static Usuario obtenerUsuario(String correo){
        for (Usuario u : JavaComp.users){
            if (correo.equals(u.getCorreo()))
                return u;
        }
        return null;
    }
    
    public static int convertirCategoriaIndice(Categorias c){
        //Esta función convierte una categoría del tipo Categoría en un índice de ComboBox
        switch(c){
            default:
            case COMPONENTES:
                return 0;
            case ORDENADORES:
                return 1;
            case MOVILES_TELEFONIA:
                return 2;
            case MULTIMEDIA:
                return 3;
            case CONSOLAS_VIDEOJUEGOS:
                return 4;
        }
    }
    
    public static Categorias convertirIndiceCategoria(int i){
        //Esta función convierte un índice de ComboBox en una categoría del tipo Categoría
        switch(i){
            default:
            case 0:
                return COMPONENTES;
            case 1:
                return ORDENADORES;
            case 2:
                return MOVILES_TELEFONIA;
            case 3:
                return MULTIMEDIA;
            case 4:
                return CONSOLAS_VIDEOJUEGOS;
        }
    }
    
    public static ImageIcon escalarImagen(String imagen, int w, int h){
        return new ImageIcon(new ImageIcon(imagen).getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
    }
}
