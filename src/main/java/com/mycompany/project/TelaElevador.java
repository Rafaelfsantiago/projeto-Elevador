/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author Rafael Ferreira Santaigo
 * RA: 82327312
 */
public class TelaElevador extends javax.swing.JFrame {
    private Elevador elevador;

    /**
     * Creates new form ElevadorTela
     */
    public TelaElevador() {
        elevador = new Elevador();
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elevadorSubirBotao = new javax.swing.JButton();
        elevadorDescerBotao = new javax.swing.JToggleButton();
        entrarGenteBotao = new javax.swing.JToggleButton();
        subirPessoaBotao = new javax.swing.JToggleButton();
        descerPessoaBotao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        qtdTotalPessoas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sentidoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        elevadorSubirBotao.setText("Subir");
        elevadorSubirBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadorSubirBotaoActionPerformed(evt);
            }
        });

        elevadorDescerBotao.setText("Descer");
        elevadorDescerBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elevadorDescerBotaoActionPerformed(evt);
            }
        });

        entrarGenteBotao.setText("EntrarGente...");

        subirPessoaBotao.setText("Subir Pessoa");

        descerPessoaBotao.setText("Descer Pessoa");

        jLabel1.setText("Quantidade de pessoas:");

        qtdTotalPessoas.setText("0");

        jLabel2.setText("Sentido do Elevador:");

        sentidoLabel.setText("Subindo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(elevadorSubirBotao)
                .addGap(49, 49, 49)
                .addComponent(elevadorDescerBotao)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sentidoLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtdTotalPessoas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(entrarGenteBotao)
                        .addGap(18, 18, 18)
                        .addComponent(subirPessoaBotao)
                        .addGap(18, 18, 18)
                        .addComponent(descerPessoaBotao)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(qtdTotalPessoas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sentidoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(elevadorSubirBotao)
                    .addComponent(elevadorDescerBotao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrarGenteBotao)
                    .addComponent(subirPessoaBotao)
                    .addComponent(descerPessoaBotao))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elevadorDescerBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadorDescerBotaoActionPerformed
        elevador.desce();
        sentidoLabel.setText("Descendo");
    }//GEN-LAST:event_elevadorDescerBotaoActionPerformed

    private void elevadorSubirBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elevadorSubirBotaoActionPerformed
        elevador.sobe();
        sentidoLabel.setText("Subindo");
    }//GEN-LAST:event_elevadorSubirBotaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaElevador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton descerPessoaBotao;
    private javax.swing.JToggleButton elevadorDescerBotao;
    private javax.swing.JButton elevadorSubirBotao;
    private javax.swing.JToggleButton entrarGenteBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel qtdTotalPessoas;
    private javax.swing.JLabel sentidoLabel;
    private javax.swing.JToggleButton subirPessoaBotao;
    // End of variables declaration//GEN-END:variables
}