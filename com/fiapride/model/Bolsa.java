package br.com.fiapride.model;

// A Classe define a estrutura. Ela não é a bolsa real, é apenas o modelo.
public class Bolsa {
    // Atributos (Características)
    private String marca;

    private double preco;

    private Dono dono;

    public Bolsa(String marca, double preco, Dono dono) {
        this.marca = marca;
        this.preco = preco;
        this.dono  = dono;
    }

    // Método para aumentar o preço
    public void aumentarPreco(double valor) {
        if (valor > 0) {
            preco += valor;
            System.out.println("Preço aumentado com sucesso!");
        } else {
            System.out.println("Erro: O valor deve ser positivo.");
        }
    }

    // Método para aplicar desconto
    public void aplicarDesconto(double valor) {
        if (valor > 0 && valor <= preco) {
            preco -= valor;
            System.out.println("Desconto aplicado com sucesso!");
        } else {
            System.out.println("Erro: Desconto inválido.");
        }
    }

    // get e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono){
        this.dono = dono;
    }

}