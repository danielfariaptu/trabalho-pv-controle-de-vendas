package Interface;

import Controle.GerenciaProduto;
import Model.Produto;
import javax.swing.JOptionPane;

public class AlterarProduto extends javax.swing.JDialog {

    GerenciaProduto gp;
    Produto produto;

    public AlterarProduto(javax.swing.JDialog parent, boolean modal, GerenciaProduto gp, Produto produto) {
        super(parent, modal);
        this.gp = gp;
        this.produto = produto;
        initComponents();
        preenceCampos();
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
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lbAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastroProduto.setBackground(new java.awt.Color(51, 0, 102));
        CadastroProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALTERAÇÃO DE PRODUTO");
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

        tfTipoVinho.setNextFocusableComponent(btnConfirmar);
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

        btnConfirmar.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/confirmar_1.png"))); // NOI18N
        btnConfirmar.setText("Cadastro");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        CadastroProduto.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 140, 60));

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trabalhoedwar/imagens/excluir.png"))); // NOI18N
        btnCancelar.setText("Fechar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        CadastroProduto.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 140, 60));

        lbAviso.setText("Os campos marcados com * são obrigatórios.");
        CadastroProduto.add(lbAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        getContentPane().add(CadastroProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        Produto pro = new Produto(tfNome.getText(), Integer.valueOf(tfPreco.getText()), tfCodigoBarras.getText(), tfTipoUva.getText(), tfPaisOrigem.getText(), tfTipoVinho.getText());
        boolean result = gp.alterarProduto(pro);
        if (result) {
            JOptionPane.showMessageDialog(rootPane, "Produto aterado com sucesso.");
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Impósivel alterar produto!");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    private void preenceCampos() {
        tfNome.setText(produto.getNome());
        tfPreco.setText(String.valueOf(produto.getPreco()));
        tfCodigoBarras.setText(produto.getCodigoBarras());
        tfTipoUva.setText(produto.getTipoUva());
        tfPaisOrigem.setText(produto.getPaisOrigem());
        tfTipoVinho.setText(produto.getTipoVinho());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroProduto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
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
