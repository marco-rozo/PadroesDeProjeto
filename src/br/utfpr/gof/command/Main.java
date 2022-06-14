package br.utfpr.gof.command;

import javax.swing.JFrame;

public class Main extends JFrame {
    ControleRemoto controleRemoto;

    public Main(){
        initComponents();
        controleRemoto = new ControleRemoto();
        Alarme alarme = new Alarme();
        controleRemoto.setCommand(0, new LigaAlarmeCommand(alarme), new DesligaAlarmeCommand(alarme));
        System.out.println(controleRemoto);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLigar = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnDesligar = new javax.swing.JButton();
        btnDesfazer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle Remoto - Command");

        jLabel1.setText("Arquivo");
        jLabel2.setText("Trava");

        btnLigar.setText("Ligar");
        btnLigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigarActionPerformed(evt);
            }
        });

        btnDesligar.setText("Desligar");
        btnDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesligarActionPerformed(evt);
            }
        });

        btnDesfazer.setText("Desfazer");
        btnDesfazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesfazerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addComponent(btnLigar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDesligar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDesfazer)
                                .addContainerGap(65, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(btnLigar)
                                        .addComponent(btnDesligar)
                                        .addComponent(btnDesfazer))
                                .addContainerGap(47, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>

    private void btnLigarActionPerformed(java.awt.event.ActionEvent evt) {
        controleRemoto.ligar(0);
    }

    private void btnDesfazerActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Desfazendo: ");
        controleRemoto.undo();
    }

    private void btnDesligarActionPerformed(java.awt.event.ActionEvent evt) {
        controleRemoto.desligar(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnDesfazer;
    private javax.swing.JButton btnDesligar;
    private javax.swing.JButton btnLigar;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration
}
