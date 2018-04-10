

package tavv.controle.de.vendas;

import java.awt.Color;


public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
       
        setResizable(false);
        initComponents();
        setSize(1280, 800);
        setLocationRelativeTo(null);
        
        BotaoCliente.setBackground(new Color(0,0,0));
        BotaoCliente.setFocusable(false);
        BotaoCompra.setBackground(new Color(0,0,0));
        BotaoConta.setBackground(new Color(0,0,0));
        BotaoEndereco.setBackground(new Color(0,0,0));
        BotaoFatura.setBackground(new Color(0,0,0));
        BotaoPagamento.setBackground(new Color(0,0,0));
        BotaoProduto.setBackground(new Color(0,0,0));
        
        Conta.setBackground(new Color(50,50,80,111));
        
    }

   
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Conta = new javax.swing.JPanel();
        BotaoCliente = new javax.swing.JButton();
        BotaoEndereco = new javax.swing.JButton();
        BotaoCompra = new javax.swing.JButton();
        BotaoConta = new javax.swing.JButton();
        BotaoFatura = new javax.swing.JButton();
        BotaoPagamento = new javax.swing.JButton();
        BotaoProduto = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BotaoCliente.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCliente.setText("CLIENTE");
        BotaoCliente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BotaoCliente.setBorderPainted(false);
        BotaoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotaoCliente.setFocusPainted(false);
        BotaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoClienteActionPerformed(evt);
            }
        });

        BotaoEndereco.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEndereco.setText("ENDEREÇO");
        BotaoEndereco.setBorder(null);
        BotaoEndereco.setFocusPainted(false);
        BotaoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnderecoActionPerformed(evt);
            }
        });

        BotaoCompra.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCompra.setText("COMPRA");
        BotaoCompra.setBorder(null);
        BotaoCompra.setFocusPainted(false);

        BotaoConta.setForeground(new java.awt.Color(255, 255, 255));
        BotaoConta.setText("CONTA");
        BotaoConta.setBorder(null);
        BotaoConta.setFocusPainted(false);
        BotaoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoContaActionPerformed(evt);
            }
        });

        BotaoFatura.setForeground(new java.awt.Color(255, 255, 255));
        BotaoFatura.setText("FATURA");
        BotaoFatura.setBorder(null);
        BotaoFatura.setFocusPainted(false);

        BotaoPagamento.setForeground(new java.awt.Color(255, 255, 255));
        BotaoPagamento.setText("PAGAMENTO");
        BotaoPagamento.setBorder(null);
        BotaoPagamento.setFocusPainted(false);

        BotaoProduto.setBackground(new java.awt.Color(255, 255, 255));
        BotaoProduto.setForeground(new java.awt.Color(255, 255, 255));
        BotaoProduto.setText("PRODUTO");
        BotaoProduto.setBorder(null);
        BotaoProduto.setFocusPainted(false);

        javax.swing.GroupLayout ContaLayout = new javax.swing.GroupLayout(Conta);
        Conta.setLayout(ContaLayout);
        ContaLayout.setHorizontalGroup(
            ContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotaoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotaoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotaoConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotaoFatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotaoPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
            .addComponent(BotaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContaLayout.setVerticalGroup(
            ContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContaLayout.createSequentialGroup()
                .addComponent(BotaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoFatura, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
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
    private javax.swing.JButton BotaoPagamento;
    private javax.swing.JButton BotaoProduto;
    private javax.swing.JPanel Conta;
    // End of variables declaration//GEN-END:variables
}
