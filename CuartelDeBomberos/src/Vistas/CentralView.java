package Vistas;

import javax.swing.JOptionPane;

public class CentralView extends javax.swing.JFrame {

    public CentralView() {
        initComponents();
        this.setLocationRelativeTo(null);
        principal();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        contacto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Redes = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        face = new javax.swing.JLabel();
        insta = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        telegram = new javax.swing.JLabel();
        linked = new javax.swing.JLabel();
        github = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panel_usuario = new javax.swing.JPanel();
        iconoCentral = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        clave = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        tf_clave = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jmb_menu = new javax.swing.JMenuBar();
        jmi_exit = new javax.swing.JMenu();
        jmi_siniestros = new javax.swing.JMenuItem();
        jmi_bomberos = new javax.swing.JMenuItem();
        jmi_brigadas = new javax.swing.JMenuItem();
        jmi_cuarteles = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contacto.setBackground(new java.awt.Color(0, 51, 51));
        contacto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contacto:");
        contacto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/direccion.jpg"))); // NOI18N
        contacto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/telefono.jpg"))); // NOI18N
        contacto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/whathApp.jpg"))); // NOI18N
        contacto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mail.jpg"))); // NOI18N
        contacto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/atencion24hs.jpg"))); // NOI18N
        contacto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Calle X N° Y. Ciudad Z");
        contacto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("* 027");
        contacto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 180, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(00) XX-CUARTEL");
        contacto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 180, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("cuartel27@emergencia.com");
        contacto.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 160, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Al servicio los 365 dias...");
        contacto.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("las 24 horas...");
        contacto.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("los 7 dias de la semana.");
        contacto.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        Redes.setBackground(new java.awt.Color(0, 51, 51));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Seguinos @cuartel27.central en:");

        face.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/facebook.jpg"))); // NOI18N

        insta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/instagran.jpg"))); // NOI18N

        twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/twitter.jpg"))); // NOI18N

        telegram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/telegram.jpg"))); // NOI18N

        linked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/linkedlin.jpg"))); // NOI18N

        github.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/github.jpg"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PROYECTO-BOMBEROS");

        javax.swing.GroupLayout RedesLayout = new javax.swing.GroupLayout(Redes);
        Redes.setLayout(RedesLayout);
        RedesLayout.setHorizontalGroup(
            RedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(RedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RedesLayout.createSequentialGroup()
                        .addComponent(github)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15))
                    .addComponent(jLabel14)
                    .addGroup(RedesLayout.createSequentialGroup()
                        .addComponent(face)
                        .addGap(18, 18, 18)
                        .addComponent(insta)
                        .addGap(18, 18, 18)
                        .addComponent(twitter)
                        .addGap(18, 18, 18)
                        .addComponent(telegram)
                        .addGap(18, 18, 18)
                        .addComponent(linked)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        RedesLayout.setVerticalGroup(
            RedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(14, 14, 14)
                .addGroup(RedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(face)
                    .addComponent(telegram)
                    .addComponent(twitter)
                    .addComponent(linked)
                    .addComponent(insta))
                .addGap(18, 18, 18)
                .addGroup(RedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(github, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_usuario.setBackground(new java.awt.Color(0, 51, 51));
        panel_usuario.setForeground(new java.awt.Color(0, 51, 51));

        iconoCentral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/icono principal.jpg"))); // NOI18N

        user.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("Usuario:");

        clave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        clave.setForeground(new java.awt.Color(255, 255, 255));
        clave.setText("Clave:");

        tf_usuario.setBackground(new java.awt.Color(0, 51, 51));
        tf_usuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tf_usuario.setForeground(new java.awt.Color(255, 255, 255));
        tf_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        tf_clave.setBackground(new java.awt.Color(0, 51, 51));
        tf_clave.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tf_clave.setForeground(new java.awt.Color(255, 255, 255));
        tf_clave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_usuarioLayout = new javax.swing.GroupLayout(panel_usuario);
        panel_usuario.setLayout(panel_usuarioLayout);
        panel_usuarioLayout.setHorizontalGroup(
            panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usuarioLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user)
                    .addComponent(clave))
                .addGap(9, 9, 9)
                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconoCentral)
                    .addGroup(panel_usuarioLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        panel_usuarioLayout.setVerticalGroup(
            panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usuarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(iconoCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_usuario)
                    .addComponent(user))
                .addGap(39, 39, 39)
                .addGroup(panel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clave))
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo.jpg"))); // NOI18N

        escritorio.setLayer(contacto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(Redes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(panel_usuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(fondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(panel_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Redes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondo)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Redes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(panel_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(escritorioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 610));

        jmb_menu.setBackground(new java.awt.Color(153, 153, 153));
        jmb_menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jmi_exit.setBackground(new java.awt.Color(153, 153, 153));
        jmi_exit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jmi_exit.setText("Gestión de Siniestros");
        jmi_exit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jmi_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_exitActionPerformed(evt);
            }
        });

        jmi_siniestros.setBackground(new java.awt.Color(212, 245, 236));
        jmi_siniestros.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmi_siniestros.setText("Siniestros");
        jmi_siniestros.setFocusPainted(true);
        jmi_siniestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_siniestrosActionPerformed(evt);
            }
        });
        jmi_exit.add(jmi_siniestros);

