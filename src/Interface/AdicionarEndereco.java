/*package Interface;

import Controle.GerenciaEndereco;
import Model.Cliente;
import Interface.Validador;
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class AdicionarEndereco extends javax.swing.JDialog {

    HashSet backup = new HashSet(this.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
    HashSet teclaEnter = (HashSet) backup.clone();
    GerenciaEndereco ge;

    public AdicionarEndereco(java.awt.Frame parent, boolean modal, GerenciaEndereco ge) {
        super(parent, modal);
        initComponents();
        this.ge = ge;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CadastroCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        tfMunicipio = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfComplemento = new javax.swing.JTextField();
        tfTipoEndereco = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        lbLogradouro = new javax.swing.JLabel();
        lbMunicipio = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        jbEstado = new javax.swing.JLabel();
        lbComplemento = new javax.swing.JLabel();
        lbTipoEndereco = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbAviso = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastroCliente.setBackground(new java.awt.Color(41, 30, 35));
        CadastroCliente.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CadastroClienteComponentShown(evt);
            }
        });
        CadastroCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADICIONAR ENDEREÇO");
        CadastroCliente.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 360, 43));

        tfLogradouro.setNextFocusableComponent(tfNumero);
        CadastroCliente.add(tfLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 300, 29));
        CadastroCliente.add(tfMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 300, 29));

        tfNumero.setNextFocusableComponent(tfComplemento);
        tfNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNumeroFocusLost(evt);
            }
        });
        tfNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumeroKeyTyped(evt);
            }
        });
        CadastroCliente.add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 300, 29));

        tfComplemento.setNextFocusableComponent(tfBairro);
        CadastroCliente.add(tfComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 300, 29));
        CadastroCliente.add(tfTipoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 300, 29));

        tfBairro.setNextFocusableComponent(tfMunicipio);
        CadastroCliente.add(tfBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 300, 29));

        lbLogradouro.setDisplayedMnemonic('l');
        lbLogradouro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbLogradouro.setForeground(new java.awt.Color(255, 255, 255));
        lbLogradouro.setLabelFor(lbLogradouro);
        lbLogradouro.setText(" LOGRADOURO*");
        CadastroCliente.add(lbLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        lbMunicipio.setDisplayedMnemonic('m');
        lbMunicipio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        lbMunicipio.setLabelFor(tfMunicipio);
        lbMunicipio.setText(" MUNICÍPIO*");
        CadastroCliente.add(lbMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 20));

        lbNumero.setDisplayedMnemonic('n');
        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(255, 255, 255));
        lbNumero.setLabelFor(tfNumero);
        lbNumero.setText(" NÚMERO*");
        CadastroCliente.add(lbNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jbEstado.setDisplayedMnemonic('e');
        jbEstado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jbEstado.setText(" ESTADO*");
        CadastroCliente.add(jbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        lbComplemento.setDisplayedMnemonic('c');
        lbComplemento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbComplemento.setForeground(new java.awt.Color(255, 255, 255));
        lbComplemento.setLabelFor(tfComplemento);
        lbComplemento.setText("COMPLEMENTO:");
        CadastroCliente.add(lbComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        lbTipoEndereco.setDisplayedMnemonic('t');
        lbTipoEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTipoEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lbTipoEndereco.setLabelFor(tfTipoEndereco);
        lbTipoEndereco.setText(" TIPO DE ENDEREÇO*");
        CadastroCliente.add(lbTipoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jLabel9.setDisplayedMnemonic('b');
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setLabelFor(tfBairro);
        jLabel9.setText(" BAIRRO*");
        CadastroCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        btnConfirmar.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/confirmar_1.png"))); // NOI18N
        btnConfirmar.setText("Cadastro");
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
        CadastroCliente.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 140, 60));

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/excluir.png"))); // NOI18N
        btnCancelar.setText("Fechar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        CadastroCliente.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 140, 60));

        lbAviso.setForeground(new java.awt.Color(255, 255, 255));
        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        CadastroCliente.add(lbAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        btnLimpar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpar.setText("Limpar");
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
        CadastroCliente.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, 140, 60));

        btnNovo.setBackground(new java.awt.Color(102, 102, 102));
        btnNovo.setText("Novo");
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
        CadastroCliente.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 140, 60));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        CadastroCliente.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 300, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CEP*");
        CadastroCliente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jComboBox1.setMaximumRowCount(3);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        CadastroCliente.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 160, -1));

        getContentPane().add(CadastroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 880, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        if (!tfLogradouro.getText().isEmpty()) {
        if (!tfNumero.getText().isEmpty()) {
            if (!tfComplemento.getText().isEmpty()) {
                if (!tfBairro.getText().isEmpty()) {
                    if (!tfMunicipio.getText().isEmpty()) {
                        if (!tfEstado.getText().isEmpty()) {
                            if (!tfTipoEndereco.getText().isEmpty()) {
                                if (JOptionPane.showConfirmDialog(rootPane, "Desesja realmente cadastrar este endereço? ", "Comfirma salvar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                                    boolean result = ge.cadastrarEndereco(tfLogradouro.getText().trim(), Integer.valueOf(tfNumero.getText().trim()), tfComplemento.getText().trim(), tfBairro.getText().trim(), tfMunicipio.getText().trim(), tfEstado.getText().trim(), Integer.valueOf(tfTipoEndereco.getText().trim()));
                                    if (result) {
                                        abilitaCampos(false);
                                        btnConfirmar.setEnabled(false);
                                        btnNovo.setEnabled(true);
                                        JOptionPane.showMessageDialog(rootPane, "Endereço cadastrado.");
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Endereço não cadastrado !", "Atenção!", JOptionPane.WARNING_MESSAGE);
                                        tfLogradouro.requestFocus();
                                    }
                                } else {
                                    tfLogradouro.requestFocus();
                                }
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Campo Tipo de Endereço obrigatorio!");
                                tfTipoEndereco.requestFocus();
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Campo Estado obrigatorio!");
                            tfEstado.requestFocus();
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Campo Município obrigatorio!");
                        tfMunicipio.requestFocus();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Campo Bairro obrigatorio!");
                    tfBairro.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Campo Complemento obrigatorio!");
                tfComplemento.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Campo Numero obrigatorio!");
            tfNumero.requestFocus();
        }
        }else{
             JOptionPane.showMessageDialog(rootPane, "Campo Logradouro obrigatorio!");
            tfLogradouro.requestFocus();
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnConfirmarKeyPressed
        if (evt.getKeyCode() == 10) {
            btnConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_btnConfirmarKeyPressed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimparKeyPressed
        if (evt.getKeyCode() == 10) {
            btnLimparActionPerformed(null);
        }
    }//GEN-LAST:event_btnLimparKeyPressed

    private void CadastroClienteComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CadastroClienteComponentShown
        lbAviso.setVisible(true);
        lbAviso.setForeground(Color.black);
        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        enterToTab();
        limpaCampos();
        abilitaCampos(true);
        btnNovo.setEnabled(false);
        btnConfirmar.setEnabled(true);
        tfLogradouro.requestFocus();
    }//GEN-LAST:event_CadastroClienteComponentShown

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCampos();
        abilitaCampos(true);
        tfLogradouro.requestFocus();
        btnNovo.setEnabled(false);
        btnConfirmar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovoKeyTyped
        if (evt.getKeyCode() == 10) {
            btnNovoActionPerformed(null);
        }
    }//GEN-LAST:event_btnNovoKeyTyped

    private void tfNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNumeroFocusLost
       lbAviso.setVisible(false);
    }//GEN-LAST:event_tfNumeroFocusLost

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        tratarNumeros(evt);
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public void limpaCampos() {
        tfLogradouro.setText(null);
        tfNumero.setText(null);
        tfComplemento.setText(null);
        tfBairro.setText(null);
        tfMunicipio.setText(null);
        tfEstado.setText(null);
        tfTipoEndereco.setText(null);
    }

    public void abilitaCampos(boolean status) {
        tfLogradouro.setEnabled(status);
        tfNumero.setEnabled(status);
        tfComplemento.setEnabled(status);
        tfBairro.setEnabled(status);
        tfMunicipio.setEnabled(status);
        tfEstado.setEnabled(status);
        tfTipoEndereco.setEnabled(status);
    }

    public void enterToTab() {
        teclaEnter.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, teclaEnter);
        btnLimpar.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
        btnConfirmar.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
        btnNovo.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, backup);
    }

    public void tratarNumeros(java.awt.event.KeyEvent evt) {
        if (!Validador.isCharNumber(evt.getKeyChar())) {
            evt.consume();
            lbAviso.setText("Aceita Apenas Números!");
            lbAviso.setForeground(Color.red);
            lbAviso.setVisible(true);
        } else {
            lbAviso.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jbEstado;
    private javax.swing.JLabel lbAviso;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbMunicipio;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbTipoEndereco;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfMunicipio;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfTipoEndereco;
    // End of variables declaration//GEN-END:variables
}
*/