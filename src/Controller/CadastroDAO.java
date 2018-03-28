package Controller;

import Criptografia.BCrypt;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import tavv.controle.de.vendas.Login;
import tavv.controle.de.vendas.MenuPrincipal;

public class CadastroDAO {

    private PreparedStatement statement;
    private ResultSet resultSet;
    private BCrypt BCrypt;
    private Integer cont = 1;
    private Boolean verificaSenha;
    private ConnectionDataBase bd;

    public CadastroDAO() {
        bd = new ConnectionDataBase();

    }

    public Boolean CadastroUser(String nome, String senhaHasheada) {

        try {
            if (!bd.getConnection()) {
                JOptionPane.showMessageDialog(null, "Falha na conexão, o sistem será fechado!");
                System.exit(0);
            }

            String url = "INSERT INTO usuario (nome, senha) VALUES(?,?)";
            statement = bd.connection.prepareStatement(url);
            statement.setString(1, nome);
            statement.setString(2, senhaHasheada);
            statement.execute();
            statement.close();
            bd.close();
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso!");
            return (true);

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Usuário com o mesmo username foi encontrado! \nUsuário: " + nome, "Usuário Existente", JOptionPane.ERROR_MESSAGE);
            return (false);

        }

    }

}
