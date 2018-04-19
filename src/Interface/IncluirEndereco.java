/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author matheus
 */
public class IncluirEndereco extends javax.swing.JFrame {

    /**
     * Creates new form IncluirEndereco
     */
    public IncluirEndereco() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jTFBusca = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbLogradouro = new javax.swing.JLabel();
        jTF_Logradouro = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        jTF_numero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTF_Bairro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTF_cep = new javax.swing.JTextField();
        lbMunicipio = new javax.swing.JLabel();
        jTF_Municipio = new javax.swing.JTextField();
        jbEstado = new javax.swing.JLabel();
        jCBoxUf = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCBoxTipoEndereco = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Incluir Endereço");

        jPanel1.setBackground(new java.awt.Color(41, 30, 35));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INCLUIR ENDEREÇO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 20, 304, 29);

        label2.setDisplayedMnemonic('l');
        label2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Informe o CPF/CNPJ do cliente*:");
        jPanel1.add(label2);
        label2.setBounds(40, 120, 290, 19);
        jPanel1.add(jTFBusca);
        jTFBusca.setBounds(40, 160, 300, 27);

        jPanel2.setBackground(new java.awt.Color(41, 30, 35));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 17), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        lbLogradouro.setDisplayedMnemonic('l');
        lbLogradouro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbLogradouro.setForeground(new java.awt.Color(255, 255, 255));
        lbLogradouro.setText(" Logradouro*");
        jPanel2.add(lbLogradouro);
        lbLogradouro.setBounds(18, 48, 104, 17);
        jPanel2.add(jTF_Logradouro);
        jTF_Logradouro.setBounds(20, 70, 650, 29);

        lbNumero.setDisplayedMnemonic('n');
        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(255, 255, 255));
        lbNumero.setText(" Numero*");
        jPanel2.add(lbNumero);
        lbNumero.setBounds(690, 40, 74, 17);

        jTF_numero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTF_numeroFocusLost(evt);
            }
        });
        jTF_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_numeroActionPerformed(evt);
            }
        });
        jTF_numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF_numeroKeyTyped(evt);
            }
        });
        jPanel2.add(jTF_numero);
        jTF_numero.setBounds(700, 70, 100, 27);

        jLabel9.setDisplayedMnemonic('b');
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Bairro*");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 120, 59, 17);
        jPanel2.add(jTF_Bairro);
        jTF_Bairro.setBounds(20, 140, 330, 27);

        jLabel2.setDisplayedMnemonic('P');
        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CEP*");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(380, 120, 33, 17);
        jPanel2.add(jTF_cep);
        jTF_cep.setBounds(380, 140, 240, 27);

        lbMunicipio.setDisplayedMnemonic('m');
        lbMunicipio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbMunicipio.setForeground(new java.awt.Color(255, 255, 255));
        lbMunicipio.setText(" Municipio*");
        jPanel2.add(lbMunicipio);
        lbMunicipio.setBounds(670, 120, 86, 20);
        jPanel2.add(jTF_Municipio);
        jTF_Municipio.setBounds(670, 140, 220, 27);

        jbEstado.setDisplayedMnemonic('e');
        jbEstado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbEstado.setForeground(new java.awt.Color(255, 255, 255));
        jbEstado.setText(" Estado*");
        jPanel2.add(jbEstado);
        jbEstado.setBounds(20, 190, 65, 17);

        jCBoxUf.setMaximumRowCount(4);
        jCBoxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPanel2.add(jCBoxUf);
        jCBoxUf.setBounds(20, 210, 123, 27);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de endereço*:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(380, 180, 139, 20);

        jCBoxTipoEndereco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Selecione -", "Residencial", "Comercial" }));
        jPanel2.add(jCBoxTipoEndereco);
        jCBoxTipoEndereco.setBounds(380, 210, 123, 27);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 230, 930, 290);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom.png"))); // NOI18N
        jButton1.setText("Buscar");
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 160, 90, 29);

        jButton3.setText("Adicionar");
        jPanel1.add(jButton3);
        jButton3.setBounds(860, 540, 100, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 997, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTF_numeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTF_numeroFocusLost
        
    }//GEN-LAST:event_jTF_numeroFocusLost

    private void jTF_numeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_numeroKeyTyped
      
    }//GEN-LAST:event_jTF_numeroKeyTyped

    private void jTF_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_numeroActionPerformed

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
            java.util.logging.Logger.getLogger(IncluirEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IncluirEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IncluirEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IncluirEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IncluirEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCBoxTipoEndereco;
    private javax.swing.JComboBox<String> jCBoxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFBusca;
    private javax.swing.JTextField jTF_Bairro;
    private javax.swing.JTextField jTF_Logradouro;
    private javax.swing.JTextField jTF_Municipio;
    private javax.swing.JTextField jTF_cep;
    private javax.swing.JTextField jTF_numero;
    private javax.swing.JLabel jbEstado;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel lbLogradouro;
    private javax.swing.JLabel lbMunicipio;
    private javax.swing.JLabel lbNumero;
    // End of variables declaration//GEN-END:variables
}