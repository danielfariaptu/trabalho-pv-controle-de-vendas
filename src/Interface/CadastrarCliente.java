/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class CadastrarCliente extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public CadastrarCliente(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        closeIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRb_Pfisica = new javax.swing.JRadioButton();
        jRbPessoaJuridica = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTf_Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_cpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTF_NomeFantasia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTF_cnpj = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTF_LimiteCredito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTF_Logradouro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTF_numero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTF_Complemento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTF_Bairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTF_Municipio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTF_cep = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLblAddEndereco = new javax.swing.JLabel();
        jBtn_Salvar = new javax.swing.JButton();
        jCBoxUf = new javax.swing.JComboBox<>();
        jTF_TipoEndereco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(41, 30, 35));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 1, true));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-40.png"))); // NOI18N
        closeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconMouseClicked(evt);
            }
        });
        jPanel1.add(closeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE CLIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 230, -1));

        jPanel2.setBackground(new java.awt.Color(41, 30, 35));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        jRb_Pfisica.setBackground(new java.awt.Color(41, 30, 35));
        buttonGroup1.add(jRb_Pfisica);
        jRb_Pfisica.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jRb_Pfisica.setForeground(new java.awt.Color(255, 255, 255));
        jRb_Pfisica.setMnemonic('F');
        jRb_Pfisica.setText("Pessoa Física");
        jRb_Pfisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRb_PfisicaActionPerformed(evt);
            }
        });
        jPanel2.add(jRb_Pfisica);
        jRb_Pfisica.setBounds(18, 33, 129, 24);

        jRbPessoaJuridica.setBackground(new java.awt.Color(41, 30, 35));
        buttonGroup1.add(jRbPessoaJuridica);
        jRbPessoaJuridica.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jRbPessoaJuridica.setForeground(new java.awt.Color(255, 255, 255));
        jRbPessoaJuridica.setMnemonic('J');
        jRbPessoaJuridica.setText("Pessoa Jurídica");
        jRbPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbPessoaJuridicaActionPerformed(evt);
            }
        });
        jPanel2.add(jRbPessoaJuridica);
        jRbPessoaJuridica.setBounds(208, 33, 150, 30);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 690, 80));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome*:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 17));

        jTf_Nome.setEnabled(false);
        jPanel1.add(jTf_Nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 320, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPF*:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTF_cpf.setEnabled(false);
        jPanel1.add(jTF_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome Fantasia*:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 120, -1));

        jTF_NomeFantasia.setEnabled(false);
        jPanel1.add(jTF_NomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 300, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CNPJ*:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jTF_cnpj.setEnabled(false);
        jPanel1.add(jTF_cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 300, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Limite de Credito*:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, -1));

        jTF_LimiteCredito.setEnabled(false);
        jPanel1.add(jTF_LimiteCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 210, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Logradouro*:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, -1));

        jTF_Logradouro.setEnabled(false);
        jPanel1.add(jTF_Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 430, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numero*:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 80, 20));

        jTF_numero.setEnabled(false);
        jPanel1.add(jTF_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 190, 30));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Complemento:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 110, -1));

        jTF_Complemento.setEnabled(false);
        jPanel1.add(jTF_Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 430, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bairro*:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        jTF_Bairro.setEnabled(false);
        jPanel1.add(jTF_Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 190, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Municipio*:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 80, -1));

        jTF_Municipio.setEnabled(false);
        jPanel1.add(jTF_Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 330, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CEP*:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 57, -1));

        jTF_cep.setEnabled(false);
        jPanel1.add(jTF_cep, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 190, 30));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("UF*:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 50, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tipo de endereço*:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 140, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Campos \"*\" sao obrigatorios");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 200, -1));

        jLblAddEndereco.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLblAddEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLblAddEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        jLblAddEndereco.setText("Adicionar mais endereço");
        jLblAddEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLblAddEnderecoMouseClicked(evt);
            }
        });
        jPanel1.add(jLblAddEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 220, -1));

        jBtn_Salvar.setBackground(new java.awt.Color(118, 135, 245));
        jBtn_Salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/disk.png"))); // NOI18N
        jBtn_Salvar.setMnemonic('S');
        jBtn_Salvar.setText("Salvar");
        jBtn_Salvar.setToolTipText("Salva os registros");
        jBtn_Salvar.setFocusPainted(false);
        jBtn_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 650, 100, 40));

        jCBoxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jCBoxUf.setEnabled(false);
        jPanel1.add(jCBoxUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 70, -1));

        jTF_TipoEndereco.setEnabled(false);
        jPanel1.add(jTF_TipoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 547, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeIconMouseClicked

    private void jLblAddEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLblAddEnderecoMouseClicked
        // TODO add your handling code here:
        
        
        Adicionar
    }//GEN-LAST:event_jLblAddEnderecoMouseClicked

    private void jBtn_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalvarActionPerformed
        // TODO add your handling code here:
        if(jRbPessoaJuridica.isSelected()){
            
        }else if(jRb_Pfisica.isSelected()){
            
        }else{
            JOptionPane.showMessageDialog(null, "Informe o tipo de cliente!", "Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtn_SalvarActionPerformed

    private void jRb_PfisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRb_PfisicaActionPerformed
       desbloqueiaCampoFisica();
    }//GEN-LAST:event_jRb_PfisicaActionPerformed

    private void jRbPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbPessoaJuridicaActionPerformed
        desbloqueiaCampoJuridica();
    }//GEN-LAST:event_jRbPessoaJuridicaActionPerformed

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
                CadastrarCliente dialog = new CadastrarCliente(new javax.swing.JDialog(), true);
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
    
    
     private void CadastrarPessoaFisica(){
         
         
         if (!jTf_Nome.getText().isEmpty()) {
            if (!jTF_cpf.getText().isEmpty()) {
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
                                JOptionPane.showMessageDialog(rootPane, "Campo Preço obrigatorio!");
                                tfPreco.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Campo Código de Barras obrigatorio!");
                            tfCodigoBarras.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Campo Tipo de Uva obrigatorio!");
                        tfTipoUva.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Campo País de Origem obrigatorio!");
                    tfPaisOrigem.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo Tipo de Vinhoobrigatorio!");
                tfTipoVinho.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campo Nome obrigatorio!");
            tfNome.requestFocus();
        }
        
    }
    
     private void CadastrarPessoaJuridica(){
        
    }
     
    private void desbloqueiaCampoFisica(){
         jTF_Bairro.setEnabled(true);
        jTF_Complemento.setEnabled(true);
        jTF_LimiteCredito.setEnabled(true);
        jTF_Logradouro.setEnabled(true);
        jTF_Municipio.setEnabled(true); 
        jTF_NomeFantasia.setText(null);
        jTF_NomeFantasia.setEnabled(false);        
        jTF_TipoEndereco.setEnabled(true);        
        jTF_cep.setEnabled(true);
        jTF_cnpj.setText(null);
        jTF_cnpj.setEnabled(false);
        jTF_cpf.setEnabled(true);
        jTF_numero.setEnabled(true);
        jTf_Nome.setEnabled(true);
        jCBoxUf.setEnabled(true);
    }
    
    private void desbloqueiaCampoJuridica(){
         jTF_Bairro.setEnabled(true);
        jTF_Complemento.setEnabled(true);
        jTF_LimiteCredito.setEnabled(true);
        jTF_Logradouro.setEnabled(true);
        jTF_Municipio.setEnabled(true); 
        jTF_NomeFantasia.setEnabled(true);                
        jTF_cep.setEnabled(true);
        jTF_cnpj.setEnabled(true);
        jTF_cpf.setText(null);
        jTF_cpf.setEnabled(false);
        jTF_numero.setEnabled(true);
        jTf_Nome.setEnabled(true);
        jTF_TipoEndereco.setEnabled(true);
        jCBoxUf.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel closeIcon;
    private javax.swing.JButton jBtn_Salvar;
    private javax.swing.JComboBox<String> jCBoxUf;
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
    private javax.swing.JLabel jLblAddEndereco;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRbPessoaJuridica;
    private javax.swing.JRadioButton jRb_Pfisica;
    private javax.swing.JTextField jTF_Bairro;
    private javax.swing.JTextField jTF_Complemento;
    private javax.swing.JTextField jTF_LimiteCredito;
    private javax.swing.JTextField jTF_Logradouro;
    private javax.swing.JTextField jTF_Municipio;
    private javax.swing.JTextField jTF_NomeFantasia;
    private javax.swing.JTextField jTF_TipoEndereco;
    private javax.swing.JTextField jTF_cep;
    private javax.swing.JTextField jTF_cnpj;
    private javax.swing.JTextField jTF_cpf;
    private javax.swing.JTextField jTF_numero;
    private javax.swing.JTextField jTf_Nome;
    // End of variables declaration//GEN-END:variables
}
