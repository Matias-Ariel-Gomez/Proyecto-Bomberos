package Vistas;

import Entidades.*;
import ClasesData.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VistaCuartel extends javax.swing.JInternalFrame {
    private Cuartel c;
    private Siniestro s;
    private CuartelData cd;
    private SiniestroData sd;
    private List<Cuartel> listaC;
    private List<Siniestro> listaS;
    DefaultTableModel mod;
    
    
    public VistaCuartel() {
        initComponents();
        c=null;
        s= new Siniestro();
        cd= new CuartelData();
        sd=new SiniestroData();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cuartel = new javax.swing.JLabel();
        jb_alta = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        panel_datos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jt_calle = new javax.swing.JTextField();
        jt_altura = new javax.swing.JTextField();
        jt_tel = new javax.swing.JTextField();
        jt_mail = new javax.swing.JTextField();
        jb_guardar = new javax.swing.JButton();
        panel_consulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_cuartel = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jb_activos = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        jb_baja = new javax.swing.JButton();
        jb_consultas = new javax.swing.JButton();
        panel_id = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jt_codigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jb_buscar = new javax.swing.JButton();
        jb_cambiar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1024, 614));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(820, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión Cuarteles");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        cuartel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Cuartel.jpg"))); // NOI18N
        jPanel2.add(cuartel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 340, 110));

        jb_alta.setBackground(new java.awt.Color(51, 51, 51));
        jb_alta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_alta.setForeground(new java.awt.Color(255, 255, 255));
        jb_alta.setText("Altas");
        jb_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_altaActionPerformed(evt);
            }
        });
        jPanel2.add(jb_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, -1));

        jb_modificar.setBackground(new java.awt.Color(51, 51, 51));
        jb_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        jPanel2.add(jb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 100, -1));

        panel_datos.setBackground(new java.awt.Color(212, 245, 236));
        panel_datos.setForeground(new java.awt.Color(51, 51, 51));
        panel_datos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DATOS");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Calle:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("N°:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Teléfono:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Mail.");

        jb_guardar.setBackground(new java.awt.Color(51, 51, 51));
        jb_guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 548, Short.MAX_VALUE))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(23, 23, 23)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jt_tel))
                        .addGap(27, 27, 27)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_guardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(panel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 780, 120));

        panel_consulta.setBackground(new java.awt.Color(212, 245, 236));

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("CONSULTAS");

        jb_activos.setBackground(new java.awt.Color(51, 51, 51));
        jb_activos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_activos.setForeground(new java.awt.Color(255, 255, 255));
        jb_activos.setText("Activos");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_consultaLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel_consultaLayout.createSequentialGroup()
                            .addComponent(jb_activos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(528, 528, 528)
                            .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        panel_consultaLayout.setVerticalGroup(
            panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_consultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_activos)
                    .addComponent(jb_salir))
                .addGap(27, 27, 27))
        );

        jPanel2.add(panel_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 780, 170));

        jb_baja.setBackground(new java.awt.Color(51, 51, 51));
        jb_baja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_baja.setForeground(new java.awt.Color(255, 255, 255));
        jb_baja.setText("Bajas");
        jb_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bajaActionPerformed(evt);
            }
        });
        jPanel2.add(jb_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 100, -1));

        jb_consultas.setBackground(new java.awt.Color(51, 51, 51));
        jb_consultas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_consultas.setForeground(new java.awt.Color(255, 255, 255));
        jb_consultas.setText("Consultas");
        jb_consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consultasActionPerformed(evt);
            }
        });
        jPanel2.add(jb_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 100, -1));

        panel_id.setBackground(new java.awt.Color(212, 245, 236));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Código: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DATOS INTERNOS");

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

        jb_borrar.setBackground(new java.awt.Color(51, 51, 51));
        jb_borrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_borrar.setForeground(new java.awt.Color(255, 255, 255));
        jb_borrar.setText("Eliminar");

        javax.swing.GroupLayout panel_idLayout = new javax.swing.GroupLayout(panel_id);
        panel_id.setLayout(panel_idLayout);
        panel_idLayout.setHorizontalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(182, 182, 182)
                .addComponent(jb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_cambiar)
                .addGap(10, 10, 10)
                .addComponent(jb_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_idLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_buscar)
                            .addComponent(jb_cambiar)
                            .addComponent(jb_borrar))
                        .addContainerGap())))
        );

        jPanel2.add(panel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 780, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 840, 550));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_altaActionPerformed
        datosVer();
    }//GEN-LAST:event_jb_altaActionPerformed

    private void jb_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bajaActionPerformed
        idVer();
        datosVer();
                
    }//GEN-LAST:event_jb_bajaActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        idVer();
        datosVer();
        edit();
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_consultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_consultasActionPerformed
       consultaVer();
    }//GEN-LAST:event_jb_consultasActionPerformed

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        int codigo = Integer.parseInt(jt_codigo.getText());
        c=cd.buscarCuartel(codigo);
        
        try {          
            
            if (codigo==c.getCodCuartel()) {
                datosVer();
                jb_guardar.setVisible(false);
                jt_nombre.setText(c.getNombreCuartel());
                jt_calle.setText(c.getCalleC() + "");
                jt_altura.setText(c.getAlturaC() + "");
                jt_tel.setText(c.getTelefono());
                jt_mail.setText(c.getMail());
                
            } else {
                JOptionPane.showMessageDialog(null, "El bombero no existe en la base de datos. ");
            }
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "solo se admiten valores numericos. ");
        }
        jt_codigo.setText("");
        id();
        datos();
                                       
    }//GEN-LAST:event_jb_buscarActionPerformed


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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_activos;
    private javax.swing.JButton jb_alta;
    private javax.swing.JButton jb_baja;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_cambiar;
    private javax.swing.JButton jb_consultas;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JTextField jt_altura;
    private javax.swing.JTextField jt_calle;
    private javax.swing.JTextField jt_codigo;
    private javax.swing.JTextField jt_mail;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_tel;
    private javax.swing.JPanel panel_consulta;
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
    
    panel_datos.setVisible(true);
}
public void consulta(){
    
    panel_consulta.setVisible(false);
}
public void consultaVer(){
    
    panel_consulta.setVisible(true);
}
public void cargarActivos(){
    
    List<Cuartel> lista = cd.listarCuartel();

    for (Cuartel x : lista) {

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
}
