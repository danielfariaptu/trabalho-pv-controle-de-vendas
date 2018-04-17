package Interface;

import Controle.GerenciaProduto;
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class CadastroProduto extends javax.swing.JDialog {

    HashSet backup = new HashSet(this.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
    HashSet teclaEnter = (HashSet) backup.clone();
    GerenciaProduto gp;
    
    public CadastroProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
  
    public CadastroProduto(java.awt.Frame parent, boolean modal, GerenciaProduto gp) {
        super(parent, modal);
        initComponents();
        this.gp = gp;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroProduto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfTipoUva = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
        tfPaisOrigem = new javax.swing.JTextField();
        tfCodigoBarras = new javax.swing.JTextField();
        tfTipoVinho = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbTipoUva = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        lbPaisOrigem = new javax.swing.JLabel();
        lbCodigoBarras = new javax.swing.JLabel();
        lbTipoVinho = new javax.swing.JLabel();
        lbAviso = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        closeIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastroProduto.setBackground(new java.awt.Color(41, 30, 35));
        CadastroProduto.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CadastroProdutoComponentShown(evt);
            }
        });
        CadastroProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE PRODUTO");
        CadastroProduto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 350, 43));

        tfNome.setNextFocusableComponent(tfPreco);
        CadastroProduto.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 300, 29));

        tfTipoUva.setNextFocusableComponent(tfPaisOrigem);
        CadastroProduto.add(tfTipoUva, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 300, 29));

        tfPreco.setNextFocusableComponent(tfCodigoBarras);
        CadastroProduto.add(tfPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 300, 29));

        tfPaisOrigem.setNextFocusableComponent(tfTipoVinho);
        CadastroProduto.add(tfPaisOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 300, 29));
        CadastroProduto.add(tfCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 300, 29));
        CadastroProduto.add(tfTipoVinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 300, 29));

        lbNome.setDisplayedMnemonic('n');
        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setLabelFor(lbNome);
        lbNome.setText(" NOME:");
        CadastroProduto.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        lbTipoUva.setDisplayedMnemonic('t');
        lbTipoUva.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipoUva.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoUva.setLabelFor(tfTipoUva);
        lbTipoUva.setText("TIPO DE UVA:");
        CadastroProduto.add(lbTipoUva, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, 20));

        lbPreco.setDisplayedMnemonic('p');
        lbPreco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPreco.setForeground(new java.awt.Color(255, 255, 255));
        lbPreco.setLabelFor(tfPreco);
        lbPreco.setText("PREÇO:");
        CadastroProduto.add(lbPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        lbPaisOrigem.setDisplayedMnemonic('a');
        lbPaisOrigem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbPaisOrigem.setForeground(new java.awt.Color(255, 255, 255));
        lbPaisOrigem.setLabelFor(tfPaisOrigem);
        lbPaisOrigem.setText("PAÍS DE ORIGEM:");
        CadastroProduto.add(lbPaisOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        lbCodigoBarras.setDisplayedMnemonic('c');
        lbCodigoBarras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbCodigoBarras.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoBarras.setLabelFor(tfCodigoBarras);
        lbCodigoBarras.setText("CÓDIGO DE BARRAS:");
        CadastroProduto.add(lbCodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        lbTipoVinho.setDisplayedMnemonic('I');
        lbTipoVinho.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipoVinho.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoVinho.setLabelFor(tfTipoVinho);
        lbTipoVinho.setText("TIPO DE VINHO:");
        CadastroProduto.add(lbTipoVinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        lbAviso.setForeground(new java.awt.Color(255, 255, 255));
        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        CadastroProduto.add(lbAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        btnFechar.setBackground(new java.awt.Color(102, 102, 102));
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cancelar-32.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setFocusPainted(false);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        CadastroProduto.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 140, 60));

        btnNovo.setBackground(new java.awt.Color(102, 102, 102));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-adicionar-32.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setFocusPainted(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        btnNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnNovoKeyTyped(evt);
            }
        });
        CadastroProduto.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 140, 60));

        btnConfirmar.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-ok-32.png"))); // NOI18N
        btnConfirmar.setText("Cadastro");
        btnConfirmar.setFocusPainted(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        btnConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnConfirmarKeyPressed(evt);
            }
        });
        CadastroProduto.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 140, 60));

        btnLimpar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-apagar-32.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setFocusPainted(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        btnLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLimparKeyPressed(evt);
            }
        });
        CadastroProduto.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 140, 60));

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        CadastroProduto.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        getContentPane().add(CadastroProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (!tfNome.getText().isEmpty()) {
            if (!tfPreco.getText().isEmpty()) {
                if (!tfCodigoBarras.getText().isEmpty()) {
                    if (!tfTipoUva.getText().isEmpty()) {
                        if (!tfPaisOrigem.getText().isEmpty()) {
                            if (!tfTipoVinho.getText().isEmpty()) {
                                if (JOptionPane.showConfirmDialog(rootPane, "Desesja realmente cadastrar este produto? ", "Comfirma salvar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                                    boolean result = gp.cadastrarProduto(tfNome.getText().trim(), Integer.valueOf(tfPreco.getText()), tfCodigoBarras.getText(), tfTipoUva.getText(), tfPaisOrigem.getText(), tfTipoVinho.getText());
                                    if (result) {
                                        abilitaCampos(false);
                                        btnConfirmar.setEnabled(false);
                                        btnNovo.setEnabled(true);
                                        JOptionPane.showMessageDialog(rootPane, "Produto cadastrado.");
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Produto não cadastrado !", "Atenção!", JOptionPane.WARNING_MESSAGE);
                                        tfNome.requestFocus();
                                    }
                                } else {
                                    tfNome.requestFocus();
                                }
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Campo Tipo de Vinho obrigatório!");
                                tfPreco.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Campo País de Origem obrigatório!");
                            tfCodigoBarras.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Campo Tipo de Uva obrigatório!");
                        tfTipoUva.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Campo Código de Barras obrigatório!");
                    tfPaisOrigem.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo Preço obrigatório!");
                tfTipoVinho.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campo Nome obrigatório!");
            tfNome.requestFocus();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmarKeyPressed
        if (evt.getKeyCode() == 10) {
            btnConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_btnConfirmarKeyPressed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCampos();
        abilitaCampos(true);
        tfNome.requestFocus();
        btnNovo.setEnabled(false);
        btnConfirmar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovoKeyTyped
        if (evt.getKeyCode() == 10) {
            btnNovoActionPerformed(null);
        }
    }//GEN-LAST:event_btnNovoKeyTyped

    private void CadastroProdutoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CadastroProdutoComponentShown
        lbAviso.setVisible(true);
        lbAviso.setForeground(Color.black);
        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        enterToTab();
        limpaCampos();
        abilitaCampos(true);
        btnNovo.setEnabled(false);
        btnConfirmar.setEnabled(true);
        tfNome.requestFocus();
    }//GEN-LAST:event_CadastroProdutoComponentShown

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
         limpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimparKeyPressed
         if (evt.getKeyCode() == 10) {
            btnLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btnLimparKeyPressed

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    public void limpaCampos() {
        tfNome.setText(null);
        tfPreco.setText(null);
        tfCodigoBarras.setText(null);
        tfTipoUva.setText(null);
        tfPaisOrigem.setText(null);
        tfTipoVinho.setText(null);
    }

    public void abilitaCampos(boolean status) {
        tfNome.setEnabled(status);
        tfPreco.setEnabled(status);
        tfCodigoBarras.setEnabled(status);
        tfTipoUva.setEnabled(status);
        tfPaisOrigem.setEnabled(status);
        tfTipoVinho.setEnabled(status);
    }

    public void enterToTab() {
        teclaEnter.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, teclaEnter);
        btnFechar.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
        btnConfirmar.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
        btnNovo.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
    }

   
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
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
       java.awt.EventQueue.invokeLater(new Runnable() {
	public void run() {
		CadastroProduto dialog = new CadastroProduto(new javax.swing.JFrame(), true);
		dialog.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
		dialog.setVisible(true);
	}
});
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroProduto;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbCodigoBarras;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPaisOrigem;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JLabel lbTipoUva;
    private javax.swing.JLabel lbTipoVinho;
    private javax.swing.JTextField tfCodigoBarras;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPaisOrigem;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfTipoUva;
    private javax.swing.JTextField tfTipoVinho;
    // End of variables declaration//GEN-END:variables
}