/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jose.javacomp.Ventanas;

import com.jose.javacomp.JavaComp;
import com.jose.javacomp.Usuarios.Cliente;
import com.jose.javacomp.Usuarios.Empresa;
import com.jose.javacomp.Usuarios.Estructuras.Direccion;
import com.jose.javacomp.Usuarios.Estructuras.Tarjeta;
import com.jose.javacomp.Usuarios.Particular;
import com.jose.javacomp.Usuarios.Usuario;
import com.jose.javacomp.Utilidades;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author pokes
 */
public class VentanaRegistro extends javax.swing.JFrame {
    JFrame lastFrame;
    Cliente c;
    /**
     * Creates new form VentanaRegistro
     */
    public VentanaRegistro(JFrame lastFrame, Cliente c) {
        initComponents();
        
        this.lastFrame = lastFrame;
        this.c = c;
        
        if (c != null){
            tituloLabel.setText("Editar datos del usuario");
            
            tipoLabel.setEnabled(false);
            particularRB.setEnabled(false);
            empresaRB.setEnabled(false);
            
            nombreTF.setText(c.getNombre());
            correoTF.setText(c.getCorreo());
            telefonoTF.setText(String.valueOf(c.getTelefono()));
            
            Direccion d = c.getDireccion();
            calleTF.setText(d.getCalle());
            direccionNumeroTF.setText(String.valueOf(d.getNumero()));
            cpTF.setText(String.valueOf(d.getCp()));
            ciudadTF.setText(d.getCiudad());
            
            Tarjeta t = c.getTarjeta();
            titularTF.setText(t.getNombre());
            tarjetaNumeroTF.setText(String.valueOf(t.getNumero()));
            mesTF.setText(String.valueOf(t.getCaducidad().getMonthValue()));
            anoTF.setText(String.valueOf(t.getCaducidad().getYear()));
            
            confirmarButton.setText("Confirmar cambios");
            
            if (c instanceof Particular){
                Particular p = (Particular)c;
                
                particularRB.setSelected(true);
                empresaRB.setSelected(false);
                
                dniTF.setText(p.getDNI());
            }
            else if (c instanceof Empresa){
                Empresa e = (Empresa)c;
                
                particularRB.setSelected(false);
                empresaRB.setSelected(true);
                
                dniTF.setText(e.getCIF());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoBG = new javax.swing.ButtonGroup();
        tituloLabel = new javax.swing.JLabel();
        particularRB = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        empresaRB = new javax.swing.JRadioButton();
        tipoLabel = new javax.swing.JLabel();
        dniTF = new javax.swing.JTextField();
        dniLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        correoTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        clavePF = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        calleTF = new javax.swing.JTextField();
        direccionNumeroTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cpTF = new javax.swing.JTextField();
        ciudadTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        titularTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tarjetaNumeroTF = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        mesTF = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        anoTF = new javax.swing.JTextField();
        telefonoTF = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        webLabel = new javax.swing.JLabel();
        webTF = new javax.swing.JTextField();
        cancelarButton = new javax.swing.JButton();
        confirmarButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        tipoBG.add(particularRB);
        tipoBG.add(empresaRB);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información de usuario (JavaComp)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Registro de nuevo usuario");

        particularRB.setSelected(true);
        particularRB.setText("Particular");
        particularRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                particularRBActionPerformed(evt);
            }
        });

