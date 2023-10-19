package Vistas;

import ClasesData.BomberoData;
import Entidades.Bombero;
import Entidades.Brigada;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BomberoView extends javax.swing.JInternalFrame {
    BomberoData bd=new BomberoData();
    Bombero b=null;
    DefaultTableModel tabla=new DefaultTableModel();
    
    public BomberoView() {
        initComponents();        
        datosPersonales();
        consultas();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bombero = new javax.swing.JLabel();
        jb_modificar = new javax.swing.JButton();
        panel_datosPersonales = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_dni = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_grupoSanguineo = new javax.swing.JTextField();
        jtf_telCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jdc_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jrb_estado = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jtf_codigo = new javax.swing.JTextField();
        jtf_brigada = new javax.swing.JTextField();
        jb_guardar = new javax.swing.JButton();
        panel_consultas = new javax.swing.JPanel();
        jb_BombreosActivos = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla_bombero = new javax.swing.JTable();
        jb_eliminar = new javax.swing.JButton();
        jb_nuevo = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        bombero1 = new javax.swing.JLabel();
        jb_eliminar1 = new javax.swing.JButton();
        jb_nuevo1 = new javax.swing.JButton();
        jb_modificar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabla_bombero1 = new javax.swing.JTable();
        jb_salir1 = new javax.swing.JButton();
        panel_datosPersonales1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtf_dni1 = new javax.swing.JTextField();
        jtf_nombreCompleto1 = new javax.swing.JTextField();
        jtf_grupoSanguineo1 = new javax.swing.JTextField();
        jtf_telCelular1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jdc_fechaNacimiento1 = new com.toedter.calendar.JDateChooser();
        jcb_brigada1 = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jrb_activo1 = new javax.swing.JRadioButton();
        jrb_pasivo1 = new javax.swing.JRadioButton();
        jb_BombreosActivos1 = new javax.swing.JButton();
        fondo1 = new javax.swing.JLabel();

        setDoubleBuffered(true);
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(1024, 614));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión Bomberos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        bombero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Bombero.jpg"))); // NOI18N
        jPanel1.add(bombero, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jb_modificar.setBackground(new java.awt.Color(51, 51, 51));
        jb_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Actualizar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 100, 30));

        panel_datosPersonales.setBackground(new java.awt.Color(76, 212, 152));

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("DATOS PERSONALES");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Fecha de Nacimiento:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Brigada:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Estado:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Código:");

        jb_guardar.setBackground(new java.awt.Color(51, 51, 51));
        jb_guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_datosPersonalesLayout = new javax.swing.GroupLayout(panel_datosPersonales);
        panel_datosPersonales.setLayout(panel_datosPersonalesLayout);
        panel_datosPersonalesLayout.setHorizontalGroup(
            panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel2))
                                .addGap(13, 13, 13)
                                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtf_dni, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jtf_codigo)))
                            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_brigada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdc_fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(jtf_grupoSanguineo)
                            .addComponent(jtf_nombre))
                        .addGap(42, 42, 42)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jtf_telCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(21, 21, 21)
                                    .addComponent(jrb_estado)))
                            .addComponent(jb_guardar))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panel_datosPersonalesLayout.setVerticalGroup(
            panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosPersonalesLayout.createSequentialGroup()
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel3)
                            .addComponent(jtf_telCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7))
                            .addComponent(jdc_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jrb_estado)))
                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jtf_brigada, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_grupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_guardar))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(panel_datosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 860, 140));

        panel_consultas.setBackground(new java.awt.Color(212, 245, 236));
        panel_consultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_BombreosActivos.setBackground(new java.awt.Color(51, 51, 51));
        jb_BombreosActivos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_BombreosActivos.setForeground(new java.awt.Color(255, 255, 255));
        jb_BombreosActivos.setText("Bomberos Activos");
        panel_consultas.add(jb_BombreosActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("CONSULTAS");
        panel_consultas.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jtabla_bombero.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtabla_bombero);

        panel_consultas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 810, 100));

        jPanel1.add(panel_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 860, 180));

        jb_eliminar.setBackground(new java.awt.Color(51, 51, 51));
        jb_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jb_eliminar.setText("Eliminar");
        jPanel1.add(jb_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 100, 30));

        jb_nuevo.setBackground(new java.awt.Color(51, 51, 51));
        jb_nuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jb_nuevo.setText("Nuevo");
        jb_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jb_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 100, 30));

        jb_salir.setBackground(new java.awt.Color(51, 51, 51));
        jb_salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setText("Salir");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });
        jPanel1.add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 470, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 940, 510));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        jInternalFrame1.setDoubleBuffered(true);
        jInternalFrame1.setMaximumSize(null);
        jInternalFrame1.setMinimumSize(null);
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(1024, 614));
        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gestión Bomberos");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        bombero1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Bombero.jpg"))); // NOI18N
        jPanel2.add(bombero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        jb_eliminar1.setBackground(new java.awt.Color(102, 102, 102));
        jb_eliminar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_eliminar1.setForeground(new java.awt.Color(255, 255, 255));
        jb_eliminar1.setText("Eliminar");
        jb_eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jb_eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 100, 30));

        jb_nuevo1.setBackground(new java.awt.Color(102, 102, 102));
        jb_nuevo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_nuevo1.setForeground(new java.awt.Color(255, 255, 255));
        jb_nuevo1.setText("Nuevo");
        jb_nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nuevo1ActionPerformed(evt);
            }
        });
        jPanel2.add(jb_nuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 100, 30));

        jb_modificar1.setBackground(new java.awt.Color(102, 102, 102));
        jb_modificar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_modificar1.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar1.setText("Actualizar");
        jPanel2.add(jb_modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 100, 30));

        jtabla_bombero1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtabla_bombero1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 740, 100));

        jb_salir1.setBackground(new java.awt.Color(51, 51, 51));
        jb_salir1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_salir1.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir1.setText("Salir");
        jPanel2.add(jb_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 80, -1));

        panel_datosPersonales1.setBackground(new java.awt.Color(76, 212, 152));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("DNI:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Apellido y Nombre:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Grupo Sanguineo:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Telefono:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("DATOS PERSONALES");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Fecha de Nacimiento:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Brigada:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Estado:");

        jrb_activo1.setText("      Activo");

        jrb_pasivo1.setText("    Pasivo");

        javax.swing.GroupLayout panel_datosPersonales1Layout = new javax.swing.GroupLayout(panel_datosPersonales1);
        panel_datosPersonales1.setLayout(panel_datosPersonales1Layout);
        panel_datosPersonales1Layout.setHorizontalGroup(
            panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel15))
                    .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                        .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel14)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosPersonales1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13)))
                        .addGap(18, 18, 18)
                        .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                                .addComponent(jtf_grupoSanguineo1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                                .addComponent(jtf_telCelular1)
                                .addGap(331, 331, 331))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosPersonales1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(98, 98, 98)
                                .addComponent(jtf_dni1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nombreCompleto1)))
                        .addGap(40, 40, 40)
                        .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jdc_fechaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                                .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosPersonales1Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosPersonales1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(22, 22, 22)))
                                .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                                        .addComponent(jrb_activo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrb_pasivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcb_brigada1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(33, 33, 33))
        );
        panel_datosPersonales1Layout.setVerticalGroup(
            panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(20, 20, 20)
                        .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jtf_dni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addComponent(jdc_fechaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_nombreCompleto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel12)))
                    .addGroup(panel_datosPersonales1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcb_brigada1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtf_grupoSanguineo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jrb_activo1)
                    .addComponent(jrb_pasivo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosPersonales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jtf_telCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.add(panel_datosPersonales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 740, 200));

        jb_BombreosActivos1.setBackground(new java.awt.Color(51, 51, 51));
        jb_BombreosActivos1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_BombreosActivos1.setForeground(new java.awt.Color(255, 255, 255));
        jb_BombreosActivos1.setText("Bomberos Activos");
        jPanel2.add(jb_BombreosActivos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jInternalFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 800, 610));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        jInternalFrame1.getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminar1ActionPerformed
        
        datosPersonalesVer();       
        
         try {           
                        
            if (b!=null){              
                 
               bd.eliminarBombero(b.getCodBombero());
               b=null;                       
                
            }else
                JOptionPane.showMessageDialog(this, " No se ha seleccionado alumno");              

         } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Reingrese su DNI" );
         }
        
    }//GEN-LAST:event_jb_eliminar1ActionPerformed

    private void jb_nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nuevo1ActionPerformed
        
    }//GEN-LAST:event_jb_nuevo1ActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nuevoActionPerformed
        
        datosPersonalesVer();
     
    }//GEN-LAST:event_jb_nuevoActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        
        jtf_codigo.setVisible(true);
        
        int cod=Integer.parseInt(jtf_codigo.getText());
        b=bd.buscarBombero(cod);
        
        if (b!=null){
            
            datosPersonalesVer();
            jtf_dni.setText(b.getDni());
            jtf_nombre.setText(b.getNombreCompleto());
            jtf_grupoSanguineo.setText(b.getGrupoSanguineo());
            LocalDate ld=b.getFechaNacimiento();
            java.util.Date d= java.util.Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jdc_fechaNacimiento.setDate(d); 
            jrb_estado.setSelected(b.isEstadoBombero());
            
        }
        
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
       
           try {

            String dni = jtf_dni.getText();
            String nombreCompleto = jtf_nombre.getText();
            String grupoSanguineo = jtf_grupoSanguineo.getText();
            String telCelular= jtf_telCelular.getText();
            java.util.Date fn = jdc_fechaNacimiento.getDate();
            LocalDate fechaNacimiento = fn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Boolean estadoBombero = jrb_estado.isSelected();
            
            if (dni.isEmpty() || nombreCompleto.isEmpty() || grupoSanguineo.isEmpty() || telCelular.isEmpty()) {
               
                JOptionPane.showMessageDialog(this, "No pueden exixtir campos vacios.");
                return;
            }
           

            if (b == null) {
              
                b = new Bombero();
                bd.guardarBombero(b);
                

            } else {

                b.setDni(dni);
                b.setNombreCompleto(nombreCompleto);
                b.setGrupoSanguineo(grupoSanguineo);
                b.setFechaNacimiento(fechaNacimiento);
                b.setTelCelular(telCelular);
                b.isEstadoBombero();
                bd.modificarBombero(b);
                

            }

        } catch (NumberFormatException nf) {
            
            JOptionPane.showMessageDialog(this, " Reingrese los datos.");
        }
    }//GEN-LAST:event_jb_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bombero;
    private javax.swing.JLabel bombero1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_BombreosActivos;
    private javax.swing.JButton jb_BombreosActivos1;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_eliminar1;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_modificar1;
    private javax.swing.JButton jb_nuevo;
    private javax.swing.JButton jb_nuevo1;
    private javax.swing.JButton jb_salir;
    private javax.swing.JButton jb_salir1;
    private javax.swing.JComboBox jcb_brigada1;
    private com.toedter.calendar.JDateChooser jdc_fechaNacimiento;
    private com.toedter.calendar.JDateChooser jdc_fechaNacimiento1;
    private javax.swing.JRadioButton jrb_activo1;
    private javax.swing.JRadioButton jrb_estado;
    private javax.swing.JRadioButton jrb_pasivo1;
    private javax.swing.JTable jtabla_bombero;
    private javax.swing.JTable jtabla_bombero1;
    private javax.swing.JTextField jtf_brigada;
    private javax.swing.JTextField jtf_codigo;
    private javax.swing.JTextField jtf_dni;
    private javax.swing.JTextField jtf_dni1;
    private javax.swing.JTextField jtf_grupoSanguineo;
    private javax.swing.JTextField jtf_grupoSanguineo1;
    private javax.swing.JTextField jtf_nombre;
    private javax.swing.JTextField jtf_nombreCompleto1;
    private javax.swing.JTextField jtf_telCelular;
    private javax.swing.JTextField jtf_telCelular1;
    private javax.swing.JPanel panel_consultas;
    private javax.swing.JPanel panel_datosPersonales;
    private javax.swing.JPanel panel_datosPersonales1;
    // End of variables declaration//GEN-END:variables

public void datosPersonales (){
    
    panel_datosPersonales.setVisible(false);

}

public void datosPersonalesVer (){

    panel_datosPersonales.setVisible(true);
    
}

public void modeloTabla(){

    tabla.addColumn(" CÓDIGO");   
    tabla.addColumn(" DNI"); 
    tabla.addColumn(" APELLIDO Y NOMBRE");
    tabla.addColumn(" GRUPO SANGUÍNEO");
    tabla.addColumn(" FECHA DE NACIMIENTO");
    tabla.addColumn(" TELÉFONO");
    tabla.addColumn(" BRIGADA");
    tabla.addColumn(" ESTADO");
    
    jtabla_bombero.setModel(tabla);
}

public void consultas(){
    
    panel_consultas.setVisible(false);
}

public void consultasVer(){
    
    panel_consultas.setVisible(true);
}


}
