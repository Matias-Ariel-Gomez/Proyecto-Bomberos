package View;
import ClasesData.*;
import Entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CuartelView extends javax.swing.JInternalFrame {
    private Cuartel c;
    private CuartelData cd;
    private List<Cuartel> listaC;
    DefaultTableModel mod;   
    
    public CuartelView() {
        initComponents();
        c = null;          
        cd = new CuartelData();
        listaC = cd.listarCuartel();
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
        panel_id = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jb_buscar = new javax.swing.JButton();
        jb_cambiar = new javax.swing.JButton();
        jt_codigo = new javax.swing.JTextField();
        jb_eliminar = new javax.swing.JButton();
        panel_datos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jb_guardar = new javax.swing.JButton();
        jt_nombre = new javax.swing.JTextField();
        jt_direc = new javax.swing.JTextField();
        jt_tel = new javax.swing.JTextField();
        jt_mail = new javax.swing.JTextField();
        jb_alta = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_consulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cuartel = new javax.swing.JLabel();
        panel_consultas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jb_activos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cuartel = new javax.swing.JTable();
        jb_baja = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1024, 614));
        setMinimumSize(new java.awt.Dimension(1024, 614));
        setPreferredSize(new java.awt.Dimension(1024, 614));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_id.setBackground(new java.awt.Color(212, 245, 236));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DATOS INTERNOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Código:");

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

        jb_eliminar.setBackground(new java.awt.Color(51, 51, 51));
        jb_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jb_eliminar.setText("Eliminar");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_idLayout = new javax.swing.GroupLayout(panel_id);
        panel_id.setLayout(panel_idLayout);
        panel_idLayout.setHorizontalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(jb_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_cambiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_eliminar)
                        .addGap(40, 40, 40))))
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jb_buscar)
                    .addComponent(jb_cambiar)
                    .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_eliminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 740, 80));

        panel_datos.setBackground(new java.awt.Color(212, 245, 236));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("DATOS DEL CUARTEL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Teléfono:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Dirección:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Mail:");

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
                .addGap(33, 33, 33)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(36, 36, 36)
                                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(28, 28, 28)
                                .addComponent(jt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_mail, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(jt_direc))
                        .addGap(30, 30, 30)
                        .addComponent(jb_guardar)
                        .addGap(27, 27, 27))))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jt_direc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_guardar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 740, 120));

        jb_alta.setBackground(new java.awt.Color(51, 51, 51));
        jb_alta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_alta.setForeground(new java.awt.Color(255, 255, 255));
        jb_alta.setText("Altas");
        jb_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_altaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 70, -1));

        jb_modificar.setBackground(new java.awt.Color(51, 51, 51));
        jb_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jb_consulta.setBackground(new java.awt.Color(51, 51, 51));
        jb_consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_consulta.setForeground(new java.awt.Color(255, 255, 255));
        jb_consulta.setText("Consultas");
        jb_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consultaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión Cuarteles");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        cuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Cuartel.jpg"))); // NOI18N
        jPanel1.add(cuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        panel_consultas.setBackground(new java.awt.Color(212, 245, 236));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("CONSULTAS");

        jb_activos.setBackground(new java.awt.Color(51, 51, 51));
        jb_activos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_activos.setForeground(new java.awt.Color(255, 255, 255));
        jb_activos.setText("Activos");
        jb_activos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_activosActionPerformed(evt);
            }
        });

        tabla_cuartel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_cuartel);

        javax.swing.GroupLayout panel_consultasLayout = new javax.swing.GroupLayout(panel_consultas);
        panel_consultas.setLayout(panel_consultasLayout);
        panel_consultasLayout.setHorizontalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultasLayout.createSequentialGroup()
                .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_consultasLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_activos))
                    .addGroup(panel_consultasLayout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        panel_consultasLayout.setVerticalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jb_activos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(panel_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 740, 140));

        jb_baja.setBackground(new java.awt.Color(51, 51, 51));
        jb_baja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_baja.setForeground(new java.awt.Color(255, 255, 255));
        jb_baja.setText("Bajas");
        jb_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bajaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 790, 590));

        jb_salir.setBackground(new java.awt.Color(51, 51, 51));
        jb_salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setText("Salir");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
                
        int codigo = Integer.parseInt(jt_codigo.getText());
        c=cd.buscarCuartel(codigo);
        
        try{
                       
            if (codigo==c.getCodCuartel()) {

                datosVer();
                jb_guardar.setVisible(false);

                jt_nombre.setText(c.getNombreCuartel());
                jt_direc.setText(c.getDireccion()+ "");
                jt_tel.setText(c.getTelefono());
                jt_mail.setText(c.getMail());

            } else {
                JOptionPane.showMessageDialog(null, "El Cuartel no existe en la base de datos. ");
            } 
        
        }catch(NumberFormatException nfe){
        
            JOptionPane.showMessageDialog(null, "Reingrese el código ");
        }

        
    }//GEN-LAST:event_jb_buscarActionPerformed

    private void jb_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cambiarActionPerformed
        limpiarCelda();
        
        String nombre = jt_nombre.getText();
        double direccion=Double.parseDouble(jt_direc.getText());
        String tel = jt_tel.getText();
        String mail= jt_mail.getText();

        try{
            if (c !=null) {

                c.setNombreCuartel(nombre);
                c.getDireccion();
                c.setTelefono(tel);
                c.setMail(mail);

                cd.modificarCuartel(c);

            }else {
                JOptionPane.showMessageDialog(null, " El registro no existe en la Base de Datos. ");
            }
            id();
            datos();
        }catch (NullPointerException np) {

            JOptionPane.showMessageDialog(null, " Datos mal ingresados. ");
        }

        
    }//GEN-LAST:event_jb_cambiarActionPerformed

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        limpiarCelda();
        
        String nombre = jt_nombre.getText();
        double direccion=Double.parseDouble(jt_direc.getText());
        String tel = jt_tel.getText();
        String mail= jt_mail.getText();

        try{
            if (nombre.isEmpty() && tel.isEmpty() && mail.isEmpty()) {

                JOptionPane.showMessageDialog(null, "No se admiten campos vacios. ");
                return;
            }

            if (c == null) {
                c = new Cuartel(nombre, direccion, tel, mail);
                cd.guardarCuartel(c);
            }else {

                JOptionPane.showMessageDialog(null, " El registro ya existe en la Base de Datos. ");
            }

        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, " Datos mal ingresados. ");

        }
        datos();
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_altaActionPerformed
        limpiarCelda();
        datosVer();
        edit();
    }//GEN-LAST:event_jb_altaActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        limpiarCelda();
        idVer();
        datosVer();
        edit();
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_consultaActionPerformed
        borrarFilas();
        consultaVer();        
    }//GEN-LAST:event_jb_consultaActionPerformed

    private void jb_activosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_activosActionPerformed
        borrarFilas();
        
        try {

                cargarActivos();

        } catch (NullPointerException npe) {

            JOptionPane.showMessageDialog(this, " No se encontraron Bomberos que cumplan con el criterio.");

        }
        
    }//GEN-LAST:event_jb_activosActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bajaActionPerformed
        limpiarCelda();
        idVer();
        datosVer();
    }//GEN-LAST:event_jb_bajaActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
                    
        try {
            if (c != null) {

                int codigo = Integer.parseInt(jt_codigo.getText());
                c = cd.buscarCuartel(codigo);
                cd.eliminarCuartel(codigo);

            } else {

                JOptionPane.showMessageDialog(null, "El Cuartel no existe en la base de datos. ");
            }
            id();
            datos();
                    
        }catch(NumberFormatException nfe) {
            
            JOptionPane.showMessageDialog(null, "Reingrese el código ");
        }
            
            
       
                
    
    }//GEN-LAST:event_jb_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuartel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_activos;
    private javax.swing.JButton jb_alta;
    private javax.swing.JButton jb_baja;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_cambiar;
    private javax.swing.JButton jb_consulta;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JTextField jt_codigo;
    private javax.swing.JTextField jt_direc;
    private javax.swing.JTextField jt_mail;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_tel;
    private javax.swing.JPanel panel_consultas;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panel_id;
    private javax.swing.JTable tabla_cuartel;
    // End of variables declaration//GEN-END:variables

