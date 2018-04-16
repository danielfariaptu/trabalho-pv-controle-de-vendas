/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Model.PessoaFisica;
import Model.PessoaJuridica;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author matheus
 */
public class PessoaDAO {

    private PessoaFisica pf;
    private PessoaJuridica pj;
    private Connection conn;
    

    public PessoaDAO() {
    
    }

    public void inserirPessoaFisica(PessoaFisica cliente) {
        String sql;
        PreparedStatement ps;
         
        /*
        
        sql = "INSERT INTO cliente(nome,limite_de_credito,cpf,excluido) VALUES (?,?,?,?)";

        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cli.getCode());
            ps.setString(2, cli.getNome());
            ps.setString(3, cli.getLogradouro());
            ps.setInt(4, cli.getNumero());
            ps.setString(5, cli.getBairro());
            ps.setString(6, cli.getMunicipio());
            ps.setString(7, cli.getEstado());
            ps.setString(8, cli.getCep());
            ps.setString(9, cli.getTelefone());
            ps.execute();
            ps.close();
        } catch (Exception e) {
            System.out.println("Erro na operação de inserção: " + e.getMessage());
        }
      */     
        
    }

}