        jmi_bomberos.setBackground(new java.awt.Color(212, 245, 236));
        jmi_bomberos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmi_bomberos.setText("Bomberos");
        jmi_bomberos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_bomberosActionPerformed(evt);
            }
        });
        jmi_exit.add(jmi_bomberos);

        jmi_brigadas.setBackground(new java.awt.Color(212, 246, 236));
        jmi_brigadas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmi_brigadas.setText("Brigadas");
        jmi_brigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_brigadasActionPerformed(evt);
            }
        });
        jmi_exit.add(jmi_brigadas);

        jmi_cuarteles.setBackground(new java.awt.Color(212, 245, 236));
        jmi_cuarteles.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jmi_cuarteles.setText("Cuarteles");
        jmi_cuarteles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cuartelesActionPerformed(evt);
            }
        });
        jmi_exit.add(jmi_cuarteles);

        jMenuItem1.setBackground(new java.awt.Color(212, 245, 236));
        jMenuItem1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jMenuItem1.setText("Salir");
        jmi_exit.add(jMenuItem1);

        jmb_menu.add(jmi_exit);

        setJMenuBar(jmb_menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
               
        String usuarioIng = tf_usuario.getText();
        char[] claveIng = tf_clave.getPassword();
        String clave = new String(claveIng);
        String usuario = "cuartel";

        try {

            if (usuarioIng.equals(usuario) && clave.equals("1234")) {

                JOptionPane.showMessageDialog(null, "Acceso correcto al sistema.");
                secundario();
                
            } else if (!usuarioIng.equals(usuario) && clave.equals("1234")) {

                JOptionPane.showMessageDialog(null, " Usuario incorrecto.");
                tf_usuario.setText("");
                tf_clave.setText("");

            } else if (usuarioIng.equals(usuario) && !clave.equals("1234")) {

                JOptionPane.showMessageDialog(null, " Clave incorrecta.");
                tf_usuario.setText("");
                tf_clave.setText("");

            } else if (usuarioIng.isEmpty() || clave.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Los campos no deben estar vacios. ");
                tf_usuario.setText("");
                tf_clave.setText("");

            } else if (!usuarioIng.equals(usuario) && !clave.equals("1234")) {

                JOptionPane.showMessageDialog(null, " Usuario y Clave incorrectos. ");
                tf_usuario.setText("");
                tf_clave.setText("");

            }

        } catch (NullPointerException e) {

            JOptionPane.showMessageDialog(null, " Parametros ingresados incorrectos. No se admiten simbolos o imagenes. ");
        }
        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jmi_siniestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_siniestrosActionPerformed
        
        ingresoView();
        escritorio.repaint();
        SiniestroView sin=new SiniestroView();
        sin.setVisible(true);
        escritorio.add(sin);
        sin.moveToFront();
    }//GEN-LAST:event_jmi_siniestrosActionPerformed

    private void jmi_bomberosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_bomberosActionPerformed
        
        ingresoView();
        escritorio.repaint();
        BomberoView bom=new BomberoView();
        bom.setVisible(true);
        escritorio.add(bom);
        bom.moveToFront();
    }//GEN-LAST:event_jmi_bomberosActionPerformed

    private void jmi_brigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_brigadasActionPerformed
        
        ingresoView();
        escritorio.repaint();
        BrigadaView bri=new BrigadaView();
        bri.setVisible(true);
        escritorio.add(bri);
        bri.moveToFront();
    }//GEN-LAST:event_jmi_brigadasActionPerformed

    private void jmi_cuartelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cuartelesActionPerformed
      
        ingresoView();
        escritorio.repaint();
        CuartelView cua=new CuartelView();
        cua.setVisible(true);
        escritorio.add(cua);
        cua.moveToFront();
       
    }//GEN-LAST:event_jmi_cuartelesActionPerformed

    private void jmi_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_exitActionPerformed

    }//GEN-LAST:event_jmi_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CentralView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentralView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentralView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentralView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentralView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Redes;
    private javax.swing.JLabel clave;
    private javax.swing.JPanel contacto;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel face;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel github;
    private javax.swing.JLabel iconoCentral;
    private javax.swing.JLabel insta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar jmb_menu;
    private javax.swing.JMenuItem jmi_bomberos;
    private javax.swing.JMenuItem jmi_brigadas;
    private javax.swing.JMenuItem jmi_cuarteles;
    private javax.swing.JMenu jmi_exit;
    private javax.swing.JMenuItem jmi_siniestros;
    private javax.swing.JLabel linked;
    private javax.swing.JPanel panel_usuario;
    private javax.swing.JLabel telegram;
    private javax.swing.JPasswordField tf_clave;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JLabel twitter;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

public void principal(){
    
    panel_usuario.setVisible(true);
    jmb_menu.setVisible(false);
    contacto.setVisible(false);
    Redes.setVisible(false);
}

public void secundario(){
    
    panel_usuario.setVisible(false);
    jmb_menu.setVisible(true);
    contacto.setVisible(true);
    Redes.setVisible(true);
}

public void ingresoView(){
      
    panel_usuario.setVisible(false);    
    jmb_menu.setVisible(true);
    contacto.setVisible(false);
    Redes.setVisible(false);
    
}

}