        empresaRB.setText("Empresa");
        empresaRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresaRBActionPerformed(evt);
            }
        });

        tipoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tipoLabel.setText("Tipo:");

        dniLabel.setText("DNI:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Correo:");

        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Dirección:");

        jLabel7.setText("Calle:");

        jLabel8.setText("Número:");

        jLabel9.setText("Código postal:");

        jLabel11.setText("Ciudad:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Tarjeta de crédito:");

        jLabel13.setText("Titular:");

        jLabel14.setText("Número:");

        jLabel15.setText("Caducidad:");

        jLabel16.setText("Mes:");

        jLabel17.setText("Año:");

        jLabel18.setText("Teléfono:");

        webLabel.setText("Web:");
        webLabel.setEnabled(false);

        webTF.setEnabled(false);

        cancelarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        confirmarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmarButton.setText("Confirmar");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dniLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dniTF, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tipoLabel)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(particularRB)
                                        .addGap(33, 33, 33)
                                        .addComponent(empresaRB)
                                        .addGap(34, 34, 34))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(correoTF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clavePF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(webLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(webTF))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(mesTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel17)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(anoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(tarjetaNumeroTF))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel13)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(titularTF))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(ciudadTF))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(direccionNumeroTF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(confirmarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(particularRB)
                            .addComponent(empresaRB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dniTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dniLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clavePF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(webTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(webLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(calleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccionNumeroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(cpTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ciudadTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titularTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tarjetaNumeroTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarButton)
                    .addComponent(cancelarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void particularRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_particularRBActionPerformed
        dniLabel.setText("DNI:");
        webLabel.setEnabled(false);
        webTF.setEnabled(false);
    }//GEN-LAST:event_particularRBActionPerformed

    private void empresaRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresaRBActionPerformed
        dniLabel.setText("CIF:");
        webLabel.setEnabled(true);
        webTF.setEnabled(true);
    }//GEN-LAST:event_empresaRBActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        boolean esParticular = particularRB.isSelected();
        
        String dni = dniTF.getText();
        String nombre = nombreTF.getText();
        String correo = correoTF.getText();
        String clave = String.valueOf(clavePF.getPassword());
        int telefono;
        try{ telefono = Integer.valueOf(telefonoTF.getText()); }
        catch (Exception e){
            errorRegistro("Número de teléfono no válido");
            return;
        }
        //Este valor solo se usará en caso de que se seleccione el usuario de tipo "Empresa"
        String web = webTF.getText();
        
        //Obtenemos y creamos el objeto Dirección
        String calle = calleTF.getText();
        int direccionNumero;
        try{ direccionNumero = Integer.valueOf(direccionNumeroTF.getText()); }
        catch (Exception e){
            errorRegistro("Número de dirección no válido");
            return;
        }
        int cp;
        try{ cp = Integer.valueOf(cpTF.getText()); }
        catch (Exception e){
            errorRegistro("Código postal no válido");
            return;
        }
        String ciudad = ciudadTF.getText();
        Direccion d = new Direccion(calle, direccionNumero, cp, ciudad);
        
        //Obtenemos y creamos el objeto Tarjeta
        String titular = titularTF.getText();
        long tarjetaNumero;
        try{ tarjetaNumero = Long.valueOf(tarjetaNumeroTF.getText()); }
        catch (Exception e){
            errorRegistro("Número de titular no válido");
            return;
        }
        int mes;
        try{ mes = Integer.valueOf(mesTF.getText()); }
        catch (Exception e){
            errorRegistro("Mes de caducidad no válido");
            return;
        }
        int ano;
        try{ ano = Integer.valueOf(anoTF.getText()); }
        catch (Exception e){
            errorRegistro("Año de caducidad no válido");
            return;
        }
        LocalDate caducidad;
        try{
            caducidad = LocalDate.of(ano, mes, 1);
        }
        catch(Exception e){
            errorRegistro("Fecha de caducidad no válida");
            return;
        }
        Tarjeta t = new Tarjeta(titular, tarjetaNumero, caducidad);
        
        //Comprobamos si algún campo está vacío
        //No hace falta comprobar campos como el teléfono o la caducidad porque el propio método Integer.valueOf() ya lanza una excepción si esto ocurre
        if (vacio(dni) ||
                vacio(nombre) ||
                vacio(correo) ||
                vacio(clave) ||
                vacio(calle) ||
                vacio(ciudad) ||
                vacio(titular)){
            errorRegistro("Falta por rellenar algún campo");
            return;
        }
        
        if (c == null){
            //Nuevo usuario
            Usuario u = Utilidades.obtenerUsuario(correo);
            if (u != null){
                //Error: usuario ya existe
                errorRegistro("Ya existe un usuario asociado a esta cuenta de correo");
                return;
            }

            if (esParticular){
                u = new Particular(correo, clave, nombre, d, t, telefono, dni);
            }
            else{
                u = new Empresa(correo, clave, nombre, d, t, telefono, dni, web);
            }

            JavaComp.users.add(u);
            
            infoRegistro("Usuario registrado correctamente");
        }
        else{
            //Editar usuario
            c.setCorreo(correo);
            c.setClave(clave);
            c.setNombre(nombre);
            c.setDireccion(d);
            c.setTarjeta(t);
            c.setTelefono(telefono);
            
            if (esParticular){
                Particular p = (Particular)c;
                p.setDNI(dni);
            }
            else{
                Empresa e = (Empresa)c;
                e.setCIF(dni);
                e.setWeb(web);
            }
            
            infoRegistro("Usuario modificado correctamente");
        }
        
        this.dispose();
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void errorRegistro(String causa){
        JOptionPane.showMessageDialog(this, 
                    causa,
                    "Error al registrar usuario",
                    JOptionPane.ERROR_MESSAGE);
    }
    
    private void infoRegistro(String info){
        JOptionPane.showMessageDialog(this, 
                    info,
                    "Información de usuario",
                    JOptionPane.INFORMATION_MESSAGE);
    }
    
    private boolean vacio(String str){
        return str.toString().equals("");
    }
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        lastFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoTF;
    private javax.swing.JTextField calleTF;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JTextField ciudadTF;
    private javax.swing.JPasswordField clavePF;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JTextField correoTF;
    private javax.swing.JTextField cpTF;
    private javax.swing.JTextField direccionNumeroTF;
    private javax.swing.JLabel dniLabel;
    private javax.swing.JTextField dniTF;
    private javax.swing.JRadioButton empresaRB;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField mesTF;
    private javax.swing.JTextField nombreTF;
    private javax.swing.JRadioButton particularRB;
    private javax.swing.JTextField tarjetaNumeroTF;
    private javax.swing.JTextField telefonoTF;
    private javax.swing.ButtonGroup tipoBG;
    private javax.swing.JLabel tipoLabel;
    private javax.swing.JTextField titularTF;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel webLabel;
    private javax.swing.JTextField webTF;
    // End of variables declaration//GEN-END:variables
}
