package Vistas;

import ClasesData.*;
import Entidades.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaBrigada extends javax.swing.JInternalFrame {
    private Cuartel c;
    private Brigada br;
    private CuartelData cd;
    private BrigadaData brd;
    private List<Cuartel>lista;  
    DefaultTableModel mod;  
    DefaultComboBoxModel box=new DefaultComboBoxModel();
    
    public VistaBrigada() {
        initComponents();
        br=null;
        c=null;
        cd=new CuartelData();
        brd=new BrigadaData();        
        lista=cd.listarCuartel();
        mod=new DefaultTableModel();
        cabeceras();              
        id();
        datos();
        consulta();
        noEdit();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        brigada = new javax.swing.JLabel();
        lgestionbrigrada = new javax.swing.JLabel();
        jb_alta = new javax.swing.JButton();
        jb_baja = new javax.swing.JButton();
        panel_datos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jt_esp = new javax.swing.JTextField();
        jrb_estado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jcb_cuartel = new javax.swing.JComboBox<>();
        jb_guardar = new javax.swing.JButton();
        jb_consultas = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        panel_consulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_consulta = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jb_listarActivos = new javax.swing.JButton();
        jb_listarPasivos = new javax.swing.JButton();
        jb_listarPorCuar = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        panel_id = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jt_codigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jb_buscar = new javax.swing.JButton();
        jb_cambiar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 614));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(820, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Image20231018194921.jpg"))); // NOI18N
        jPanel1.add(brigada, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        lgestionbrigrada.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lgestionbrigrada.setForeground(new java.awt.Color(255, 255, 255));
        lgestionbrigrada.setText("Gestión Brigada");
        jPanel1.add(lgestionbrigrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jb_alta.setBackground(new java.awt.Color(51, 51, 51));
        jb_alta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_alta.setForeground(new java.awt.Color(255, 255, 255));
        jb_alta.setText("Altas");
        jb_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_altaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 100, -1));

        jb_baja.setBackground(new java.awt.Color(51, 51, 51));
        jb_baja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_baja.setForeground(new java.awt.Color(255, 255, 255));
        jb_baja.setText("Bajas");
        jb_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bajaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 100, -1));

        panel_datos.setBackground(new java.awt.Color(212, 245, 236));
        panel_datos.setForeground(new java.awt.Color(76, 212, 152));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Especialidad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Cuartel:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Estado");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("DATOS PERSONALES");

        jb_guardar.setBackground(new java.awt.Color(51, 51, 51));
        jb_guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_esp, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jcb_cuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 164, Short.MAX_VALUE))
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jrb_estado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_guardar)
                                .addGap(31, 31, 31))))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27))))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jcb_cuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jt_esp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5))
                    .addComponent(jrb_estado)
                    .addComponent(jb_guardar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(panel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 790, 110));

        jb_consultas.setBackground(new java.awt.Color(51, 51, 51));
        jb_consultas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_consultas.setForeground(new java.awt.Color(255, 255, 255));
        jb_consultas.setText("Consultas");
        jb_consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consultasActionPerformed(evt);
            }
        });
        jPanel1.add(jb_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 100, -1));

        jb_modificar.setBackground(new java.awt.Color(51, 51, 51));
        jb_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 100, -1));

        panel_consulta.setBackground(new java.awt.Color(212, 245, 236));

        tabla_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_consulta);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("CONSULTAS");

        jb_listarActivos.setBackground(new java.awt.Color(51, 51, 51));
        jb_listarActivos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_listarActivos.setForeground(new java.awt.Color(255, 255, 255));
        jb_listarActivos.setText("Activas");
        jb_listarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listarActivosActionPerformed(evt);
            }
        });

        jb_listarPasivos.setBackground(new java.awt.Color(51, 51, 51));
        jb_listarPasivos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_listarPasivos.setForeground(new java.awt.Color(255, 255, 255));
        jb_listarPasivos.setText("Pasivas");
        jb_listarPasivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listarPasivosActionPerformed(evt);
            }
        });

        jb_listarPorCuar.setBackground(new java.awt.Color(51, 51, 51));
        jb_listarPorCuar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_listarPorCuar.setForeground(new java.awt.Color(255, 255, 255));
        jb_listarPorCuar.setText("Por Cuartel");
        jb_listarPorCuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listarPorCuarActionPerformed(evt);
            }
        });

        jb_salir.setBackground(new java.awt.Color(51, 51, 51));
        jb_salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setText("Salir");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_consultaLayout = new javax.swing.GroupLayout(panel_consulta);
        panel_consulta.setLayout(panel_consultaLayout);
        panel_consultaLayout.setHorizontalGroup(
            panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_consultaLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_consultaLayout.createSequentialGroup()
                        .addComponent(jb_listarActivos)
                        .addGap(18, 18, 18)
                        .addComponent(jb_listarPasivos)
                        .addGap(18, 18, 18)
                        .addComponent(jb_listarPorCuar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_salir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        panel_consultaLayout.setVerticalGroup(
            panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_listarActivos)
                    .addComponent(jb_listarPasivos)
                    .addComponent(jb_listarPorCuar)
                    .addComponent(jb_salir))
                .addContainerGap())
        );

        jPanel1.add(panel_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 790, 160));

        panel_id.setBackground(new java.awt.Color(212, 245, 236));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Código: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("DATOS INTERNOS");

        jb_buscar.setBackground(new java.awt.Color(51, 51, 51));
        jb_buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_buscar.setForeground(new java.awt.Color(255, 255, 255));
        jb_buscar.setText("Buscar");
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });

        jb_cambiar.setBackground(new java.awt.Color(51, 51, 51));
        jb_cambiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_cambiar.setForeground(new java.awt.Color(255, 255, 255));
        jb_cambiar.setText("Actualizar");
        jb_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cambiarActionPerformed(evt);
            }
        });

        jb_borrar.setBackground(new java.awt.Color(51, 51, 51));
        jb_borrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_borrar.setForeground(new java.awt.Color(255, 255, 255));
        jb_borrar.setText("Eliminar");
        jb_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_idLayout = new javax.swing.GroupLayout(panel_id);
        panel_id.setLayout(panel_idLayout);
        panel_idLayout.setHorizontalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                        .addComponent(jb_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_cambiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_borrar)
                        .addGap(20, 20, 20))))
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_buscar)
                    .addComponent(jb_cambiar)
                    .addComponent(jb_borrar))
                .addContainerGap())
        );

        jPanel1.add(panel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 790, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -30, 850, 620));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1050, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_altaActionPerformed
        datosVer();        
        edit();
        cargarbox();  
    }//GEN-LAST:event_jb_altaActionPerformed

    private void jb_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bajaActionPerformed
        idVer();
    }//GEN-LAST:event_jb_bajaActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        idVer();
        datosVer();
        edit();
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_consultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_consultasActionPerformed
        consultaVer();
        especial();
        cargarbox();
    }//GEN-LAST:event_jb_consultasActionPerformed

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        int codigo = Integer.parseInt(jt_codigo.getText());
        br=brd.buscarBrigada(codigo);
        
        try {          
            
            if (codigo==br.getCodBrigada()) {
                datosVer();
                jb_guardar.setVisible(false);                
                jt_nombre.setText(br.getNombreClave());
                jt_esp.setText(br.getEspecialidad());                
                jcb_cuartel.setSelectedItem(br.getCuartel().getCodCuartel());
                jrb_estado.setSelected(br.isEstadoBrigada());

            } else {
                JOptionPane.showMessageDialog(null, "La Brigada no existe en la base de datos. ");
            }
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Solo se admiten valores numericos. ");
        }
        jt_codigo.setText("");
        id();
        datos();
        
    }//GEN-LAST:event_jb_buscarActionPerformed

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        
        String nombre = jt_nombre.getText();
        String espec = jt_esp.getText();
        Cuartel x = (Cuartel) jcb_cuartel.getSelectedItem();
        boolean estado = jrb_estado.isSelected();     
            
       try{          

            if (!nombre.isEmpty() && !espec.isEmpty()) {

                JOptionPane.showMessageDialog(null, "No se admiten campos vacios. ");
                return;
            }

            if (br == null) {

                br = new Brigada(nombre, espec, x, estado);
                brd.guardarBrigada(br);

            }else {      
                
                JOptionPane.showMessageDialog(null, " El registro ya existe en la Base de Datos. ");
            }
            
        } catch (NullPointerException np) {

            JOptionPane.showMessageDialog(null, " Datos mal ingresados. ");
        }
        datos();
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cambiarActionPerformed
         
        String nombre = jt_nombre.getText();
        String espec = jt_esp.getText();
        boolean estado=jrb_estado.isSelected();
       
       
        try{
             if (br !=null) {
              
               
                br.setNombreClave(nombre);
                br.setEspecialidad(espec);
                br.isEstadoBrigada();
               
                brd.modificarBrigada(br);
            
             }else {
                 JOptionPane.showMessageDialog(null, " El registro no existe en la Base de Datos. ");
             }
             
            
        }catch (NullPointerException np) {

            JOptionPane.showMessageDialog(null, " Datos mal ingresados. ");
        }
        jt_codigo.setText("");
        id();
        datos();                                             
      
    }//GEN-LAST:event_jb_cambiarActionPerformed

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
        int codigo = Integer.parseInt(jt_codigo.getText());
        br=brd.buscarBrigada(codigo);
        
        try{
            if(br!=null){
                
                brd.eliminarBrigada(codigo);
                
            }else {
                 
                JOptionPane.showMessageDialog(null, "La Brigada no existe en la base de datos. ");
            }
            datos();
            id();
            
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "solo se admiten valores numericos. ");
        } 
        jt_codigo.setText("");
        id();
    }//GEN-LAST:event_jb_borrarActionPerformed

    private void jb_listarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listarActivosActionPerformed
        
        try {
            cargarActivos();
            
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Brigadas que cumplan con el criterio.");
        }
        borrarFilas();
        consulta();
    }//GEN-LAST:event_jb_listarActivosActionPerformed

    private void jb_listarPasivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listarPasivosActionPerformed
        
        try {
            cargarPasivos();
            
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Brigadas que cumplan con el criterio.");
        }
        borrarFilas();
        consulta();
    }//GEN-LAST:event_jb_listarPasivosActionPerformed

    private void jb_listarPorCuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listarPorCuarActionPerformed
       
    }//GEN-LAST:event_jb_listarPorCuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brigada;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_alta;
    private javax.swing.JButton jb_baja;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_cambiar;
    private javax.swing.JButton jb_consultas;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_listarActivos;
    private javax.swing.JButton jb_listarPasivos;
    private javax.swing.JButton jb_listarPorCuar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JComboBox<String> jcb_cuartel;
    private javax.swing.JRadioButton jrb_estado;
    private javax.swing.JTextField jt_codigo;
    private javax.swing.JTextField jt_esp;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JLabel lgestionbrigrada;
    private javax.swing.JPanel panel_consulta;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panel_id;
    private javax.swing.JTable tabla_consulta;
    // End of variables declaration//GEN-END:variables
