/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jose.javacomp.Ventanas;

import com.jose.javacomp.Items.Estructuras.Categorias;
import com.jose.javacomp.Items.Producto;
import com.jose.javacomp.Items.ProductoCarrito;
import com.jose.javacomp.Items.ProductoIdent;
import com.jose.javacomp.JavaComp;
import com.jose.javacomp.Ordenacion.OrdenarCalificacion;
import com.jose.javacomp.Ordenacion.OrdenarPrecioMayor;
import com.jose.javacomp.Ordenacion.OrdenarPrecioMenor;
import com.jose.javacomp.Usuarios.Cliente;
import com.jose.javacomp.Usuarios.Estructuras.TipoUsuario;
import static com.jose.javacomp.Usuarios.Estructuras.TipoUsuario.ADMIN;
import static com.jose.javacomp.Usuarios.Estructuras.TipoUsuario.EMPRESA;
import static com.jose.javacomp.Usuarios.Estructuras.TipoUsuario.PARTICULAR;
import com.jose.javacomp.Usuarios.Usuario;
import com.jose.javacomp.Utilidades;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pokes
 */
public class VentanaTienda extends javax.swing.JFrame {
    
    JFrame lastFrame;
    Usuario u;
    Producto selected;
    
    /**
     * Creates new form VentanaTienda
     */
    public VentanaTienda(JFrame lastFrame, Usuario u) {
        initComponents();
        
        this.lastFrame = lastFrame;
        this.u = u;
        //Establecer el nombre y el tipo de usuario
        String nombreTipo;
        TipoUsuario tipo = Utilidades.obtenerTipoUsuario(u);
        switch(tipo){
            case PARTICULAR:
                nombreTipo = "Particular";
                break;
            case EMPRESA:
                nombreTipo = "Empresa";
                break;
            case ADMIN:
                nombreTipo = "Admin";
                break;
            default:
                nombreTipo = "-";
                break;
        }
        usuarioLabel.setText(String.format("%s (%s)", u.getCorreo(), nombreTipo));
        
        //Utilizar botón como carrito en caso de ser un usuario no administrador
        //Utilizar como editor de productos en caso de administrador
        if (tipo == ADMIN){
            datosButton.setText("Editar usuarios");
            carritoButton.setText("Ver facturas");
            
            cantidadLabel.setEnabled(false);
        }
        else{
            Cliente c = (Cliente)u;
            
            carritoButton.setText(String.format("Ver carrito (%d)", c.getCarrito().size()));
            
            nuevoButton.setVisible(false);
            editarButton.setVisible(false);
            eliminarButton.setVisible(false);
        }
    }

