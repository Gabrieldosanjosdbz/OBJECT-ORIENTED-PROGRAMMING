package br.com.fiapride.model;

public class BolsaDeLuxo extends Bolsa {

    private String material;

    public BolsaDeLuxo(String marca, double preco, Dono dono, String material) {
        super(marca, preco, dono); // chama o construtor da mãe
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}