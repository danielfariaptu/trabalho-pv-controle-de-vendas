package Entidades;

import java.util.ArrayList;


public class PessoaJuridica extends Cliente{
    
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nomeFantasia, String cnpj, String nome, ArrayList<Endereco> enderecos, double limiteCredito) {
        super(nome, enderecos, limiteCredito);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
