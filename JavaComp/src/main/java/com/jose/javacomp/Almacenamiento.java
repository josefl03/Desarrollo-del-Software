/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.javacomp;

import com.jose.javacomp.Items.Producto;
import com.jose.javacomp.Usuarios.Empresa;
import com.jose.javacomp.Usuarios.Particular;
import com.jose.javacomp.Usuarios.Usuario;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

/**
 *
 * @author pokes
 */
public class Almacenamiento {
    
    private static void guardarClase(String donde, Object o){
        try{
            FileOutputStream fos = new FileOutputStream(donde);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(o);

            oos.close();
            fos.close();
        }
        catch(Exception e){
            System.out.println("No se pudo guardar el archivo: " + donde);
            e.printStackTrace();
        }
    }
    
    public static void cargarUsuarios(){
        try{
            File particularesFolder = new File("Usuarios/Particulares/");
            File empresasFolder = new File("Usuarios/Empresas/");
            //Cargar particulares
            for (File f : particularesFolder.listFiles()){
                try{
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    Particular p = (Particular)ois.readObject();
                    JavaComp.users.add(p);

                    ois.close();
                    fis.close();
                }
                catch(Exception e){
                    System.out.println("Error al cargar el Particular: " + f.getName());
                    e.printStackTrace();
                }
            }
            //Cargar empresas
            for (File f : empresasFolder.listFiles()){
                try{
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    Empresa p = (Empresa)ois.readObject();
                    JavaComp.users.add(p);

                    ois.close();
                    fis.close();
                }
                catch(Exception e){
                    System.out.println("Error al cargar la Empresa: " + f.getName());
                    e.printStackTrace();
                }
            }
        }
        catch(Exception e){
            System.out.println("No se pudo cargar los productos");
            e.printStackTrace();
        }
        System.out.println("Cargados " + JavaComp.users.size() + " usuarios");
    }
    
    public static void guardarUsuarios(){
        System.out.println("---- Guardando usuarios ----");
        
        File particularesFolder = new File("Usuarios/Particulares/");
        if (!particularesFolder.exists())
            particularesFolder.mkdirs();
        File empresasFolder = new File("Usuarios/Empresas/");
        if (!empresasFolder.exists())
            empresasFolder.mkdirs();
                
        for (Usuario user : JavaComp.users){
            String correo = user.getCorreo();
            
            if (user instanceof Particular){
                Particular p = (Particular)user;
                
                System.out.print("Guardando particular " + correo + "...");
                guardarClase("Usuarios/Particulares/" + correo, user);
                System.out.println("OK");
            }
            else if (user instanceof Empresa){
                Empresa e = (Empresa)user;
                
                System.out.print("Guardando empresa " + correo + "...");
                guardarClase("Usuarios/Empresas/" + correo, user);
                System.out.println("OK");
            }
        }
    }
    
    public static void cargarProductos(){
        try{
            File productosFolder = new File("Productos/");
            for (File f : productosFolder.listFiles()){
                try{
                    FileInputStream fis = new FileInputStream(f);
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    Producto p = (Producto)ois.readObject();
                    JavaComp.prod.put(Integer.valueOf(f.getName()), p);

                    ois.close();
                    fis.close();
                }
                catch(Exception e){
                }
            }
        }
        catch(Exception e){
            System.out.println("No se pudo cargar los productos");
            e.printStackTrace();
        }
        System.out.println("Cargados " + JavaComp.prod.size() + " productos");
    }
    
    public static void guardarProductos(){
        System.out.println("---- Guardando productos ----");
        
        File productosFolder = new File("Productos/");
        if (!productosFolder.exists())
            productosFolder.mkdirs();
        
        for (Map.Entry<Integer, Producto> ent : JavaComp.prod.entrySet()){
            String fname = "Productos/" + ent.getKey();
            
            Producto p = ent.getValue();
            System.out.print("Guardando " + p.getTitulo() + "...");
            guardarClase(fname, p);
            System.out.println("OK");
        }
    }
}
