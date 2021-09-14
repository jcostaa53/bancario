/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bancario.tela;

import br.com.bancario.entidade.ContaCorrente;
import br.com.bancario.negocio.ContaNegocio;
import javax.swing.JOptionPane;

/**
 *
 * @author silvio.junior
 */
public class CaixaEletronico extends javax.swing.JFrame {

    private ContaCorrente contaCorrente;

    public CaixaEletronico() {
        initComponents();

    }
    //sobrecarga
    public CaixaEletronico(ContaCorrente conta) {
        initComponents();
        contaCorrente = conta;
        logado.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        logado = new javax.swing.JPanel();
        btSaldo = new javax.swing.JButton();
        btDeposito = new javax.swing.JButton();
        btSaque = new javax.swing.JButton();
        lbCorrentista = new javax.swing.JLabel();
        btExtrato = new javax.swing.JButton();
        lb_senha = new javax.swing.JLabel();
        varSenha = new javax.swing.JPasswordField();
        btLogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Correntista");

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Caixa Eletrônico");

        logado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btSaldo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSaldo.setText("Saldo");
        btSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaldoActionPerformed(evt);
            }
        });

        btDeposito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btDeposito.setText("Deposito");
        btDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDepositoActionPerformed(evt);
            }
        });

        btSaque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btSaque.setText("Saque");
        btSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaqueActionPerformed(evt);
            }
        });

        lbCorrentista.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCorrentista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btExtrato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExtrato.setText("Extrato");
        btExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logadoLayout = new javax.swing.GroupLayout(logado);
        logado.setLayout(logadoLayout);
        logadoLayout.setHorizontalGroup(
            logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logadoLayout.createSequentialGroup()
                .addGroup(logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logadoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lbCorrentista, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(logadoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        logadoLayout.setVerticalGroup(
            logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logadoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbCorrentista, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(logadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSaldo)
                    .addComponent(btDeposito)
                    .addComponent(btSaque))
                .addGap(18, 18, 18)
                .addComponent(btExtrato)
                .addGap(27, 27, 27))
        );

        lb_senha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_senha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_senha.setText("Senha:");

        btLogar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLogar.setText("Entrar");
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(lb_senha)
                        .addGap(18, 18, 18)
                        .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_senha)
                    .addComponent(varSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLogar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(logado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
        String senha = String.valueOf(varSenha.getPassword());
        if (senha.equals(contaCorrente.getSenha())) {
            logado.setVisible(true);
            lbCorrentista.setText("Correntista " + contaCorrente.getNomeCorrentista() +
                    "      " + "Conta " + contaCorrente.getNumero());
        } else {
            JOptionPane.showMessageDialog(null, "Senha Incorreta!!!");
        }
        varSenha.setText("");
    }//GEN-LAST:event_btLogarActionPerformed

    private void btSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaldoActionPerformed
        JOptionPane.showMessageDialog(null, "Saldo: " + contaCorrente.getSaldo());
    }//GEN-LAST:event_btSaldoActionPerformed

    private void btDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDepositoActionPerformed
        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito!!"));
        ContaNegocio cn = new ContaNegocio();
        cn.depositar(contaCorrente, valorDeposito);
        
    }//GEN-LAST:event_btDepositoActionPerformed

    private void btSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaqueActionPerformed
        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque!!"));
        ContaNegocio cn = new ContaNegocio();
        cn.sacar2(contaCorrente, valorSaque);
    }//GEN-LAST:event_btSaqueActionPerformed

    private void btExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExtratoActionPerformed
        JOptionPane.showMessageDialog(null, "Saldo: " + contaCorrente.getSaldo()
                + contaCorrente.getExtrato());
    }//GEN-LAST:event_btExtratoActionPerformed

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
            java.util.logging.Logger.getLogger(CaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaEletronico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaixaEletronico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDeposito;
    private javax.swing.JButton btExtrato;
    private javax.swing.JButton btLogar;
    private javax.swing.JButton btSaldo;
    private javax.swing.JButton btSaque;
    private javax.swing.JLabel lbCorrentista;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JPanel logado;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel titulo;
    private javax.swing.JPasswordField varSenha;
    // End of variables declaration//GEN-END:variables
}
