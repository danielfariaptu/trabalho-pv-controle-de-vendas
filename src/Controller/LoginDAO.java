package Controller;

import Criptografia.BCrypt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tavv.controle.de.vendas.Login;
import tavv.controle.de.vendas.MenuPrincipal;

public class LoginDAO {

    private PreparedStatement statement;
    private ResultSet resultSet;
    private BCrypt BCrypt;
    private Integer cont = 1;
    private Boolean verificaSenha;
    private ConnectionDataBase bd;

    public LoginDAO() {
        bd = new ConnectionDataBase();

    }

    public String AutenticaSenha(String nome, String senhaPassada) {

        String senhaDoBanco;

        try {
            if (!bd.getConnection()) {
                JOptionPane.showMessageDialog(null, "Falha na conexão, o sistem será fechado!");
                System.exit(0);
            }

            String url = "SELECT * FROM usuario WHERE nome=?";

            statement = bd.connection.prepareStatement(url);
            statement.setString(1, nome);

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                senhaDoBanco = resultSet.getString("senha");

                verificaSenha = BCrypt.checkpw(senhaPassada, senhaDoBanco);

                if (verificaSenha) {
                    return (senhaDoBanco);
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Algo de errado aconteceu:\n " + erro.toString());
        }

        return ("SENHA ERRADA");
    }

    public void RealizaLogin(String nome, String senhaResultado, String senhaAtual) {

        try {
            if (!bd.getConnection()) {
                JOptionPane.showMessageDialog(null, "Falha na conexão, o sistem será fechado!");
                System.exit(0);
            }

            String userExist = "SELECT * FROM usuario WHERE nome=?";

            statement = bd.connection.prepareStatement(userExist);
            statement.setString(1, nome);

            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                if ("SENHA ERRADA".equals(senhaResultado) && !"".equals(nome)) {

                    if (cont > 2) {
                        JOptionPane.showMessageDialog(null, "Senha incorreta! " + cont + " tentativas realizadas!!");
                        if (cont == 6) {
                            JOptionPane.showMessageDialog(null, "Número de tentativas excedidas!! \nFechando a Aplicação!", "Senha Incorreta", JOptionPane.ERROR_MESSAGE);
                            System.exit(0);
                        }
                        cont++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta!");
                        cont++;

                    }
                } else if ((senhaAtual.trim().equals(""))) {
                    JOptionPane.showMessageDialog(null, "Verifique o campo de senha!");
                } else {

                    String url2 = "SELECT * FROM usuario WHERE nome=? AND senha=?";

                    statement = bd.connection.prepareStatement(url2);
                    statement.setString(1, nome);
                    statement.setString(2, senhaResultado);

                    resultSet = statement.executeQuery();

                    if (resultSet.next()) {

                        String name = resultSet.getString("nome");

                        JOptionPane.showMessageDialog(null, "Usuario logado com sucesso \n Nome: " + name);

                        MenuPrincipal mp = new MenuPrincipal();
                        Login lg = new Login();
                        lg.dispose();

                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum usuário com esse username foi encontrado!", "Usuário Inexistente", JOptionPane.ERROR_MESSAGE);

            }
            resultSet.close();
            statement.close();
            bd.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Algo de errado aconteceu:\n " + erro.toString());
        }
    }

}