    void setInfoMenu(Producto p){
        System.out.print("Estableciendo información en el menú de producto...");
        
        selected = p;
        cantidadSpinner.setValue(0);
        
        if (p != null){
            tituloLabel.setText(p.getTitulo());
            descripcionTextArea.setText(p.getDesc());

            imagenLabel.setText("");
            imagenLabel.setIcon(new ImageIcon(p.getImagen()));

            precioLabel.setText(String.format("Precio: %.02f€", p.getPrecio()));
            stockLabel.setText(String.format("Stock: %d", p.getStock()));

            calificacionLabel.setText(String.format("Calificación: %.02f/5.00", p.getCalificacion()));
            opinionesButton.setEnabled(true);
            opinionesButton.setText(String.format("Ver opiniones (%d)", p.getOpiniones().size()));

            fechaLabel.setText("Publicado el " + p.getFechaPublicacion().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            
            if (Utilidades.obtenerTipoUsuario(u) != ADMIN){
                cantidadSpinner.setEnabled(true);
                meterCarritoButton.setEnabled(true);
            }
        }
        else{
            tituloLabel.setText("Ningún producto seleccionado");
            descripcionTextArea.setText("Seleccione un producto para ver su información o añadir al carrito");

            imagenLabel.setText("Vista previa");
            imagenLabel.setIcon(null);

            precioLabel.setText("Precio: -");
            stockLabel.setText("Stock: -");

            calificacionLabel.setText("Calificación: -.--/5.00");
            opinionesButton.setEnabled(false);
            opinionesButton.setText("Ver opiniones (-)");

            fechaLabel.setText("Publicado el --/--/----");
            
            cantidadSpinner.setEnabled(false);
            meterCarritoButton.setEnabled(false);
        }
        System.out.println("OK");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productosTable = new JTable(){
            public boolean editCellAt(int row, int column, java.util.EventObject e) {
                return false;
            }
        };
        jLabel4 = new javax.swing.JLabel();
        categoriaCB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        palabrasTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buscarButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ordenCB = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        meterCarritoButton = new javax.swing.JButton();
        cantidadSpinner = new javax.swing.JSpinner();
        cantidadLabel = new javax.swing.JLabel();
        imagenLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tituloLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        descripcionTextArea = new javax.swing.JTextArea();
        precioLabel = new javax.swing.JLabel();
        stockLabel = new javax.swing.JLabel();
        opinionesButton = new javax.swing.JButton();
        calificacionLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        carritoButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        datosButton = new javax.swing.JButton();
        nuevoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selección de productos (JavaComp)");
        setMinimumSize(new java.awt.Dimension(1100, 512));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        usuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usuarioLabel.setText("usuario@correo.com (Particular)");

        DefaultTableModel tableModel = new DefaultTableModel(
            new Object [] {
                "Identificacion", "Foto", "Nombre", "Descripción", "[Stock] €/ud", "Calificación"
            }, 0
        ) {
            public Class getColumnClass(int column){
                return getValueAt(0, column).getClass();
            }
        };

        ListSelectionModel selectionModel = productosTable.getSelectionModel();
        selectionModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent ev){
                if (ev.getValueIsAdjusting()){ //Esto previene que el evento se llame dos veces
                    int row = productosTable.getSelectedRow();
                    if (row < 0){
                        setInfoMenu(null);
                    }
                    else{
                        int ident = (int)tableModel.getValueAt(row, 0);
                        Producto p = JavaComp.prod.get(ident);

                        setInfoMenu(p);
                    }
                }
            }
        });
        productosTable.setModel(tableModel);
        productosTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(productosTable);
        productosTable.removeColumn(productosTable.getColumnModel().getColumn(0));

        productosTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        productosTable.setRowHeight(50);
        productosTable.getColumn("Foto").setPreferredWidth(50);
        productosTable.getColumn("Nombre").setPreferredWidth(125);
        productosTable.getColumn("Descripción").setPreferredWidth(424);
        productosTable.getColumn("[Stock] €/ud").setPreferredWidth(90);
        productosTable.getColumn("Calificación").setPreferredWidth(90);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Opciones de búsqueda");

        categoriaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No especificado", "Componentes", "Ordenadores", "Móviles y telefonía", "Multimedia", "Consolas y videojuegos" }));

        jLabel5.setText("Categoría:");

        palabrasTF.setToolTipText("");

        jLabel6.setText("Palabras clave:");

        buscarButton.setText("Buscar");
        buscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Ordenar por:");

        ordenCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indiferente", "Calificación, de menor a mayor", "Precio, de mayor a menor", "Precio, de menor a mayor" }));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Selección de productos");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Información del producto");

        meterCarritoButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        meterCarritoButton.setText("Añadir al carrito");
        meterCarritoButton.setEnabled(false);
        meterCarritoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meterCarritoButtonActionPerformed(evt);
            }
        });

        cantidadSpinner.setEnabled(false);

        cantidadLabel.setText("Cantidad:");

        imagenLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        imagenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenLabel.setText("Vista previa");
        imagenLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tituloLabel.setText("Ningún producto seleccionado");

        descripcionTextArea.setEditable(false);
        descripcionTextArea.setColumns(20);
        descripcionTextArea.setLineWrap(true);
        descripcionTextArea.setRows(5);
        descripcionTextArea.setText("Seleccione un producto para ver su información o añadir al carrito");
        descripcionTextArea.setBorder(null);
        descripcionTextArea.setCaretColor(new java.awt.Color(60, 63, 65));
        descripcionTextArea.setFocusable(false);
        descripcionTextArea.setHighlighter(null);
        descripcionTextArea.setOpaque(false);
        jScrollPane4.setViewportView(descripcionTextArea);

        precioLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        precioLabel.setText("Precio: -");

        stockLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        stockLabel.setText("Stock: -");

        opinionesButton.setText("Ver opiniones (-)");
        opinionesButton.setActionCommand("");
        opinionesButton.setEnabled(false);
        opinionesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opinionesButtonActionPerformed(evt);
            }
        });

        calificacionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calificacionLabel.setText("Calificación: -.--/5.00");

        fechaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fechaLabel.setText("Publicado el --/--/----");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(meterCarritoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cantidadLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadSpinner))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioLabel)
                                    .addComponent(stockLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opinionesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calificacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(fechaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calificacionLabel)
                    .addComponent(precioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opinionesButton)
                    .addComponent(stockLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidadLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(meterCarritoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("JavaComp");

        carritoButton.setText("Ver carrito (0)");
        carritoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoButtonActionPerformed(evt);
            }
        });

        editarButton.setText("Editar producto");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar producto");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        datosButton.setText("Modificar datos");
        datosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosButtonActionPerformed(evt);
            }
        });

        nuevoButton.setText("Añadir producto");
        nuevoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(palabrasTF))
                    .addComponent(buscarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel10)
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carritoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(categoriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ordenCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioLabel)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(datosButton)
                                    .addComponent(carritoButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(editarButton)
                            .addComponent(eliminarButton)
                            .addComponent(nuevoButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(categoriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(ordenCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(palabrasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Volver al menú de inicio de sesión
        lastFrame.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void nuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoButtonActionPerformed
        VentanaEditarProducto vep = new VentanaEditarProducto(this, null);
        vep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nuevoButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        int row = productosTable.getSelectedRow();
        if (row < 0){
            //Error: ningún producto seleccionado;
            errorTienda("No hay ningún producto seleccionado");
            return;
        }
        
        Integer ident;
        try{
            ident = Integer.valueOf(String.valueOf(productosTable.getModel().getValueAt(row, 0)));
        }
        catch(Exception e){
            System.out.println("No se puede editar este producto");
            e.printStackTrace();
            return;
        }
        
        VentanaEditarProducto vep = new VentanaEditarProducto(this, ident);
        vep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        int row = productosTable.getSelectedRow();
        if (row < 0){
            //Error: ningún producto seleccionado;
            errorTienda("No hay ningún producto seleccionado");
            return;
        }
        
        Integer ident;
        try{
            DefaultTableModel dtm = (DefaultTableModel)productosTable.getModel();
            ident = Integer.valueOf(String.valueOf(dtm.getValueAt(row, 0)));
            
            productosTable.clearSelection();
            
            dtm.removeRow(row);
            setInfoMenu(null);
            JavaComp.prod.remove(ident);
            File f = new File("Productos/" + ident);
            f.delete();
            
            infoTienda("Producto eliminado correctamente");
        }
        catch(Exception e){
            System.out.println("No se puede eliminar este producto");
            e.printStackTrace();
            return;
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        cargarProductos(true);
    }//GEN-LAST:event_formComponentShown

    private void opinionesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opinionesButtonActionPerformed
        VentanaOpiniones vo = new VentanaOpiniones(this, u, selected);
        vo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opinionesButtonActionPerformed

    private void carritoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoButtonActionPerformed
        if (Utilidades.obtenerTipoUsuario(u) != ADMIN){
            VentanaCarrito vc = new VentanaCarrito(this, (Cliente)u);
            vc.setVisible(true);
        }
        else{
            VentanaFacturas vf = new VentanaFacturas(this);
            vf.setVisible(true);
        }
        this.setVisible(false);
    }//GEN-LAST:event_carritoButtonActionPerformed

    private void datosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosButtonActionPerformed
        if (Utilidades.obtenerTipoUsuario(u) != ADMIN){
            VentanaRegistro vr = new VentanaRegistro(this, null);
            vr.setVisible(true);
            this.setVisible(false);
        }
        else{
            VentanaEditarUsuarios veu = new VentanaEditarUsuarios(this);
            veu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_datosButtonActionPerformed

    private void buscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarButtonActionPerformed
        cargarProductos(false);
    }//GEN-LAST:event_buscarButtonActionPerformed

    private void meterCarritoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meterCarritoButtonActionPerformed
        int cantidad = (int)cantidadSpinner.getValue();
        
        if (cantidad > selected.getStock()){
            errorTienda("No puedes comprar más productos del stock disponible");
            return;
        }
        
        String titulo = selected.getTitulo();
        String desc = selected.getDesc();
        float precio = selected.getPrecio() * cantidad;
        LocalDate fecha = selected.getFechaPublicacion();
        Cliente c = (Cliente)u;
        c.getCarrito().add(new ProductoCarrito(titulo, desc, precio, cantidad, fecha));
        carritoButton.setText(String.format("Ver carrito (%d)", c.getCarrito().size()));
        
        selected.setStock(selected.getStock() - cantidad);
        setInfoMenu(selected);
        
        infoTienda("Has añadido " + cantidad + " productos del tipo " + titulo + " a tu carrito");
    }//GEN-LAST:event_meterCarritoButtonActionPerformed
    
    private void errorTienda(String causa){
        JOptionPane.showMessageDialog(this, 
                causa,
                "No se pudo completar la operación",
                JOptionPane.ERROR_MESSAGE);
    }
    
    private void infoTienda(String info){
        JOptionPane.showMessageDialog(this, 
                info,
                "Operación completada",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void cargarProductos(boolean init){
        //Cargar productos cada vez que se abra la ventana
        DefaultTableModel dtm = (DefaultTableModel)productosTable.getModel();
        dtm.setRowCount(0);
        
        Categorias cat = null;
        String palabras = "";
        if (!init){
            int cindex = categoriaCB.getSelectedIndex();
            if (cindex > 0){
                cat = Utilidades.convertirIndiceCategoria(cindex - 1);
            }
            
            palabras = palabrasTF.getText();
        }
        
        List<ProductoIdent> tempProd = new ArrayList<ProductoIdent>();
        System.out.println("Número de productos: " + JavaComp.prod.size());
        for (Map.Entry<Integer, Producto> entry : JavaComp.prod.entrySet()){
            Producto p = entry.getValue();
            
            if (cat != null){
                if (p.getCategoria() != cat)
                    continue;
            }
            if (palabras != ""){
                if (!p.getTitulo().contains(palabras) && !p.getDesc().contains(palabras))
                    continue;
            }
            
            tempProd.add(new ProductoIdent(entry.getKey(), p));
        }
        
        int oindex = ordenCB.getSelectedIndex();
        if (oindex > 0){
            switch(oindex){
                default:
                case 1: //Calificación
                    Collections.sort(tempProd, new OrdenarCalificacion());
                    break;
                case 2: //Precio (mayor)
                    Collections.sort(tempProd, new OrdenarPrecioMayor());
                    break;
                case 3: //Precio (menor)
                    Collections.sort(tempProd, new OrdenarPrecioMenor());
                    break;
            }
        }
        
        for (ProductoIdent pi : tempProd){
            Producto p = pi.getProducto();
            
            dtm.addRow(new Object[]{
                pi.getIdentificacion(),
                Utilidades.escalarImagen(p.getImagen(), 50, 50),
                p.getTitulo(),
                p.getDesc(),
                String.format("[%d]   %.02f€", p.getStock(), p.getPrecio()),
                String.format("%.02f/5 (%d)", p.getCalificacion(), p.getOpiniones().size())
                }
            );
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarButton;
    private javax.swing.JLabel calificacionLabel;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JSpinner cantidadSpinner;
    private javax.swing.JButton carritoButton;
    private javax.swing.JComboBox<String> categoriaCB;
    private javax.swing.JButton datosButton;
    private javax.swing.JTextArea descripcionTextArea;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton meterCarritoButton;
    private javax.swing.JButton nuevoButton;
    private javax.swing.JButton opinionesButton;
    private javax.swing.JComboBox<String> ordenCB;
    private javax.swing.JTextField palabrasTF;
    private javax.swing.JLabel precioLabel;
    private javax.swing.JTable productosTable;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JLabel usuarioLabel;
    // End of variables declaration//GEN-END:variables
}
