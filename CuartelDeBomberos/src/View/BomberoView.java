package View;

import Entidades.*;
import ClasesData.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BomberoView extends javax.swing.JInternalFrame {

    private Bombero b;
    private Brigada br;
    private BomberoData bd;
    private BrigadaData brd;
    private List<Brigada> listaBr;
    private List<Bombero> lista;
    DefaultTableModel mod;

    public BomberoView() {
        initComponents();
        b = null;
        br = new Brigada();
        bd = new BomberoData();
        brd = new BrigadaData();
        mod = new DefaultTableModel();
        lista = bd.listarBomberosActivos();
        listaBr = brd.listarBrigadas();
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
        jLabel1 = new javax.swing.JLabel();
        bombero = new javax.swing.JLabel();
        panel_datos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jt_grupo = new javax.swing.JTextField();
        jt_tel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jrb_estado = new javax.swing.JRadioButton();
        jb_guardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jdc_fecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jcb_brigada = new javax.swing.JComboBox();
        jt_doc = new javax.swing.JTextField();
        jb_modificar = new javax.swing.JButton();
        panel_consultas = new javax.swing.JPanel();
        jb_activos = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_bombero = new javax.swing.JTable();
        jb_pasivos = new javax.swing.JButton();
        jb_PorBrigada = new javax.swing.JButton();
        jb_baja = new javax.swing.JButton();
        jb_alta = new javax.swing.JButton();
        panel_id = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jt_codigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jb_cambiar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jb_buscar = new javax.swing.JButton();
        jb_consulta = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 614));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión Bomberos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        bombero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Bombero.jpg"))); // NOI18N
        jPanel1.add(bombero, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        panel_datos.setBackground(new java.awt.Color(212, 245, 236));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre completo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Grupo Sanguineo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Telefono:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("DATOS PERSONALES");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Estado:");

        jb_guardar.setBackground(new java.awt.Color(51, 51, 51));
        jb_guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fecha de Nacimiento:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Brigada:");

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(106, 106, 106)
                                .addComponent(jt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_datosLayout.createSequentialGroup()
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdc_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(jcb_brigada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrb_estado))
                            .addComponent(jb_guardar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30))))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_estado)
                    .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jt_doc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))))
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(9, 9, 9)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jcb_brigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_guardar)
                        .addGap(26, 26, 26))))
        );

        jPanel1.add(panel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 830, 130));

        jb_modificar.setBackground(new java.awt.Color(51, 51, 51));
        jb_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 100, 30));

        panel_consultas.setBackground(new java.awt.Color(212, 245, 236));
        panel_consultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_activos.setBackground(new java.awt.Color(51, 51, 51));
        jb_activos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_activos.setForeground(new java.awt.Color(255, 255, 255));
        jb_activos.setText(" Activos");
        jb_activos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_activosActionPerformed(evt);
            }
        });
        panel_consultas.add(jb_activos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("CONSULTAS");
        panel_consultas.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        tabla_bombero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_bombero);

        panel_consultas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 780, 90));

        jb_pasivos.setBackground(new java.awt.Color(51, 51, 51));
        jb_pasivos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_pasivos.setForeground(new java.awt.Color(255, 255, 255));
        jb_pasivos.setText("Pasivos");
        jb_pasivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pasivosActionPerformed(evt);
            }
        });
        panel_consultas.add(jb_pasivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jb_PorBrigada.setBackground(new java.awt.Color(51, 51, 51));
        jb_PorBrigada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_PorBrigada.setForeground(new java.awt.Color(255, 255, 255));
        jb_PorBrigada.setText("Por Cuartel");
        jb_PorBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_PorBrigadaActionPerformed(evt);
            }
        });
        panel_consultas.add(jb_PorBrigada, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        jPanel1.add(panel_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 830, 140));

        jb_baja.setBackground(new java.awt.Color(51, 51, 51));
        jb_baja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_baja.setForeground(new java.awt.Color(255, 255, 255));
        jb_baja.setText("Bajas");
        jb_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bajaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, 30));

        jb_alta.setBackground(new java.awt.Color(51, 51, 51));
        jb_alta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_alta.setForeground(new java.awt.Color(255, 255, 255));
        jb_alta.setText("Altas");
        jb_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_altaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 30));

        panel_id.setBackground(new java.awt.Color(212, 245, 236));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Código:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DATOS INTERNOS");

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

        jb_buscar.setBackground(new java.awt.Color(51, 51, 51));
        jb_buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_buscar.setForeground(new java.awt.Color(255, 255, 255));
        jb_buscar.setText("Buscar");
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_idLayout = new javax.swing.GroupLayout(panel_id);
        panel_id.setLayout(panel_idLayout);
        panel_idLayout.setHorizontalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(71, 71, 71)
                        .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                        .addComponent(jb_buscar)))
                .addGap(10, 10, 10)
                .addComponent(jb_cambiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_eliminar)
                .addGap(33, 33, 33))
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cambiar)
                    .addComponent(jb_eliminar)
                    .addComponent(jb_buscar)
                    .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(22, 22, 22))
        );

        jPanel1.add(panel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 830, 70));

        jb_consulta.setBackground(new java.awt.Color(51, 51, 51));
        jb_consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_consulta.setForeground(new java.awt.Color(255, 255, 255));
        jb_consulta.setText("Consultas");
        jb_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consultaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 870, 590));

        jb_salir.setBackground(new java.awt.Color(51, 51, 51));
        jb_salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setText("Salir");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 450, 80, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1020, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        cargarbox();             
        idVer();
        datosVer();
        edit();
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed

        try {

            String dni = jt_doc.getText();
            String nombre = jt_nombre.getText();
            String grupo = jt_grupo.getText();
            java.util.Date fn = jdc_fecha.getDate();
            LocalDate fechaNacimiento = fn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String tel = jt_tel.getText();
            Brigada x = (Brigada) jcb_brigada.getSelectedItem();
            boolean estado = jrb_estado.isSelected();

            if (!dni.isEmpty() && !nombre.isEmpty() && !grupo.isEmpty() && tel.isEmpty()) {

                JOptionPane.showMessageDialog(null, "No se admiten campos vacios. ");
                return;
            }

            if (b == null) {

                b = new Bombero(dni, nombre, grupo, fechaNacimiento, tel, x, estado);
                bd.guardarBombero(b);

            } else {

                JOptionPane.showMessageDialog(null, " El registro ya existe en la Base de Datos. ");
            }

        } catch (NullPointerException np) {

            JOptionPane.showMessageDialog(null, " Datos mal ingresados. ");
        }
        datos();

    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_altaActionPerformed
        cargarbox();       
        datosVer();
        edit();


    }//GEN-LAST:event_jb_altaActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bajaActionPerformed
        limpiarCelda();
        idVer();
        datosVer();
    }//GEN-LAST:event_jb_bajaActionPerformed

    private void jb_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_consultaActionPerformed
        cargarbox();
        borrarFilas();
        limpiarCelda();
        consultaVer();
        especial();

    }//GEN-LAST:event_jb_consultaActionPerformed

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed

        int codigo = Integer.parseInt(jt_codigo.getText());
        b = bd.buscarBombero(codigo);

        try {

            if (codigo == b.getCodBombero()) {
                datosVer();
                jb_guardar.setVisible(false);

                jt_doc.setText(b.getDni());
                jt_nombre.setText(b.getNombreCompleto());
                jt_grupo.setText(b.getGrupoSanguineo());
                LocalDate ld = b.getFechaNacimiento();
                java.util.Date d = java.util.Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jdc_fecha.setDate(d);
                jt_tel.setText(b.getTelCelular());
                jcb_brigada.setSelectedItem(b.getBrigada().getCodBrigada());
                jrb_estado.setSelected(b.isEstadoBombero());

            } else {
                JOptionPane.showMessageDialog(null, "El bombero no existe en la base de datos. ");

            }
            
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "solo se admiten valores numericos. ");

        }

    }//GEN-LAST:event_jb_buscarActionPerformed

    private void jb_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cambiarActionPerformed
        

        String nombre = jt_nombre.getText();
        String grupo = jt_grupo.getText();
        String tel = jt_tel.getText();
        Brigada x = (Brigada) jcb_brigada.getSelectedItem();
        boolean estado = jrb_estado.isSelected();

        try {
            if (b != null) {

                b.setNombreCompleto(nombre);
                b.setGrupoSanguineo(grupo);
                b.setTelCelular(tel);
                b.setBrigada(x);
                b.isEstadoBombero();               

                bd.modificarBombero(b);

            } else {
                JOptionPane.showMessageDialog(null, " El registro no existe en la Base de Datos. ");
            }
            id();
            datos();

        } catch (NullPointerException np) {

            JOptionPane.showMessageDialog(null, " Datos mal ingresados. ");
        }
        


    }//GEN-LAST:event_jb_cambiarActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed

        int codigo = Integer.parseInt(jt_codigo.getText());
        b = bd.buscarBombero(codigo);

        try {
            if (b != null) {

                bd.eliminarBombero(codigo);

            } else {

                JOptionPane.showMessageDialog(null, "El bombero no existe en la base de datos. ");
            }
            

        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "solo se admiten valores numericos. ");
        }
            datos();
            id();
    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void jb_activosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_activosActionPerformed
        borrarFilas();

        try {
            cargarActivos();

        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Bomberos que cumplan con el criterio.");

        }

    }//GEN-LAST:event_jb_activosActionPerformed

    private void jb_pasivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pasivosActionPerformed
        borrarFilas();

        try {
            cargarPasivos();

        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Bomberos que cumplan con el criterio.");

        }

    }//GEN-LAST:event_jb_pasivosActionPerformed

    private void jb_PorBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_PorBrigadaActionPerformed
        borrarFilas();

        try {
            cargarPorBrigada();

        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Bomberos que cumplan con el criterio.");

        }
    }//GEN-LAST:event_jb_PorBrigadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bombero;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_PorBrigada;
    private javax.swing.JButton jb_activos;
    private javax.swing.JButton jb_alta;
    private javax.swing.JButton jb_baja;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_cambiar;
    private javax.swing.JButton jb_consulta;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_pasivos;
    private javax.swing.JButton jb_salir;
    private javax.swing.JComboBox jcb_brigada;
    private com.toedter.calendar.JDateChooser jdc_fecha;
    private javax.swing.JRadioButton jrb_estado;
    private javax.swing.JTextField jt_codigo;
    private javax.swing.JTextField jt_doc;
    private javax.swing.JTextField jt_grupo;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_tel;
    private javax.swing.JPanel panel_consultas;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panel_id;
    private javax.swing.JTable tabla_bombero;
    // End of variables declaration//GEN-END:variables

    public void id() {

        panel_id.setVisible(false);
    }

    public void idVer() {

        panel_id.setVisible(true);
    }

    public void datos() {

        panel_datos.setVisible(false);
    }

    public void datosVer() {

        panel_datos.setVisible(true);
    }

    public void consulta() {

        panel_consultas.setVisible(false);
    }

    public void consultaVer() {

        panel_consultas.setVisible(true);
    }

    public void cabeceras() {
        ArrayList<Object> filaCab = new ArrayList<>();
        filaCab.add(" CÓDIGO ");
        filaCab.add(" DNI ");
        filaCab.add(" NOMBRE COMPLETO");
        filaCab.add(" GRUPO SANGUÏNEO ");
        filaCab.add(" FECHA DE NACIMIENTO ");
        filaCab.add(" TELEFONO ");
        filaCab.add(" BRIGADA ");

        for (Object fc : filaCab) {
            mod.addColumn(fc);

        }
        tabla_bombero.setModel(mod);
    }

    private void borrarFilas() {

        int f = tabla_bombero.getRowCount() - 1;

        for (; f >= 0; f--) {

            mod.removeRow(f);
        }
    }

    public void especial() {
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        panel_datos.setVisible(true);
        jt_doc.setVisible(false);
        jt_nombre.setVisible(false);
        jt_grupo.setVisible(false);
        jdc_fecha.setVisible(false);
        jt_tel.setVisible(false);
        jcb_brigada.setVisible(true);
        jrb_estado.setVisible(false);
        jb_guardar.setVisible(false);
    }

    public void Noespecial() {
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        panel_datos.setVisible(false);
        jt_doc.setVisible(false);
        jt_nombre.setVisible(false);
        jt_grupo.setVisible(false);
        jdc_fecha.setVisible(false);
        jt_tel.setVisible(false);
        jcb_brigada.setVisible(false);
        jrb_estado.setVisible(false);
        jb_guardar.setVisible(false);
    }

    public void cargarActivos() {

        List<Bombero> lista = bd.listarBomberosActivos();

        for (Bombero x : lista) {

            mod.addRow(new Object[]{x.getCodBombero(), x.getDni(), x.getNombreCompleto(), x.getGrupoSanguineo(), x.getFechaNacimiento().toString(), x.getTelCelular(), x.getBrigada()});
        }

    }

    public void cargarPasivos() {

        List<Bombero> lista = bd.listarBomberosPasivos();

        for (Bombero x : lista) {

            mod.addRow(new Object[]{x.getCodBombero(), x.getDni(), x.getNombreCompleto(), x.getGrupoSanguineo(), x.getFechaNacimiento().toString(), x.getTelCelular(), x.getBrigada()});
        }
    }

    public void cargarPorBrigada() {

        Brigada n = (Brigada) jcb_brigada.getSelectedItem();
        List<Bombero> lista = bd.listarBomberosPorBrigada(n);

        for (Bombero x : lista) {

            mod.addRow(new Object[]{x.getCodBombero(), x.getDni(), x.getNombreCompleto(), x.getGrupoSanguineo(), x.getFechaNacimiento().toString(), x.getTelCelular(), x.getBrigada()});

        }
    }

    public void cargarbox() {

        for (Brigada br : listaBr) {
            jcb_brigada.addItem(br);

        }
    }

    public void noEdit() {
        jt_doc.setEditable(false);
        jt_nombre.setEditable(false);
        jt_grupo.setEditable(false);
        jdc_fecha.setEnabled(false);
        jt_tel.setEditable(false);
        jcb_brigada.setEditable(false);
        jrb_estado.setEnabled(false);
    }

    public void edit() {
        jt_doc.setEditable(true);
        jt_nombre.setEditable(true);
        jt_grupo.setEditable(true);
        jdc_fecha.setEnabled(true);
        jt_tel.setEditable(true);
        jcb_brigada.setEditable(true);
        jrb_estado.setEnabled(true);
    }

    public void limpiarCelda() {
        jt_codigo.setText("");
        jt_doc.setText("");
        jt_nombre.setText("");
        jt_grupo.setText("");
        jdc_fecha.setDate(null);
        jt_tel.setText("");
        jrb_estado.setSelected(false);
    }
}
