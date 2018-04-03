package Entidades;

import java.time.LocalDate;


public class Pagamento {
 
    private LocalDate data;
    private double valor;
    private int tipo;
    private double juros;

    public Pagamento(LocalDate data, double valor, int tipo, double juros) {
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.juros = juros;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
}
