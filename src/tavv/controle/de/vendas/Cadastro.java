/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tavv.controle.de.vendas;

import Criptografia.BCrypt;
import Controller.ConnectionDataBase;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author danie
 */
public class Cadastro extends javax.swing.JFrame {

    private ConnectionDataBase bd;
    private BCrypt BCrypt;
    private Arquivo file;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private static MenuPrincipal telaInicial;
            
    public Cadastro() {
        setResizable(false);  
        bd = new ConnectionDataBase();
	file = new Arquivo();
        this.setLocationRelativeTo(null);
        initComponents();
         URL caminhoIcone = getClass().getResource("/icons/icone.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(caminhoIcone);
        this.setIconImage(iconeTitulo);
        
        
        
     
    }
    
    private void limpaCampos(){
		fieldNome.setText("");
		fieldSenha.setText("");
		fieldSenhaConfirm.setText("");
	}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        fieldNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        labelCadastroUsuario = new javax.swing.JLabel();
        fieldSenha = new javax.swing.JPasswordField();
        labelUsuario = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        btnSair = new javax.swing.JToggleButton();
        iconRegistro = new javax.swing.JLabel();
        fieldSenhaConfirm = new javax.swing.JPasswordField();
        labelSenhaConfirm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário - Sistema Tabajara Atacado e Varejo de Vinhos");

        JPanel.setBackground(new java.awt.Color(51, 0, 102));

        fieldNome.setBackground(new java.awt.Color(227, 226, 242));
        fieldNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fieldNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNome.setBorder(null);
        fieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(51, 0, 51));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        labelCadastroUsuario.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelCadastroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelCadastroUsuario.setText("Cadastro de Usuário");

        fieldSenha.setBackground(new java.awt.Color(227, 226, 242));
        fieldSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        fieldSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldSenha.setBorder(null);
        fieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSenhaActionPerformed(evt);
            }
        });

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelUsuario.setText("Nome de Usuário: ");

        labelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(255, 255, 255));
        labelSenha.setText("Senha: ");

        btnSair.setBackground(new java.awt.Color(204, 204, 204));
        btnSair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Arrow Back.png"))); // NOI18N
        btnSair.setText("VOLTAR");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        iconRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/registericon.png"))); // NOI18N

        fieldSenhaConfirm.setBackground(new java.awt.Color(227, 226, 242));
        fieldSenhaConfirm.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        fieldSenhaConfirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldSenhaConfirm.setBorder(null);
        fieldSenhaConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSenhaConfirmActionPerformed(evt);
            }
        });

        labelSenhaConfirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSenhaConfirm.setForeground(new java.awt.Color(255, 255, 255));
        labelSenhaConfirm.setText("Confirmar senha: ");

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelSenha)
                                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fieldNome)
                                    .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(labelUsuario)
                                .addComponent(labelSenhaConfirm)
                                .addComponent(fieldSenhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanelLayout.createSequentialGroup()
                                .addComponent(iconRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(labelCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(labelCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsuario)
                .addGap(8, 8, 8)
                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(labelSenhaConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSenhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         		
				if((fieldNome.getText().trim().equals("")) || (fieldSenha.getText().trim().equals("")) || (fieldSenhaConfirm.getText().trim().equals(""))){
						JOptionPane.showMessageDialog(null, "Verifique se algum campo está vazio!");
				} else {
					if(!(fieldSenha.getText().equals(fieldSenhaConfirm.getText()))){
						System.out.println("Senha: " + fieldSenha.getText() + " | Confirmar Senha: " + fieldSenhaConfirm.getText());
						JOptionPane.showMessageDialog(null, "Os dois campos de senham não combinam!");
                     
					} else {
                                            
                                              
                                               String salGerado = BCrypt.gensalt();
                                               
                                                System.out.println("O sal gerado foi $" + salGerado + "$");

                                                // Gera a senha hasheada utilizando o sal gerado
                                                String senhaHasheada = BCrypt.hashpw(fieldSenha.getText(), salGerado);
                                                

                                                //Atualiza a senha do usuário
                                                //usuario.setSenha(senhaHasheada);

                                                //Salva no banco
                                               // adicionaNoBanco(usuario);
                                               
                                               JOptionPane.showMessageDialog(null, "SENHA HASHEADA! = "+ senhaHasheada); // VER SE ESTÁ FUNCIONANDO!
                                          
						try {
							if(!bd.getConnection()){
								JOptionPane.showMessageDialog(null, "Falha na conexão, o sistem será fechado!");
								System.exit(0);
							}

							String url = "INSERT INTO usuario (nome, senha) VALUES(?,?)";
							statement = bd.connection.prepareStatement(url);
							statement.setString(1, fieldNome.getText());
							statement.setString(2, senhaHasheada);
							statement.execute();
							statement.close();
							bd.close();
							JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");
							//limpaCampos();
							this.dispose();
						} catch(Exception erro) {
							JOptionPane.showMessageDialog(null, "Algo de errado aconteceu:\n " + erro.toString());
						}
					}
					
				}
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void fieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSenhaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void fieldSenhaConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSenhaConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSenhaConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JPasswordField fieldSenhaConfirm;
    private javax.swing.JLabel iconRegistro;
    private javax.swing.JLabel labelCadastroUsuario;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSenhaConfirm;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}