package Vistas;
import Entidades.*;
import ClasesData.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SiniestroView extends javax.swing.JInternalFrame {
    private Siniestro s;
    private Cuartel c;
    private Brigada br;
    private SiniestroData sd;
    private CuartelData cd;
    private BrigadaData brd;
    private List<Siniestro> lista;
    private List<Brigada> listaB;
    private List<Cuartel> listaC;
    DefaultTableModel mod= new DefaultTableModel();
    
    public SiniestroView() {
        initComponents();
        Hora h= new Hora(jl_hora);        
        h.start();        
        s=null;
        c=null;
        br=null;
        sd=new SiniestroData();
        cd=new CuartelData();
        brd=new BrigadaData();
        lista=sd.listarUltimosSiniestros();
        listaB=brd.listarBrigadasPorCuartel(c, true);
        listaC=cd.listarCuartel();
        cabecera();
        cargarbox();
        cargarBox2();
        den();
        datos();
        cargarDist();
         
        jl_fecha.setText(fechaA()); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_consulta = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_siniestro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panel_den = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_tipo = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_detalle = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jt_calle = new javax.swing.JTextField();
        jt_altura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jrb_estado = new javax.swing.JRadioButton();
        jb_guardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jt_dist = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jcb_cuartel = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jcb_brigada = new javax.swing.JComboBox();
        jl_fecha = new javax.swing.JLabel();
        jl_hora = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jdc_fechaR = new com.toedter.calendar.JDateChooser();
        jt_puntuacion = new javax.swing.JTextField();
        jb_salir = new javax.swing.JButton();
        jb_denuncia = new javax.swing.JButton();
        jb_consulta = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1024, 614));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_consulta.setBackground(new java.awt.Color(212, 245, 236));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CONSULTAS");

        jLabel14.setText("Seleccione la consulta que desea realizar:");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Siniestros Activos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Siniestros Resueltos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Ultimos Siniestros");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tabla_siniestro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane3.setViewportView(tabla_siniestro);

        javax.swing.GroupLayout panel_consultaLayout = new javax.swing.GroupLayout(panel_consulta);
        panel_consulta.setLayout(panel_consultaLayout);
        panel_consultaLayout.setHorizontalGroup(
            panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultaLayout.createSequentialGroup()
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_consultaLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(panel_consultaLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))))
                    .addGroup(panel_consultaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panel_consultaLayout.setVerticalGroup(
            panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addGroup(panel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(panel_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 810, 180));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN CENTRAL DE SINIESTROS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        panel_den.setBackground(new java.awt.Color(212, 245, 236));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Calle:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Altura:");

        lista_tipo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Incendios", "Rescate en Montaña", "Rescate en Accidente de Tráfico", "Derrumbes", "Inundaciones", "Prevención" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista_tipo);

        jt_detalle.setColumns(20);
        jt_detalle.setRows(5);
        jScrollPane2.setViewportView(jt_detalle);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Detalle:");

        jt_calle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_calleKeyTyped(evt);
            }
        });

        jt_altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_alturaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DATOS DEL SINIESTRO");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Distancia:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Cuartel:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Brigada:");

        jl_fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_fecha.setForeground(new java.awt.Color(0, 0, 102));
        jl_fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_fecha.setText("jLabel12");

        jl_hora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl_hora.setForeground(new java.awt.Color(0, 0, 102));
        jl_hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_hora.setText("jLabel7");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Fecha:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Hora:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Puntuación:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Fecha Resolucion:");

        jt_puntuacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_puntuacionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_denLayout = new javax.swing.GroupLayout(panel_den);
        panel_den.setLayout(panel_denLayout);
        panel_denLayout.setHorizontalGroup(
            panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_denLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_denLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel_denLayout.createSequentialGroup()
                        .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_denLayout.createSequentialGroup()
                                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_denLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(14, 14, 14))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_denLayout.createSequentialGroup()
                                        .addComponent(jl_fecha)
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel13)
                                        .addGap(45, 45, 45)
                                        .addComponent(jl_hora))
                                    .addGroup(panel_denLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel_denLayout.createSequentialGroup()
                                                .addComponent(jt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addGap(26, 26, 26)
                                                .addComponent(jt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(panel_denLayout.createSequentialGroup()
                                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel_denLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcb_brigada, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_denLayout.createSequentialGroup()
                                        .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panel_denLayout.createSequentialGroup()
                                                .addComponent(jcb_cuartel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(3, 3, 3))
                                            .addComponent(jt_dist, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(60, 60, 60)
                                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_denLayout.createSequentialGroup()
                                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jt_puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_denLayout.createSequentialGroup()
                                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jdc_fechaR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panel_denLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jb_guardar)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(251, 251, 251))))))
        );
        panel_denLayout.setVerticalGroup(
            panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_denLayout.createSequentialGroup()
                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_denLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(panel_denLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jb_guardar)))
                .addGap(14, 14, 14)
                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_fecha)
                    .addComponent(jl_hora)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(33, 33, 33)
                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_denLayout.createSequentialGroup()
                        .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_denLayout.createSequentialGroup()
                                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_denLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(33, 33, 33))
                            .addGroup(panel_denLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt_puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(16, 16, 16)
                        .addComponent(jdc_fechaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_denLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_denLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16))
                            .addGroup(panel_denLayout.createSequentialGroup()
                                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jt_dist, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jcb_cuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(panel_denLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jcb_brigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(1, 1, 1)))
                .addGap(27, 27, 27))
        );

        jPanel1.add(panel_den, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 810, 310));

        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cerrar.jpg"))); // NOI18N
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });
        jPanel1.add(jb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, 40));

        jb_denuncia.setBackground(new java.awt.Color(51, 51, 51));
        jb_denuncia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_denuncia.setForeground(new java.awt.Color(255, 255, 255));
        jb_denuncia.setText("Denuncias");
        jb_denuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_denunciaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_denuncia, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jb_consulta.setBackground(new java.awt.Color(51, 51, 51));
        jb_consulta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jb_consulta.setForeground(new java.awt.Color(255, 255, 255));
        jb_consulta.setText("Consultas");
        jb_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consultaActionPerformed(evt);
            }
        });
        jPanel1.add(jb_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         borrarFilas();

        try {
            cargarActivos();

        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Siniestros que cumplan con el criterio.");

        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
         borrarFilas();

        try {
            cargarResueltos();

        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron siniestros que cumplan con el criterio.");

        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         borrarFilas();

        try {
            cargarUltimos();

        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, " No se encontraron Siniestor que cumplan con el criterio.");

        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
       dispose();
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jt_calleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_calleKeyTyped
         int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jt_calle.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_calleKeyTyped

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

    private void jt_puntuacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_puntuacionKeyTyped
         int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (jt_puntuacion.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_jt_puntuacionKeyTyped

    private void jb_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_consultaActionPerformed
       borrarFilas();
       datosVer();
        
    }//GEN-LAST:event_jb_consultaActionPerformed

    private void jb_denunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_denunciaActionPerformed
        limpiarCelda();
        datos();
        denVer();
    }//GEN-LAST:event_jb_denunciaActionPerformed

    private void jb_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_guardarActionPerformed
        
        
        try {
             int calle= Integer.parseInt(jt_calle.getText());
             int altura= Integer.parseInt(jt_altura.getText());
             LocalDate f= LocalDate.parse(jl_fecha.getText());
             LocalTime h= LocalTime.now();
             String tipo=lista_tipo.getSelectedValue();
             String det=jt_detalle.getText();
             Brigada br=new Brigada();
//             br.setCodBrigada(altura(br.));
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_guardarActionPerformed
 
    public static String fechaA(){
        Date fechaA=new Date();
        SimpleDateFormat sd= new SimpleDateFormat("dd/MM/YYYY");
        return sd.format(fechaA);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_consulta;
    private javax.swing.JButton jb_denuncia;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_salir;
    private javax.swing.JComboBox jcb_brigada;
    private javax.swing.JComboBox jcb_cuartel;
    private com.toedter.calendar.JDateChooser jdc_fechaR;
    private javax.swing.JLabel jl_fecha;
    private javax.swing.JLabel jl_hora;
    private javax.swing.JRadioButton jrb_estado;
    private javax.swing.JTextField jt_altura;
    private javax.swing.JTextField jt_calle;
    private javax.swing.JTextArea jt_detalle;
    private javax.swing.JTextField jt_dist;
    private javax.swing.JTextField jt_puntuacion;
    private javax.swing.JList<String> lista_tipo;
    private javax.swing.JPanel panel_consulta;
    private javax.swing.JPanel panel_den;
    private javax.swing.JTable tabla_siniestro;
    // End of variables declaration//GEN-END:variables

    public void den() {

        panel_den.setVisible(false);
    }

    public void denVer() {

        panel_den.setVisible(true);
    }

    public void datos() {

        panel_consulta.setVisible(false);
    }
    
    public void datosVer() {

        panel_consulta.setVisible(true);
    }

public void cargarbox() {

    for (Brigada br : listaB) {
        
        jcb_brigada.addItem(br); 
    }     
}

public void cargarBox2 (){
    
    for (Cuartel c: listaC){
        
        jcb_cuartel.addItem(c);
    }
}
    
public void cargarDist(){
    
    double d=sd.calcularDistancia();
    String dtext= String.valueOf(d);
     jt_dist.setText(dtext);  
     System.out.println(dtext);

}

public void cabecera() {
 ArrayList<Object>filaCab=new ArrayList<>();
    mod.addColumn(" N° ");
    mod.addColumn(" CALLE ");
    mod.addColumn(" ALTURA");
    mod.addColumn(" FECHA I");
    mod.addColumn(" TIPO");
    mod.addColumn(" BRIGADA ");
    mod.addColumn(" FECHA R ");
    mod.addColumn(" PUNTUACION ");
    
    for (Object fc: filaCab){
        mod.addColumn(fc);
        
    }  
    tabla_siniestro.setModel(mod);
}


public void cargarActivos() {

        List<Siniestro> lista = sd.listarSiniestrosActivos();

        for (Siniestro x : lista) {

            mod.addRow(new Object[]{x.getCodSiniestro(),x.getCalleS(), x.getAlturaS(), x.getFechaSiniestro().toString(), x.getTipo(), x.getBrigada(),x.getFechaResolucion().toString(), x.getPuntuacion()});
        }

    }

public void cargarResueltos() {

        List<Siniestro> lista = sd.listarSiniestrosResueltos();

        for (Siniestro x : lista) {

            mod.addRow(new Object[]{x.getCodSiniestro(),x.getCalleS(), x.getAlturaS(), x.getFechaSiniestro().toString(), x.getTipo(), x.getBrigada(),x.getFechaResolucion().toString(), x.getPuntuacion()});
        }

    }

public void cargarUltimos() {

        List<Siniestro> lista = sd.listarUltimosSiniestros();

        for (Siniestro x : lista) {

            mod.addRow(new Object[]{x.getCodSiniestro(),x.getCalleS(), x.getAlturaS(), x.getFechaSiniestro().toString(), x.getTipo(), x.getBrigada(),x.getFechaResolucion().toString(), x.getPuntuacion()});
        }

    }

   private void borrarFilas() {

        int f = tabla_siniestro.getRowCount() - 1;

        for (; f >= 0; f--) {

            mod.removeRow(f);
        }
    }
   
   
    public void limpiarCelda() {
        jt_calle.setText("");
        jt_altura.setText("");
        jt_dist.setText("");
        jt_detalle.setText("");
        jcb_cuartel.setSelectedItem(false);
        jcb_brigada.setSelectedItem(false);
        jdc_fechaR.setDate(null);
        jrb_estado.setSelected(false);
    }
}