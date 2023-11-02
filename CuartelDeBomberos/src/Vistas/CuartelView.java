package Vistas;
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
        jt_codigo = new javax.swing.JTextField();
        jb_buscar = new javax.swing.JButton();
        panel_datos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jb_guardar = new javax.swing.JButton();
        jt_nombre = new javax.swing.JTextField();
        jt_calle = new javax.swing.JTextField();
        jt_tel = new javax.swing.JTextField();
        jt_mail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jt_altura = new javax.swing.JTextField();
        jb_alta = new javax.swing.JButton();
        jb_consulta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cuartel = new javax.swing.JLabel();
        panel_consultas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jb_activos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cuartel = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jb_datos = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1024, 614));
        setMinimumSize(new java.awt.Dimension(1024, 614));
        setPreferredSize(new java.awt.Dimension(1024, 614));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_id.setBackground(new java.awt.Color(212, 245, 236));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DATOS INTERNOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Código:");

        jt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_codigoKeyTyped(evt);
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
                .addGap(38, 38, 38)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                        .addComponent(jb_buscar)
                        .addGap(32, 32, 32))))
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_buscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 810, 80));

        panel_datos.setBackground(new java.awt.Color(212, 245, 236));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        jLabel7.setText("Calle:");

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

        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_nombreKeyTyped(evt);
            }
        });

        jt_calle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_calleKeyTyped(evt);
            }
        });

        jt_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_telKeyTyped(evt);
            }
        });

        jt_mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_mailKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Altura:");

        jt_altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_alturaKeyTyped(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jt_tel)))
                        .addGap(18, 18, 18)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(52, 52, 52))
                            .addComponent(jt_mail))))
                .addGap(26, 26, 26)
                .addComponent(jb_guardar)
                .addGap(31, 31, 31))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jb_guardar)
                    .addComponent(jt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_mail, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(panel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 810, 130));

        jb_alta.setBackground(new java.awt.Color(51, 51, 51));
        jb_alta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_alta.setForeground(new java.awt.Color(255, 255, 255));
        jb_alta.setText("Altas");
        jb_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_altaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, -1));

        jb_consulta.setBackground(new java.awt.Color(51, 51, 51));
        jb_consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_consulta.setForeground(new java.awt.Color(255, 255, 255));
        jb_consulta.setText("Consultas");
        jb_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consultaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión Cuarteles");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        cuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Cuartel.jpg"))); // NOI18N
        jPanel1.add(cuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        panel_consultas.setBackground(new java.awt.Color(212, 245, 236));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("CONSULTAS");

        jb_activos.setBackground(new java.awt.Color(51, 51, 51));
        jb_activos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_activos.setForeground(new java.awt.Color(255, 255, 255));
        jb_activos.setText("Cuarteles Activos");
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_cuartel);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Seleccione la consulta que desea realizar:");

        javax.swing.GroupLayout panel_consultasLayout = new javax.swing.GroupLayout(panel_consultas);
        panel_consultas.setLayout(panel_consultasLayout);
        panel_consultasLayout.setHorizontalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultasLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(panel_consultasLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(jb_activos))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        panel_consultasLayout.setVerticalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jb_activos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(panel_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 810, 210));

        jb_datos.setBackground(new java.awt.Color(51, 51, 51));
        jb_datos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_datos.setForeground(new java.awt.Color(255, 255, 255));
        jb_datos.setText("Datos");
        jb_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_datosActionPerformed(evt);
            }
        });
        jPanel1.add(jb_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 870, 590));

        jb_salir.setBackground(new java.awt.Color(0, 0, 0));
        jb_salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cerrar.jpg"))); // NOI18N
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, 40, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
      
        try{
            
            String nombre = jt_nombre.getText();
            int calle = Integer.parseInt(jt_calle.getText());
            int altura = Integer.parseInt(jt_altura.getText());
            String tel = jt_tel.getText();
            String mail = jt_mail.getText();
            
            if (nombre.isEmpty() && tel.isEmpty() && mail.isEmpty()) {

                JOptionPane.showMessageDialog(null, "No se admiten campos vacios. ");
                return;
            }

            if (c == null) {
                c = new Cuartel(nombre, calle, altura, tel, mail);
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
        consulta();
        datosVer();
        edit();
    }//GEN-LAST:event_jb_altaActionPerformed

    private void jb_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_consultaActionPerformed
        borrarFilas();
        limpiarCelda();
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

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        
        
        int codigo = Integer.parseInt(jt_codigo.getText());
        c=cd.buscarCuartel(codigo);

        try{

            if (codigo==c.getCodCuartel()) {
                datosVer();
                jb_guardar.setVisible(false);

                jt_nombre.setText(c.getNombreCuartel());
                jt_calle.setText(c.getCalleC() + "");
                jt_altura.setText(c.getAlturaC() + "");
                jt_tel.setText(c.getTelefono());
                jt_mail.setText(c.getMail());

            } else {
                JOptionPane.showMessageDialog(null, "El Cuartel no existe en la base de datos. ");
            }

        }catch(NumberFormatException nfe){

            JOptionPane.showMessageDialog(null, "Reingrese el código ");
        }

    }//GEN-LAST:event_jb_buscarActionPerformed

    private void jb_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_datosActionPerformed
       limpiarCelda();
       idVer();
       datosVer();
    }//GEN-LAST:event_jb_datosActionPerformed

    private void jt_codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_codigoKeyTyped
        
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jt_codigo.getText().trim().length() == 10) {
            evt.consume();
        }

    }//GEN-LAST:event_jt_codigoKeyTyped

    private void jt_telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_telKeyTyped
        
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean guion= key == 45;
       

        if (!numeros || guion) {
            evt.consume();
        }

        if (jt_tel.getText().trim().length() == 10) {
            evt.consume();
        }

    }//GEN-LAST:event_jt_telKeyTyped

    private void jt_alturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_alturaKeyTyped
        
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jt_altura.getText().trim().length() == 10) {
            evt.consume();
        }

    }//GEN-LAST:event_jt_alturaKeyTyped

    private void jt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nombreKeyTyped
        
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_nombreKeyTyped

    private void jt_calleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_calleKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean punto = key == 46;

        if (!(minusculas || mayusculas || espacio || punto)) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_calleKeyTyped

    private void jt_mailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_mailKeyTyped
         int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean arroba = key == 64;
        boolean punto = key == 46;

        if (!(minusculas || mayusculas || espacio || punto || arroba)) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_mailKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuartel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_activos;
    private javax.swing.JButton jb_alta;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_consulta;
    private javax.swing.JButton jb_datos;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JTextField jt_altura;
    private javax.swing.JTextField jt_calle;
    private javax.swing.JTextField jt_codigo;
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
    filaCab.add(" CALLE");
    filaCab.add(" ALTURA ");
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
        mod.addRow(new Object[]{x.getCodCuartel(),x.getNombreCuartel(), x.getCalleC(), x.getAlturaC(), x.getTelefono(), x.getMail()});

    }
}

public void noEdit(){
    jt_nombre.setEditable(false);
    jt_calle.setEditable(false);
    jt_altura.setEditable(false);
    jt_tel.setEditable(false);
    jt_mail.setEditable(false);
}

public void edit(){
    jt_nombre.setEditable(true);
    jt_calle.setEditable(true);
    jt_altura.setEditable(true);
    jt_tel.setEditable(true);
    jt_mail.setEditable(true);
}

public void limpiarCelda(){
    jt_codigo.setText("");
    jt_nombre.setText("");
    jt_tel.setText("");
    jt_calle.setText("");
    jt_altura.setText("");
    jt_mail.setText(""); 
    
}
}
