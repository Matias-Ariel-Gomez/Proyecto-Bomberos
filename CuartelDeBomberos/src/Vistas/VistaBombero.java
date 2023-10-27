package Vistas;
import Entidades.*;
import ClasesData.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaBombero extends javax.swing.JInternalFrame {
    private Bombero b;
    private Brigada br;
    private BomberoData bd;
    private BrigadaData brd;
    private List<Brigada>lista;  
    private List<Bombero>listaB;
    DefaultTableModel mod;   
       
    public VistaBombero() {
        initComponents();
        b=null;
        br=new Brigada();
        bd=new BomberoData();
        brd=new BrigadaData();        
        lista=brd.listarBrigadasDisponibles();
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
        jLabel1 = new javax.swing.JLabel();
        bombero = new javax.swing.JLabel();
        jb_alta = new javax.swing.JButton();
        jb_baja = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_consultas = new javax.swing.JButton();
        panel_id = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jt_codigo = new javax.swing.JTextField();
        jb_borrar = new javax.swing.JButton();
        jb_buscar = new javax.swing.JButton();
        jb_cambiar = new javax.swing.JButton();
        panel_datos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jt_doc = new javax.swing.JTextField();
        jt_nombre = new javax.swing.JTextField();
        jrb_estado = new javax.swing.JRadioButton();
        jdc_fecha = new com.toedter.calendar.JDateChooser();
        jt_tel = new javax.swing.JTextField();
        jt_grupo = new javax.swing.JTextField();
        jb_guardar = new javax.swing.JButton();
        jcb_brig = new javax.swing.JComboBox();
        panel_consulta = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_consulta = new javax.swing.JTable();
        jb_listarPasivos = new javax.swing.JButton();
        jb_llistaPorBrig = new javax.swing.JButton();
        jb_listarActivos = new javax.swing.JButton();
        jb_salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1024, 614));
        setPreferredSize(new java.awt.Dimension(1024, 614));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión Bomberos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        bombero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Bombero.jpg"))); // NOI18N
        jPanel1.add(bombero, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jb_alta.setBackground(new java.awt.Color(51, 51, 51));
        jb_alta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_alta.setForeground(new java.awt.Color(255, 255, 255));
        jb_alta.setText("Altas");
        jb_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_altaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 90, -1));

        jb_baja.setBackground(new java.awt.Color(51, 51, 51));
        jb_baja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_baja.setForeground(new java.awt.Color(255, 255, 255));
        jb_baja.setText("Bajas");
        jb_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bajaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 90, -1));

        jb_modificar.setBackground(new java.awt.Color(51, 51, 51));
        jb_modificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        jb_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jb_consultas.setBackground(new java.awt.Color(51, 51, 51));
        jb_consultas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_consultas.setForeground(new java.awt.Color(255, 255, 255));
        jb_consultas.setText("Consultas");
        jb_consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consultasActionPerformed(evt);
            }
        });
        jPanel1.add(jb_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        panel_id.setBackground(new java.awt.Color(212, 245, 236));
        panel_id.setForeground(new java.awt.Color(51, 51, 51));
        panel_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DATOS INTERNOS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Código del Bombero:");

        jb_borrar.setBackground(new java.awt.Color(51, 51, 51));
        jb_borrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_borrar.setForeground(new java.awt.Color(255, 255, 255));
        jb_borrar.setText("Eliminar");
        jb_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_borrarActionPerformed(evt);
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

        jb_cambiar.setBackground(new java.awt.Color(51, 51, 51));
        jb_cambiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_cambiar.setForeground(new java.awt.Color(255, 255, 255));
        jb_cambiar.setText("Actualizar");
        jb_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_idLayout = new javax.swing.GroupLayout(panel_id);
        panel_id.setLayout(panel_idLayout);
        panel_idLayout.setHorizontalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addComponent(jb_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_cambiar)
                        .addGap(18, 18, 18)
                        .addComponent(jb_borrar)
                        .addGap(41, 41, 41))))
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_buscar)
                    .addComponent(jb_cambiar)
                    .addComponent(jb_borrar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(panel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 780, 70));

        panel_datos.setBackground(new java.awt.Color(212, 245, 236));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("DATOS PERSONALES");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Documento:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Apellido, Nombre:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Grupo (RH):");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Fecha de nacimiento:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Teléfono:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Brigada:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Estado:");

        jb_guardar.setBackground(new java.awt.Color(51, 51, 51));
        jb_guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");
        jb_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_guardarActionPerformed(evt);
            }
        });

        jcb_brig.setOpaque(false);

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(57, 57, 57))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosLayout.createSequentialGroup()
                                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_doc, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jdc_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_brig, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_guardar)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jrb_estado)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_estado)
                    .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel_datosLayout.createSequentialGroup()
                            .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel11)
                                .addComponent(jt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jt_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGroup(panel_datosLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jdc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardar)
                    .addComponent(jcb_brig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jt_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel1.add(panel_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 780, 130));

        panel_consulta.setBackground(new java.awt.Color(212, 245, 236));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("CONSULTAS");

        tabla_consulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_consulta);

        jb_listarPasivos.setBackground(new java.awt.Color(51, 51, 51));
        jb_listarPasivos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_listarPasivos.setForeground(new java.awt.Color(255, 255, 255));
        jb_listarPasivos.setText("Pasivos");
        jb_listarPasivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listarPasivosActionPerformed(evt);
            }
        });

        jb_llistaPorBrig.setBackground(new java.awt.Color(51, 51, 51));
        jb_llistaPorBrig.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_llistaPorBrig.setForeground(new java.awt.Color(255, 255, 255));
        jb_llistaPorBrig.setText("Por Brigada");
        jb_llistaPorBrig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_llistaPorBrigActionPerformed(evt);
            }
        });

        jb_listarActivos.setBackground(new java.awt.Color(51, 51, 51));
        jb_listarActivos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_listarActivos.setForeground(new java.awt.Color(255, 255, 255));
        jb_listarActivos.setText("Activos");
        jb_listarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listarActivosActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_consultaLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_consultaLayout.createSequentialGroup()
                        .addComponent(jb_listarActivos)
                        .addGap(18, 18, 18)
                        .addComponent(jb_listarPasivos)
                        .addGap(18, 18, 18)
                        .addComponent(jb_llistaPorBrig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_salir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(panel_consultaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_consultaLayout.setVerticalGroup(
            panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultaLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_listarPasivos)
                    .addComponent(jb_llistaPorBrig)
                    .addComponent(jb_listarActivos)
                    .addComponent(jb_salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panel_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 780, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 860, 600));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        b=bd.buscarBombero(codigo);
        
        try {          
            
            if (codigo==b.getCodBombero()) {
                datosVer();
                jb_guardar.setVisible(false);
                jt_doc.setText(b.getDni());
                jt_nombre.setText(b.getNombreCompleto());
                jt_grupo.setText(b.getGrupoSanguineo());
                LocalDate ld = b.getFechaNacimiento();
                java.util.Date d = java.util.Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jdc_fecha.setDate(d);
                jt_tel.setText(b.getTelCelular());
                jcb_brig.setSelectedItem(b.getBrigada().getCodBrigada());
                jrb_estado.setSelected(b.isEstadoBombero());

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

    private void jb_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_borrarActionPerformed
        
        int codigo = Integer.parseInt(jt_codigo.getText());
        b=bd.buscarBombero(codigo);
        
        try{
            if(b!=null){
                
                bd.eliminarBombero(codigo);
                
            }else {
                 
                JOptionPane.showMessageDialog(null, "El bombero no existe en la base de datos. ");
            }
            datos();
            id();
            
        } catch (NullPointerException np) {
            JOptionPane.showMessageDialog(null, "solo se admiten valores numericos. ");
        } 
        jt_codigo.setText("");
        id();
        
    }//GEN-LAST:event_jb_borrarActionPerformed

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
            String dni = jt_doc.getText();
            String nombre = jt_nombre.getText();
            String grupo = jt_grupo.getText();
            java.util.Date fn = jdc_fecha.getDate();
            LocalDate fechaNacimiento = fn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String tel = jt_tel.getText();
            Brigada x = (Brigada) jcb_brig.getSelectedItem();
            boolean estado = jrb_estado.isSelected();       
            
       try{          

            if (!dni.isEmpty() && !nombre.isEmpty() && !grupo.isEmpty() && tel.isEmpty()) {

                JOptionPane.showMessageDialog(null, "No se admiten campos vacios. ");
                return;
            }

            if (b == null) {

                b = new Bombero(dni, nombre, grupo, fechaNacimiento, tel, x, estado);
                bd.guardarBombero(b);

            }else {      
                
                JOptionPane.showMessageDialog(null, " El registro ya existe en la Base de Datos. ");
            }
            
        } catch (NullPointerException np) {

            JOptionPane.showMessageDialog(null, " Datos mal ingresados. ");
        }
        datos();
                
    }//GEN-LAST:event_jb_guardarActionPerformed

    private void jb_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cambiarActionPerformed
        
        String dni = jt_doc.getText();
        String nombre = jt_nombre.getText();
        String grupo = jt_grupo.getText();
        java.util.Date fn = jdc_fecha.getDate();
        LocalDate fechaNacimiento = fn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String tel = jt_tel.getText();
        boolean estado=jrb_estado.isSelected();
       
       
        try{
             if (b !=null) {
              
                b.setDni(dni);
                b.setNombreCompleto(nombre);
                b.setGrupoSanguineo(grupo);
                b.setFechaNacimiento(fechaNacimiento);
                b.setTelCelular(tel);
                b.isEstadoBombero();
               
                bd.modificarBombero(b);
            
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

    private void jb_listarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listarActivosActionPerformed
    
        try {
            cargarActivos();
            
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Bomberos que cumplan con el criterio.");
        }
        borrarFilas();
        consulta();
    }//GEN-LAST:event_jb_listarActivosActionPerformed

    private void jb_listarPasivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listarPasivosActionPerformed
        
        try {
            cargarPasivos();
            
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Bomberos que cumplan con el criterio.");
        }
        borrarFilas();
        consulta();
    }//GEN-LAST:event_jb_listarPasivosActionPerformed

    private void jb_llistaPorBrigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_llistaPorBrigActionPerformed
        Bombero x=null;
        Brigada selec = (Brigada) jcb_brig.getSelectedItem();       
        
        try {  
            listaB= (ArrayList)bd.listarBomberosPorBrigada();
            mod.addRow(new Object []{b.toString()});
            
            if(x.getBrigada()==selec){
                cargarPorBrigada();
            }
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Bomberos que cumplan con el criterio.");
        }
        Noespecial();
        consulta();

    }//GEN-LAST:event_jb_llistaPorBrigActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bombero;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JButton jb_alta;
    private javax.swing.JButton jb_baja;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_cambiar;
    private javax.swing.JButton jb_consultas;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_listarActivos;
    private javax.swing.JButton jb_listarPasivos;
    private javax.swing.JButton jb_llistaPorBrig;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JComboBox jcb_brig;
    private com.toedter.calendar.JDateChooser jdc_fecha;
    private javax.swing.JRadioButton jrb_estado;
    private javax.swing.JTextField jt_codigo;
    private javax.swing.JTextField jt_doc;
    private javax.swing.JTextField jt_grupo;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_tel;
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
public void cabeceras(){
    ArrayList<Object>filaCab=new ArrayList<>();
    filaCab.add(" CÓDIGO ");
    filaCab.add(" DNI ");
    filaCab.add(" NOMBRE COMPLETO");
    filaCab.add(" GRUPO SANGUÏNEO ");
    filaCab.add(" FECHA DE NACIMIENTO ");
    filaCab.add(" TELEFONO ");
    filaCab.add(" BRIGADA ");
    
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
public void especial(){
    jLabel4.setVisible(false);
    jLabel5.setVisible(false);
    jLabel6.setVisible(false);
    jLabel7.setVisible(false);
    jLabel8.setVisible(false);
    jLabel9.setVisible(false);
    jLabel11.setVisible(false);
    panel_datos.setVisible(true);
    jt_doc.setVisible(false);
    jt_nombre.setVisible(false);
    jt_grupo.setVisible(false);
    jdc_fecha.setVisible(false);
    jt_tel.setVisible(false);
    jcb_brig.setVisible(true);
    jrb_estado.setVisible(false);
    jb_guardar.setVisible(false);
}
public void Noespecial(){
    jLabel4.setVisible(false);
    jLabel5.setVisible(false);
    jLabel6.setVisible(false);
    jLabel7.setVisible(false);
    jLabel8.setVisible(false);
    jLabel9.setVisible(false);
    jLabel11.setVisible(false);
    panel_datos.setVisible(false);
    jt_doc.setVisible(false);
    jt_nombre.setVisible(false);
    jt_grupo.setVisible(false);
    jdc_fecha.setVisible(false);
    jt_tel.setVisible(false);
    jcb_brig.setVisible(false);
    jrb_estado.setVisible(false);
    jb_guardar.setVisible(false);
}
    
public void cargarActivos(){
    
    List<Bombero> listaB = bd.listarBomberosActivos();

    for (Bombero x : listaB) {

        mod.addRow(new Object[]{x.getCodBombero(),x.getDni(), x.getNombreCompleto(), x.getGrupoSanguineo(), x.getFechaNacimiento().toString(), x.getTelCelular(), x.getBrigada()});
    }

}
public void cargarPasivos(){
    
    List<Bombero> listaB = bd.listarBomberosPasivos();

    for (Bombero x : listaB) {

        mod.addRow(new Object[]{x.getCodBombero(),x.getDni(), x.getNombreCompleto(), x.getGrupoSanguineo(), x.getFechaNacimiento().toString(), x.getTelCelular(), x.getBrigada()});
    }

}   
public void cargarPorBrigada(){
    
    for (Bombero x : bd.listarBomberosPorBrigada()) {
        
        mod.addRow(new Object[]{x.getCodBombero(),x.getDni(), x.getNombreCompleto(), x.getGrupoSanguineo(), x.getFechaNacimiento().toString(), x.getTelCelular(), x.getBrigada().getCodBrigada()});
    }
}
public void cargarbox() {

    for (Brigada br : lista) {
        jcb_brig.addItem(br);
        
    }
    
}
public void noEdit(){

jt_doc.setEditable(false);
jt_nombre.setEditable(false);
jt_grupo.setEditable(false);
jdc_fecha.setEnabled(false);
jt_tel.setEditable(false);
jcb_brig.setEditable(false);
jrb_estado.setEnabled(false);

}
public void edit(){

jt_doc.setEditable(true);
jt_nombre.setEditable(true);
jt_grupo.setEditable(true);
jdc_fecha.setEnabled(true);
jt_tel.setEditable(true);
jcb_brig.setEditable(true);
jrb_estado.setEnabled(true);

}
}
