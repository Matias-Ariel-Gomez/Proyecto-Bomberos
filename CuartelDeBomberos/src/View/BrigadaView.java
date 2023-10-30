package View;
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
        c=new Cuartel();
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        panel_consultas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_brigada = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jb_activas = new javax.swing.JButton();
        jb_pasivas = new javax.swing.JButton();
        jb_porCuartel = new javax.swing.JButton();
        panel_datos = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jb_guardar = new javax.swing.JButton();
        jrb_estado = new javax.swing.JRadioButton();
        jt_nombre = new javax.swing.JTextField();
        jt_esp = new javax.swing.JTextField();
        jcb_cuartel = new javax.swing.JComboBox();
        panel_id = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jb_buscar = new javax.swing.JButton();
        jb_cambiar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();
        jt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        brigada = new javax.swing.JLabel();
        jb_alta = new javax.swing.JButton();
        jb_baja = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_consulta = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(null);
        setMinimumSize(null);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1024, 614));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 307, 0, 0));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));

        panel_consultas.setBackground(new java.awt.Color(212, 245, 236));

        tabla_brigada.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_brigada);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("CONSULTAS");

        jb_activas.setBackground(new java.awt.Color(51, 51, 51));
        jb_activas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_activas.setForeground(new java.awt.Color(255, 255, 255));
        jb_activas.setText("Activas");
        jb_activas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_activasActionPerformed(evt);
            }
        });

        jb_pasivas.setBackground(new java.awt.Color(51, 51, 51));
        jb_pasivas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_pasivas.setForeground(new java.awt.Color(255, 255, 255));
        jb_pasivas.setText("Psivas");
        jb_pasivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pasivasActionPerformed(evt);
            }
        });

        jb_porCuartel.setBackground(new java.awt.Color(51, 51, 51));
        jb_porCuartel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_porCuartel.setForeground(new java.awt.Color(255, 255, 255));
        jb_porCuartel.setText("Por Cuartel");
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
                .addGap(47, 47, 47)
                .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panel_consultasLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_activas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_pasivas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_porCuartel)))
                .addGap(36, 36, 36))
        );
        panel_consultasLayout.setVerticalGroup(
            panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultasLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panel_consultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jb_activas)
                    .addComponent(jb_pasivas)
                    .addComponent(jb_porCuartel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_datos.setBackground(new java.awt.Color(212, 245, 236));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
                .addGap(40, 40, 40)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(jt_esp))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jcb_cuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jrb_estado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_guardar)
                        .addGap(30, 30, 30))))
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jcb_cuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_estado)
                            .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jt_esp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))))
                    .addComponent(jb_guardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_id.setBackground(new java.awt.Color(212, 245, 236));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_cambiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jb_eliminar)
                        .addComponent(jb_cambiar)
                        .addComponent(jb_buscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión Brigradas");

        brigada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Image20231018194921.jpg"))); // NOI18N

        jb_alta.setBackground(new java.awt.Color(51, 51, 51));
        jb_alta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_alta.setForeground(new java.awt.Color(255, 255, 255));
        jb_alta.setText("Altas");
        jb_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_altaActionPerformed(evt);
            }
        });

        jb_baja.setBackground(new java.awt.Color(51, 51, 51));
        jb_baja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_baja.setForeground(new java.awt.Color(255, 255, 255));
        jb_baja.setText("Bajas");
        jb_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bajaActionPerformed(evt);
            }
        });

        jb_modificar.setBackground(new java.awt.Color(51, 51, 51));
        jb_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });

        jb_consulta.setBackground(new java.awt.Color(51, 51, 51));
        jb_consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_consulta.setForeground(new java.awt.Color(255, 255, 255));
        jb_consulta.setText("Consultas");
        jb_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_consultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel1))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jb_alta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb_baja, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb_consulta)))
                        .addGap(18, 18, 18)
                        .addComponent(brigada))
                    .addComponent(panel_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jb_consulta)
                            .addComponent(jb_modificar)
                            .addComponent(jb_baja)
                            .addComponent(jb_alta)))
                    .addComponent(brigada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_consultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 770, 600));

        jb_salir.setBackground(new java.awt.Color(51, 51, 51));
        jb_salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_salir.setForeground(new java.awt.Color(255, 255, 255));
        jb_salir.setText("Salir");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, -1, -1));

        fondo.setBackground(new java.awt.Color(0, 51, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_altaActionPerformed
         limpiarCelda();
         cargarbox();        
         datosVer();        
         edit(); 
       
        
    }//GEN-LAST:event_jb_altaActionPerformed

    private void jb_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bajaActionPerformed
        limpiarCelda();
        idVer();
        datosVer();
    }//GEN-LAST:event_jb_bajaActionPerformed

    private void jb_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificarActionPerformed
        limpiarCelda();
        cargarbox();
        idVer();
        datosVer();
        edit();        
        
    }//GEN-LAST:event_jb_modificarActionPerformed

    private void jb_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_consultaActionPerformed
        cargarbox();
        borrarFilas();
        limpiarCelda();
        consultaVer();
        especial();
        
        
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
                jt_esp.setText(br.getEspecialidad());
                jcb_cuartel.setSelectedItem(br.getCuartel().getCodCuartel());
                jrb_estado.setSelected(br.isEstadoBrigada());

            } else {
                JOptionPane.showMessageDialog(null, "La Brigada no existe en la base de datos. ");
                
            }
            
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "Solo se admiten valores numericos. ");
            
        } 
        datos();
        id();
    }//GEN-LAST:event_jb_buscarActionPerformed

    private void jb_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cambiarActionPerformed
        limpiarCelda();
        
        String nombre = jt_nombre.getText();
        String espec = jt_esp.getText();
        Cuartel c=(Cuartel) jcb_cuartel.getSelectedItem();
        boolean estado=jrb_estado.isSelected();       
       
        try{
             if (br !=null) {
              
                br.setNombreClave(nombre);
                br.setEspecialidad(espec);
                br.setCuartel(c);
                br.isEstadoBrigada();
               
                brd.modificarBrigada(br);
            
             }else {
                 JOptionPane.showMessageDialog(null, " El registro no existe en la Base de Datos. ");
                 
             }           
            
        }catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, " Datos mal ingresados. ");
            
        }
          id();
          datos();
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
            String espec = jt_esp.getText();
            Cuartel c = (Cuartel) jcb_cuartel.getSelectedItem();
            boolean estado = jrb_estado.isSelected();       
          
            if (nombre.isEmpty() && espec.isEmpty() ) {

                JOptionPane.showMessageDialog(null, "No se admiten campos vacios. ");
                return;
            }

            if (br == null) {

                br = new Brigada(nombre, espec, c, estado);
                brd.guardarBrigada(br);

            }else {      
                
                JOptionPane.showMessageDialog(null, " El registro ya existe en la Base de Datos. ");
            }
            
        } catch (NullPointerException np) {

            JOptionPane.showMessageDialog(null, " Datos mal ingresados. ");
        }
        datos();     
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
             cargarPorCuartel();            
            
        } catch (NullPointerException npe) {
            
            JOptionPane.showMessageDialog(this, " No se encontraron Brigadas que cumplan con el criterio.");
       
        }        
       
    }//GEN-LAST:event_jb_porCuartelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brigada;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JRadioButton jrb_estado;
    private javax.swing.JTextField jt_codigo;
    private javax.swing.JTextField jt_esp;
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

