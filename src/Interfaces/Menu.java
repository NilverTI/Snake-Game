package Interfaces;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;

public class Menu extends javax.swing.JFrame {

    private ComoJugar ventanaComoJugar;
    private Diseño juegoSerpiente; // Instancia de la clase Diseño
    private int nivelDificultad = 1; // 1: Fácil, 2: Medio, 3: Difícil
    private Creditos VenCreditos;

    public Menu() {
        initComponents();
        ventanaComoJugar = new ComoJugar(this); 
        VenCreditos = new Creditos(this);

        ButtonGroup group = new ButtonGroup();
        group.add(jCFAcil);
        group.add(jCMedio);
        group.add(jCDificil);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLSerpiente = new javax.swing.JLabel();
        jBJugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jCMedio = new javax.swing.JCheckBox();
        jCFAcil = new javax.swing.JCheckBox();
        jCDificil = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBComoJugar = new javax.swing.JButton();
        jBCreditos = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 216, 191));

        jLTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/titulo.jpg"))); // NOI18N

        jLSerpiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/serpiente.png"))); // NOI18N

        jBJugar.setBackground(new java.awt.Color(222, 216, 191));
        jBJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btmJugar.png"))); // NOI18N
        jBJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJugarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pasto.jpg"))); // NOI18N

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.jpg"))); // NOI18N
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jCMedio.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jCMedio.setText("MEDIO");
        jCMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCMedioActionPerformed(evt);
            }
        });

        jCFAcil.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jCFAcil.setText("FACIL");
        jCFAcil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCFAcilActionPerformed(evt);
            }
        });

        jCDificil.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jCDificil.setText("DIFICIL");
        jCDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDificilActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("NIVEL DE DIFICULTAD");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("JUGAR");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("COMO");

        jBComoJugar.setBackground(new java.awt.Color(222, 216, 191));
        jBComoJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/como jugar.png"))); // NOI18N
        jBComoJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBComoJugarActionPerformed(evt);
            }
        });

        jBCreditos.setBackground(new java.awt.Color(204, 255, 204));
        jBCreditos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBCreditos.setText("CREDITOS");
        jBCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBCreditos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLSerpiente)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jCFAcil)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCMedio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCDificil))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jBJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jBComoJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLTitulo)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLTitulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBComoJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jBJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCFAcil)
                            .addComponent(jCMedio)
                            .addComponent(jCDificil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLSerpiente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jBCreditos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJugarActionPerformed
        int velocidad = 200; // por defecto
        int tamañoCelda = 40; // por defecto

        // Configurar velocidad y tamaño de celda según el nivel de dificultad seleccionado
        if (nivelDificultad == 2) {
            velocidad = 150;
            tamañoCelda = 30;
        } else if (nivelDificultad == 3) {
            velocidad = 100;
            tamañoCelda = 20;
        }

        // Crear una nueva instancia de JFrame para el juego de serpiente
        JFrame frame = new JFrame("Snake Game");

        // Instanciar Diseño con parámetros configurados y agregarlo al JFrame
        juegoSerpiente = new Diseño(800, 600, nivelDificultad, this);
        frame.add(juegoSerpiente);

        // Configurar el JFrame del juego
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centrar la ventana
        frame.setVisible(true);

        // Esconder el menú principal
        this.setVisible(false);
    }//GEN-LAST:event_jBJugarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCFAcilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCFAcilActionPerformed
        nivelDificultad = 1;
    }//GEN-LAST:event_jCFAcilActionPerformed

    private void jCMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCMedioActionPerformed
        nivelDificultad = 2;
    }//GEN-LAST:event_jCMedioActionPerformed

    private void jCDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCDificilActionPerformed
        nivelDificultad = 3;
    }//GEN-LAST:event_jCDificilActionPerformed

    private void jBComoJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBComoJugarActionPerformed
        ventanaComoJugar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBComoJugarActionPerformed

    private void jBCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCreditosActionPerformed
        VenCreditos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBCreditosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBComoJugar;
    private javax.swing.JButton jBCreditos;
    private javax.swing.JButton jBJugar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JCheckBox jCDificil;
    private javax.swing.JCheckBox jCFAcil;
    private javax.swing.JCheckBox jCMedio;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLSerpiente;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