public void cabeceras(){
    ArrayList<Object>filaCab=new ArrayList<>();
    
    filaCab.add(" CÓDIGO ");
    filaCab.add(" NOMBRE ");
    filaCab.add(" DIRECCION");
    filaCab.add(" TELEFONO ");
    filaCab.add(" MAIL ");    

    for (Object fc: filaCab){
        mod.addColumn(fc);        
    }
    tabla_cuartel.setModel(mod);
}

private void borrarFilas(){
    int f=tabla_cuartel.getRowCount()-1;   

    for (; f>=0; f--) {    
        mod.removeRow(f);
    }
}

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

    panel_datos.setVisible(true);}

public void consulta(){   

    panel_consultas.setVisible(false);}

public void consultaVer(){   

    panel_consultas.setVisible(true);}

public void cargarActivos(){   

    List<Cuartel> listaC = cd.listarCuartel();

    for (Cuartel x : listaC) {
        mod.addRow(new Object[]{x.getCodCuartel(),x.getNombreCuartel(), x.getDireccion(), x.getTelefono(), x.getMail()});

    }
}

public void noEdit(){
    jt_nombre.setEditable(false);
    jt_direc.setEditable(false);
    jt_tel.setEditable(false);
    jt_mail.setEditable(false);
}

public void edit(){
    jt_nombre.setEditable(true);
    jt_direc.setEditable(true);
    jt_tel.setEditable(true);
    jt_mail.setEditable(true);
}

public void limpiarCelda(){
    jt_codigo.setText("");
    jt_nombre.setText("");
    jt_tel.setText("");
    jt_direc.setText("");
    jt_mail.setText(""); 
    
}
}
