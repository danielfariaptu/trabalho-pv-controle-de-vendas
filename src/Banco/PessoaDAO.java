/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Controller.Conexao;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author matheus
 */
public class PessoaDAO {

    private PessoaFisica pf;
    private PessoaJuridica pj;
    private Connection conn;
    

    public PessoaDAO() {
    conn = Conexao.getConexao();
    }

    public boolean inserirPessoaFisica(PessoaFisica cliente) {
        String sql;
        PreparedStatement ps;
        
        
        sql = "INSERT INTO cliente(nome,limite_de_credito,cpf,excluido) VALUES (?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setDouble(2, cliente.getLimiteCredito());
            ps.setString(3, cliente.getCpf());
            ps.setBoolean(4, false);
            ps.execute();
            ps.close();
           return true;
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null,e.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
        } 
        return false;
    }
}
