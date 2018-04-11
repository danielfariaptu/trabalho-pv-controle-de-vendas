package Controle;

import Banco.CompraDAO;
import Entidades.Compra;
import Controle.GerenciaProduto;
import java.util.ArrayList;
import java.util.Scanner;
import sun.util.resources.LocaleData;

public class GerenciaCompra {

    private Scanner scn;
    private CompraDAO compraBD;
    private GerenciaProduto gp;

    public GerenciaCompra() {
        scn = new Scanner(System.in);
        compraBD = new CompraDAO();
        gp = new GerenciaProduto();
    }
    
//    public boolean cadastrarCompra(Produto produto, double total, LocaleData data) {
//        Compra com = new Compra(produto, total, data);
//        String result = compraBD.inserirNoBanco(com);
//        return result.equals("sucesso");
//    }
    
    public boolean alterarCompra(Compra com) {
        String result = compraBD.alterarNoBanco(com);
        return result.equals("sucesso");
    }
    
    public boolean excluirCompra(String produto) {
        String result = compraBD.excluirDoBanco(produto);
        return result.equals("sucesso");
    }
}
