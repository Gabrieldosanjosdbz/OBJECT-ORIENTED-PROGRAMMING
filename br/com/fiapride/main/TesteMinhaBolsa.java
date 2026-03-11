package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Bolsa;

public class TesteMinhaBolsa {

    public static void main(String[] args) {

        // Dentro do main...// Fabriquei a primeira (Instância 1)
        Bolsa minhaBolsa = new Bolsa("Louis Vitton", 1000.50);

        // Fabriquei a segunda (Instância 2)
        Bolsa bolsaDoProfessor = new Bolsa("Armani", 2000.50);

        System.out.println("Minha bolsa é: " + minhaBolsa.getMarca());
        System.out.println("A bolsa do professor é: " + bolsaDoProfessor.getMarca());

        Bolsa minhaBolsaTests = new Bolsa("Louis Vuitton", 1000.50);

        System.out.println("Preço inicial: " + minhaBolsaTests.getPreco());

        // Teste válido
        minhaBolsaTests.aumentarPreco(200);
        System.out.println("Preço após aumento: " + minhaBolsaTests.getPreco());

        //Teste inválido
        minhaBolsaTests.aumentarPreco(-50);

        //Teste válido
        minhaBolsaTests.aplicarDesconto(300);
        System.out.println("Preço após desconto: " + minhaBolsaTests.getPreco());

        // Teste inválido (desconto maior que o preço)
        minhaBolsaTests.aplicarDesconto(5000);
    }
}