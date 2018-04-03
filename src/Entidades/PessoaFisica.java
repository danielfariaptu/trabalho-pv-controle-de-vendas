package Entidades;

import java.util.ArrayList;


public class PessoaFisica extends Cliente {
    
    private String cpf;

    public PessoaFisica(String cpf, String nome, ArrayList<Endereco> enderecos, double limiteCredito) {
        super(nome, enderecos, limiteCredito);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
