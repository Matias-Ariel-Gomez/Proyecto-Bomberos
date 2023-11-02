package Vistas;
import Entidades.*;
import ClasesData.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Entidades.Brigada;
import java.util.ArrayList;
import java.util.List;

public class BrigadaView extends javax.swing.JInternalFrame {
    private Brigada br;
    private Cuartel c;
    private BrigadaData brd;
    private CuartelData cd;
    private List<Brigada>lista; 
    private List<Cuartel>listaC;
    DefaultTableModel mod; 
    
    public BrigadaView() {
        initComponents();
        br=null;
        c=null;
        brd=new BrigadaData();   
        cd=new CuartelData();
        mod=new DefaultTableModel();
        lista=brd.listarBrigadasDisponibles();
        listaC=cd.listarCuartel();
        cabeceras();              
        id();
        datos();
        consulta();
        noEdit();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        panel_datos = new javax.swing.JPanel();
        jb_guardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jrb_estado = new javax.swing.JRadioButton();
        jt_nombre = new javax.swing.JTextField();
        jcb_cuartel = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        esp = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        brigada = new javax.swing.JLabel();
        jb_alta = new javax.swing.JButton();
        jb_baja = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        panel_consultas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_brigada = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jcb_cuartel2 = new javax.swing.JComboBox();
        jb_activas = new javax.swing.JButton();
        jb_pasivas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jb_porCuartel = new javax.swing.JButton();
        jb_consulta = new javax.swing.JButton();
        panel_id = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jb_buscar = new javax.swing.JButton();
        jb_cambiar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jt_codigo = new javax.swing.JTextField();
        jb_salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1024, 614));
        setMinimumSize(new java.awt.Dimension(1024, 614));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1024, 614));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setPreferredSize(new java.awt.Dimension(850, 480));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_datos.setBackground(new java.awt.Color(212, 245, 236));

        jb_guardar.setBackground(new java.awt.Color(51, 51, 51));
        jb_guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("DATOS DE LA BRIGADA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Nombre Clave:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Especialidad:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Cuartel:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Estado:");

        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_nombreKeyTyped(evt);
            }
        });

        esp.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Incendios", "Rescate en Montaña", "Rescate en Accidente de Tráfico", "Derrumbes", "Inundaciones", "Prevención", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(esp);

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jrb_estado)
                                .addGap(221, 221, 221))
                            .addComponent(jcb_cuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_guardar)))))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jcb_cuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jrb_estado)
                        .addComponent(jLabel8))
                    .addComponent(jb_guardar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.add(panel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 690, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión Brigradas");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 21, -1, -1));

        brigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Brigada.jpg"))); // NOI18N
        jPanel5.add(brigada, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jb_alta.setBackground(new java.awt.Color(51, 51, 51));
        jb_alta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_alta.setForeground(new java.awt.Color(255, 255, 255));
        jb_alta.setText("Altas");
        jb_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_altaActionPerformed(evt);
            }
        });
        jPanel5.add(jb_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 93, 95, -1));

        jb_baja.setBackground(new java.awt.Color(51, 51, 51));
        jb_baja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_baja.setForeground(new java.awt.Color(255, 255, 255));
        jb_baja.setText("Bajas");
        jb_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bajaActionPerformed(evt);
            }
        });
        jPanel5.add(jb_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 93, 95, -1));

        jb_modificar.setBackground(new java.awt.Color(51, 51, 51));
        jb_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        jPanel5.add(jb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 93, 95, -1));

        panel_consultas.setBackground(new java.awt.Color(212, 245, 236));
        panel_consultas.setMaximumSize(new java.awt.Dimension(690, 300));
        panel_consultas.setPreferredSize(new java.awt.Dimension(690, 300));

        tabla_brigada.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_brigada);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("CONSULTAS");

        jb_activas.setBackground(new java.awt.Color(51, 51, 51));
        jb_activas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_activas.setForeground(new java.awt.Color(255, 255, 255));
        jb_activas.setText("Brigadas Activas");
        jb_activas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_activasActionPerformed(evt);
            }
        });

        jb_pasivas.setBackground(new java.awt.Color(51, 51, 51));
        jb_pasivas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_pasivas.setForeground(new java.awt.Color(255, 255, 255));
        jb_pasivas.setText("Brigadas Inactivas");
        jb_pasivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pasivasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Seleccione la consulta que desea realizar:");

        jb_porCuartel.setBackground(new java.awt.Color(51, 51, 51));
        jb_porCuartel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_porCuartel.setForeground(new java.awt.Color(255, 255, 255));
        jb_porCuartel.setText("Listado por Cuartel");
        jb_porCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_porCuartelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_consultasLayout = new javax.swing.GroupLayout(panel_consultas);
        panel_consultas.setLayout(panel_consultasLayout);
        panel_consultasLayout.setHorizontalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_consultasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_consultasLayout.createSequentialGroup()
                                .addComponent(jcb_cuartel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_porCuartel))
                            .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jb_pasivas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_activas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_consultasLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panel_consultasLayout.setVerticalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jb_activas))
                .addGap(11, 11, 11)
                .addComponent(jb_pasivas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_cuartel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_porCuartel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.add(panel_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 690, 290));

        jb_consulta.setBackground(new java.awt.Color(51, 51, 51));
        jb_consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_consulta.setForeground(new java.awt.Color(255, 255, 255));
        jb_consulta.setText("Consultas");
        jb_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consultaActionPerformed(evt);
            }
        });
        jPanel5.add(jb_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 93, -1, -1));

        panel_id.setBackground(new java.awt.Color(212, 245, 236));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("DATOS INTERNOS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Código:");

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

        jt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_codigoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_idLayout = new javax.swing.GroupLayout(panel_id);
        panel_id.setLayout(panel_idLayout);
        panel_idLayout.setHorizontalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_cambiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jb_eliminar)
                                .addComponent(jb_cambiar)
                                .addComponent(jb_buscar))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jt_codigo))
                .addContainerGap())
        );

        jPanel5.add(panel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 750, 590));

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

        fondo.setBackground(new java.awt.Color(0, 51, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_altaActionPerformed
         limpiarCelda();
         consulta();
         id();
         datosVer();        
         edit(); 
         cargarbox();   
        
    }//GEN-LAST:event_jb_altaActionPerformed

    private void jb_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bajaActionPerformed
        limpiarCelda();
        consulta();
        datos();
        idVer();
        
    }//GEN-LAST:event_jb_bajaActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
           
        limpiarCelda();
        consulta();
        idVer();
        datosVer();
        edit();
        cargarbox();
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_consultaActionPerformed
       limpiarCelda();
       borrarFilas();
       id();
       datos();
       consultaVer();  
       cargarbox2(); 
        
        
        
    }//GEN-LAST:event_jb_consultaActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
               
        int codigo = Integer.parseInt(jt_codigo.getText());
        br=brd.buscarBrigada(codigo);
        
        try {          
            
            if (codigo==br.getCodBrigada()) {
                datosVer();                
                jb_guardar.setVisible(false);
                
                jt_nombre.setText(br.getNombreClave());
                esp.setSelectedValue(br, true);
                jcb_cuartel.setSelectedItem(br.getCuartel().getCodCuartel());
                jrb_estado.setSelected(br.isEstadoBrigada());

            } else {
                JOptionPane.showMessageDialog(null, "La Brigada no existe en la base de datos. ");
                
            }
            
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "No existe. ");
            
        } 
        
    }//GEN-LAST:event_jb_buscarActionPerformed

    private void jb_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cambiarActionPerformed
               
        String nombre = jt_nombre.getText();
        String espec =esp.getSelectedValue();   
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
             datos();
             id();
        }catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, " Datos mal ingresados. ");
            
        } 
    }//GEN-LAST:event_jb_cambiarActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
         
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
       
    }//GEN-LAST:event_jb_eliminarActionPerformed

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        
        try{

            String nombre = jt_nombre.getText();
            String espec = esp.getSelectedValue();
            Cuartel x = (Cuartel) jcb_cuartel.getSelectedItem();
            boolean estado = jrb_estado.isSelected();       
          
            if (nombre.isEmpty() || espec.isEmpty() ) {

                JOptionPane.showMessageDialog(null, "No se admiten campos vacios. ");
                return;
            }

            if (br == null) {

                br = new Brigada(nombre, espec, x, estado);
                brd.guardarBrigada(br);

            }else {      
                
                JOptionPane.showMessageDialog(null, " El registro ya existe en la Base de Datos. ");
            }
            datos();  
        } catch (NullPointerException np) {

            JOptionPane.showMessageDialog(null, " Error en ingreso de Datos. ");
        }
           
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_activasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_activasActionPerformed
         borrarFilas();
        
        try {
            cargarActivos();
            
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Bomberos que cumplan con el criterio.");
                  
        }       
       
        
        
    }//GEN-LAST:event_jb_activasActionPerformed

    private void jb_pasivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_pasivasActionPerformed
           
        borrarFilas();
        
        try {
            cargarPasivos();
            
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Bomberos que cumplan con el criterio.");
       
        } 
        
        
    }//GEN-LAST:event_jb_pasivasActionPerformed

    private void jb_porCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_porCuartelActionPerformed
        borrarFilas();
               
        try {
            
            c = (Cuartel) jcb_cuartel2.getSelectedItem();
            List<Brigada> lista = brd.listarBrigadasPorCuartel(c, true);

            for (Brigada x : lista) {

                mod.addRow(new Object[]{x.getCodBrigada(), x.getNombreClave(), x.getEspecialidad()});
            }

        } catch (NullPointerException npe) {
            
            JOptionPane.showMessageDialog(this, " No se encontraron Brigadas que cumplan con el criterio.");
       
        }        
        
    }//GEN-LAST:event_jb_porCuartelActionPerformed

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

    private void jt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nombreKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_nombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brigada;
    private javax.swing.JList<String> esp;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_activas;
    private javax.swing.JButton jb_alta;
    private javax.swing.JButton jb_baja;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_cambiar;
    private javax.swing.JButton jb_consulta;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_pasivas;
    private javax.swing.JButton jb_porCuartel;
    private javax.swing.JButton jb_salir;
    private javax.swing.JComboBox jcb_cuartel;
    private javax.swing.JComboBox jcb_cuartel2;
    private javax.swing.JRadioButton jrb_estado;
    private javax.swing.JTextField jt_codigo;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JPanel panel_consultas;
    private javax.swing.JPanel panel_datos;
    private javax.swing.JPanel panel_id;
    private javax.swing.JTable tabla_brigada;
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
    
    panel_consultas.setVisible(false);
}

