/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp.Ordenacion;

import com.jose.javacomp.Items.ProductoIdent;
import java.util.Comparator;

/**
 *
 * @author pokes
 */
public class OrdenarCalificacion implements Comparator<ProductoIdent> {
    @Override
    public int compare(ProductoIdent p1, ProductoIdent p2) {
        float c1 = p1.getProducto().getCalificacion();
        float c2 = p2.getProducto().getCalificacion();
        
        float res = c2 - c1;
        if ((int)res == 0){
            if (res > 0.0)
                return 1;
            else if (res < 0.0)
                return -1;
            else
                return 0;
        }
        return (int)res;
    }
}
