/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp.Items;

import com.jose.javacomp.Items.Estructuras.Opinion;
import com.jose.javacomp.Items.Estructuras.Categorias;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pokes
 */
public class Producto implements Serializable {
    //Título del producto
    String titulo;
    //Descripción del objeto en venta
    String desc;
    //Categoría (Para futura búsqueda del producto)
    Categorias categoria;
    //Precio (>0)
    float precio;
    //Fotografía que enseñe el producto
    String imagen;
    //Número de unidades disponibles
    int stock;
    //Fecha en la que se puso a la venta
    LocalDate fechaPublicacion;
    //Opiniones del producto
    HashMap<Integer, Opinion> opiniones;

    public Producto(String titulo, String desc, Categorias categoria, float precio, String imagen, int stock, LocalDate fechaPublicacion, HashMap<Integer, Opinion> opiniones) {
        this.titulo = titulo;
        this.desc = desc;
        this.categoria = categoria;
        this.precio = precio;
        this.imagen = imagen;
        this.stock = stock;
        this.fechaPublicacion = fechaPublicacion;
        this.opiniones = opiniones;
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

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public HashMap<Integer, Opinion> getOpiniones() {
        return opiniones;
    }

    public void setOpiniones(HashMap<Integer, Opinion> opiniones) {
        this.opiniones = opiniones;
    }
    
    //Obtener la calificación media del producto
    public float getCalificacion(){
        if (opiniones.size() > 0){
            float calificacion = 0.0f;
            for (Map.Entry<Integer, Opinion> ent : opiniones.entrySet()){
                Opinion o = ent.getValue();
                calificacion += o.getCalificacion();
            }
            return calificacion / (float)opiniones.size();
        }
        return 0.0f;
    }
}