public void consultaVer(){
    
    panel_consultas.setVisible(true);
}

public void cabeceras(){
    ArrayList<Object>filaCab=new ArrayList<>();
    filaCab.add(" CÖDIGO ");
    filaCab.add(" NOMBRE CLAVE ");
    filaCab.add(" ESPECIALIDAD ");
    filaCab.add(" CUARTEL");
        
    for (Object fc: filaCab){
        mod.addColumn(fc);
        
    }    
    tabla_brigada.setModel(mod);
}

private void borrarFilas(){

    int f=tabla_brigada.getRowCount()-1;
    
    for (; f>=0; f--) {
        
        mod.removeRow(f);
    }
}
 
public void cargarActivos(){
    
    List<Brigada> lista = brd.listarBrigadasDisponibles();

    for (Brigada x : lista) {

        mod.addRow(new Object[]{x.getCodBrigada(),x.getNombreClave(), x.getEspecialidad(), x.getCuartel()});
    }

}

public void cargarPasivos(){
    
    List<Brigada> lista = brd.listarBrigadasNoDisponibles();

    for (Brigada x : lista) {

        mod.addRow(new Object[]{x.getCodBrigada(),x.getNombreClave(), x.getEspecialidad(), x.getCuartel()});
    }
} 

public void cargarbox() {

    for (Cuartel c : listaC) {
        jcb_cuartel.addItem(c); 
    }     
}

public void cargarbox2() {

    for (Cuartel c : listaC) {
        jcb_cuartel2.addItem(c); 
    }     
}

public void noEdit(){
    jt_nombre.setEditable(false);
    esp.setEnabled(false);
    jcb_cuartel.setEditable(false);
    jrb_estado.setEnabled(false);
}

public void edit(){
    jt_nombre.setEditable(true);
    esp.setEnabled(true);
    jcb_cuartel.setEditable(true);
    jrb_estado.setEnabled(true);
}

public void limpiarCelda(){
    jt_codigo.setText("");
    jt_nombre.setText("");
    esp.setSelectedValue(br, false);
    jrb_estado.setSelected(false);
}

}
