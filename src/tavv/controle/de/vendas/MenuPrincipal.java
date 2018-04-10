

package tavv.controle.de.vendas;

import java.awt.Color;


public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
       
        setResizable(false);
        initComponents();
        setSize(1280, 800);
        setLocationRelativeTo(null);
        
        Conta.setBackground(new Color(50,50,80,111));
        
    }

   
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Conta = new javax.swing.JPanel();
        BotaoEndereco = new javax.swing.JButton();
        BotaoCliente = new javax.swing.JButton();
        BotaoConta = new javax.swing.JButton();
        BotaoFatura = new javax.swing.JButton();
        BotaoCompra = new javax.swing.JButton();
        BotaoProduto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BotaoEndereco.setText("ENDEREÇO");
        BotaoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnderecoActionPerformed(evt);
            }
        });

        BotaoCliente.setText("CLIENTE");
        BotaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoClienteActionPerformed(evt);
            }
        });

        BotaoConta.setText("CONTA");
        BotaoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoContaActionPerformed(evt);
            }
        });

        BotaoFatura.setText("FATURA");

        BotaoCompra.setText("COMPRA");

        BotaoProduto.setText("PRODUTO");

        jButton1.setText("PAGAMENTO");

        javax.swing.GroupLayout ContaLayout = new javax.swing.GroupLayout(Conta);
        Conta.setLayout(ContaLayout);
        ContaLayout.setHorizontalGroup(
            ContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContaLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(ContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(BotaoFatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BotaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoConta, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        ContaLayout.setVerticalGroup(
            ContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BotaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        getContentPane().add(Conta);
        Conta.setBounds(0, 0, 330, 800);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thumb-1920-352596 - Copia.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1280, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoEnderecoActionPerformed

    private void BotaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoClienteActionPerformed

    private void BotaoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoContaActionPerformed


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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton BotaoCliente;
    private javax.swing.JButton BotaoCompra;
    private javax.swing.JButton BotaoConta;
    private javax.swing.JButton BotaoEndereco;
    private javax.swing.JButton BotaoFatura;
    private javax.swing.JButton BotaoProduto;
    private javax.swing.JPanel Conta;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
