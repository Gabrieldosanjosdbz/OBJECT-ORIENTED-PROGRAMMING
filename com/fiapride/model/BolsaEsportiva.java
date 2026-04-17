package br.com.fiapride.model;

public class BolsaEsportiva extends Bolsa {

    private boolean impermeavel;

    public BolsaEsportiva(String marca, double preco, Dono dono, boolean impermeavel) {
        super(marca, preco, dono); // chama o construtor da classe mãe
        this.impermeavel = impermeavel;
    }

    public boolean isImpermeavel() {
        return impermeavel;
    }
}
