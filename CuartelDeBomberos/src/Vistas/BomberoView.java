package Vistas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class BomberoView extends javax.swing.JInternalFrame {
    DefaultTableModel tabla=new DefaultTableModel();
    DefaultComboBoxModel box=new DefaultComboBoxModel();
    
    public BomberoView() {
        initComponents();
        datosPersonales();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bombero = new javax.swing.JLabel();
        jb_eliminar = new javax.swing.JButton();
        jb_nuevo = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla_bombero = new javax.swing.JTable();
        jb_salir = new javax.swing.JButton();
        panel_datosPersonales = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_dni = new javax.swing.JTextField();
        jtf_nombreCompleto = new javax.swing.JTextField();
        jtf_grupoSanguineo = new javax.swing.JTextField();
        jtf_telCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jdc_fechaNacimiento = new com.toedter.calendar.JDateChooser();
        jcb_brigada = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jrb_activo = new javax.swing.JRadioButton();
        jrb_pasivo = new javax.swing.JRadioButton();
        jb_BombreosActivos = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        bombero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Bombero.jpg"))); // NOI18N
        jPanel1.add(bombero, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        jb_eliminar.setBackground(new java.awt.Color(102, 102, 102));
        jb_eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jb_eliminar.setText("Eliminar");
        jb_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 100, 30));

        jb_nuevo.setBackground(new java.awt.Color(102, 102, 102));
        jb_nuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jb_nuevo.setText("Nuevo");
        jb_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jb_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 100, 30));

        jb_modificar.setBackground(new java.awt.Color(102, 102, 102));
        jb_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Actualizar");
        jPanel1.add(jb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 100, 30));

        jtabla_bombero.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtabla_bombero);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 740, 100));

        jb_salir.setBackground(new java.awt.Color(102, 102, 102));
        jb_salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setText("Salir");
        jPanel1.add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 80, -1));

        panel_datosPersonales.setBackground(new java.awt.Color(76, 212, 152));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apellido y Nombre:");

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

        jrb_activo.setText("      Activo");

        jrb_pasivo.setText("    Pasivo");

        javax.swing.GroupLayout panel_datosPersonalesLayout = new javax.swing.GroupLayout(panel_datosPersonales);
        panel_datosPersonales.setLayout(panel_datosPersonalesLayout);
        panel_datosPersonalesLayout.setHorizontalGroup(
            panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel6))
                    .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosPersonalesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                .addComponent(jtf_grupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                .addComponent(jtf_telCelular)
                                .addGap(331, 331, 331))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosPersonalesLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(98, 98, 98)
                                .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nombreCompleto)))
                        .addGap(40, 40, 40)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jdc_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosPersonalesLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosPersonalesLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(22, 22, 22)))
                                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                                        .addComponent(jrb_activo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrb_pasivo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcb_brigada, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(33, 33, 33))
        );
        panel_datosPersonalesLayout.setVerticalGroup(
            panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtf_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jdc_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_nombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)))
                    .addGroup(panel_datosPersonalesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcb_brigada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_grupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jrb_activo)
                    .addComponent(jrb_pasivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_telCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(panel_datosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 740, 200));

        jb_BombreosActivos.setBackground(new java.awt.Color(102, 102, 102));
        jb_BombreosActivos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_BombreosActivos.setForeground(new java.awt.Color(255, 255, 255));
        jb_BombreosActivos.setText("Bomberos Activos");
        jPanel1.add(jb_BombreosActivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 800, 610));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nuevoActionPerformed
        
        datosPersonalesVer();
    }//GEN-LAST:event_jb_nuevoActionPerformed

    private void jb_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_eliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_eliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bombero;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JButton jb_BombreosActivos;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_nuevo;
    private javax.swing.JButton jb_salir;
    private javax.swing.JComboBox jcb_brigada;
    private com.toedter.calendar.JDateChooser jdc_fechaNacimiento;
    private javax.swing.JRadioButton jrb_activo;
    private javax.swing.JRadioButton jrb_pasivo;
    private javax.swing.JTable jtabla_bombero;
    private javax.swing.JTextField jtf_dni;
    private javax.swing.JTextField jtf_grupoSanguineo;
    private javax.swing.JTextField jtf_nombreCompleto;
    private javax.swing.JTextField jtf_telCelular;
    private javax.swing.JPanel panel_datosPersonales;
    // End of variables declaration//GEN-END:variables

public void datosPersonales (){

    panel_datosPersonales.setVisible(false);

}

public void datosPersonalesVer (){

    panel_datosPersonales.setVisible(true);

}

  
    public void llenarBox(){

box.addElement("Incendios en Vivienda o Industrias");
box.addElement("Salvamento en Derrumbes");
box.addElement("Rescate en Montañas");
box.addElement("Rescate en Accidentes de Transito");
box.addElement("Inundaciones");
box.addElement("Prevención");

jcb_brigada.setModel(box);

}

}