public void id(){
    
    panel_id.setVisible(false);
}
public void idVer(){
    
    panel_id.setVisible(true);
}
public void datos(){
    
    panel_datos.setVisible(false);
}
public void datosVer(){
    
    panel_datos.setVisible(true);
}
public void consulta(){
    
    panel_consulta.setVisible(false);
}
public void consultaVer(){
    
    panel_consulta.setVisible(true);
}
public void especial(){
    jLabel2.setVisible(false);
    jLabel3.setVisible(false);
    jLabel5.setVisible(false);
    jLabel6.setVisible(false);    
    panel_datos.setVisible(true);
    jt_nombre.setVisible(false);
    jt_esp.setVisible(false);
    jcb_cuartel.setVisible(true);
    jrb_estado.setVisible(false);
    jb_guardar.setVisible(false);
}
public void Noespecial(){
   jLabel2.setVisible(false);
    jLabel3.setVisible(false);
    jLabel5.setVisible(false);
    jLabel6.setVisible(false);    
    panel_datos.setVisible(false);
    jt_nombre.setVisible(false);
    jt_esp.setVisible(false);
    jcb_cuartel.setVisible(false);
    jrb_estado.setVisible(false);
    jb_guardar.setVisible(false);
}
public void cabeceras(){
    ArrayList<Object>filaCab=new ArrayList<>();
    filaCab.add(" NOMBRE ");
    filaCab.add(" ESPECIALIDAD");
    filaCab.add(" CUARTEL ");
     
    for (Object fc: filaCab){
        mod.addColumn(fc);
    }
    
    tabla_consulta.setModel(mod);
}
private void borrarFilas(){

    int f=tabla_consulta.getRowCount()-1;
    
    for (; f>=0; f--) {
        
        mod.removeRow(f);
    }
} 
public void cargarActivos(){
    
    List<Brigada> listaB = brd.listarBrigadasDisponibles();

    for (Brigada x : listaB) {

        mod.addRow(new Object[]{x.getCodBrigada(), x.getNombreClave(), x.getEspecialidad(), x.getCuartel()});
    }

}
public void cargarPasivos(){
    
    List<Brigada> listaB = brd.listarBrigadasNoDisponibles();

    for (Brigada x : listaB) {

          mod.addRow(new Object[]{x.getCodBrigada(), x.getNombreClave(), x.getEspecialidad(), x.getCuartel()});
    }

}   
//public void cargarPorBrigada(){
//    
//    for (Bombero x : brd.) {
//        
//        mod.addRow(new Object[]{x.getCodBombero(),x.getDni(), x.getNombreCompleto(), x.getGrupoSanguineo(), x.getFechaNacimiento().toString(), x.getTelCelular(), x.getBrigada().getCodBrigada()});
//    }
//}
public void cargarbox() {
    for (Cuartel cuartel : lista) {
            box.addElement(c);
        }
       
}
public void noEdit() {

        jt_nombre.setEditable(false);
        jt_esp.setEditable(false);
        jcb_cuartel.setEditable(false);
        jrb_estado.setEnabled(false);
    }
public void edit() {

        jt_nombre.setEditable(true);
        jt_esp.setEditable(true);
        jcb_cuartel.setEditable(true);
        jrb_estado.setEnabled(true);
    }
}