public void especial(){
    jLabel5.setVisible(false);
    jLabel6.setVisible(false);
    jLabel7.setVisible(false);
    jLabel8.setVisible(true);
    jLabel9.setVisible(false);
    panel_datos.setVisible(true);
    jt_nombre.setVisible(false);
    jt_esp.setVisible(false);
    jcb_cuartel.setVisible(true);
    jrb_estado.setVisible(false);
    jb_guardar.setVisible(false);
}

public void Noespecial(){
    jLabel5.setVisible(false);
    jLabel6.setVisible(false);
    jLabel7.setVisible(false);
    jLabel8.setVisible(false);
    jLabel9.setVisible(false);
    panel_datos.setVisible(false);
    jt_nombre.setVisible(false);
    jt_esp.setVisible(false);
    jcb_cuartel.setVisible(false);
    jrb_estado.setVisible(false);
    jb_guardar.setVisible(false);
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

public void cargarPorCuartel(){
    
//     Cuartel n=(Cuartel)jcb_cuartel.getSelectedItem(); 
     List<Brigada> lista = brd.listarBrigadasPorCuartel();

    for (Brigada x : lista) {

        mod.addRow(new Object[]{x.getCodBrigada(),x.getNombreClave(), x.getEspecialidad(), x.getCuartel()});
    }

}

public void cargarbox() {

    for (Cuartel c : listaC) {
        jcb_cuartel.addItem(c); 
    }     
}

public void noEdit(){
    jt_nombre.setEditable(false);
    jt_esp.setEditable(false);
    jcb_cuartel.setEditable(false);
    jrb_estado.setEnabled(false);
}

public void edit(){
    jt_nombre.setEditable(true);
    jt_esp.setEditable(true);
    jcb_cuartel.setEditable(true);
    jrb_estado.setEnabled(true);
}

public void limpiarCelda(){
    jt_codigo.setText("");
    jt_nombre.setText("");
    jt_esp.setText("");
    jrb_estado.setSelected(false);
}

}
