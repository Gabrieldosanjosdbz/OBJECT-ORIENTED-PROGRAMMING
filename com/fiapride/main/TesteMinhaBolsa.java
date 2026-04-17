package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Bolsa;
import br.com.fiapride.model.BolsaDeLuxo;
import br.com.fiapride.model.BolsaEsportiva;
import br.com.fiapride.model.Dono;

public class TesteMinhaBolsa {

    public static void main(String[] args) {

        // instanciando dono
        Dono dono = new Dono("Ana", 25);
        // Dentro do main...// Fabriquei a primeira (Instância 1)
        Bolsa minhaBolsa = new Bolsa("Louis Vitton", 1000.50, dono);

        // Fabriquei a segunda (Instância 2)
        Bolsa bolsaDoProfessor = new Bolsa("Armani", 2000.50, dono);

        System.out.println("Minha bolsa é: " + minhaBolsa.getMarca());
        System.out.println("O dono é: " + minhaBolsa.getDono().getNome()    );
        System.out.println("A bolsa do professor é: " + bolsaDoProfessor.getMarca());

        Bolsa minhaBolsaTests = new Bolsa("Louis Vuitton", 1000.50, dono);

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

        // bolsas
        Dono dono2 = new Dono("Carlos", 30);

        BolsaEsportiva esportiva = new BolsaEsportiva("Adidas", 150.0, dono2, true);
        BolsaDeLuxo luxo = new BolsaDeLuxo("Gucci", 2000.0, dono2, "Couro");

        System.out.println("=== Bolsa Esportiva ===");
        System.out.println("Marca: " + esportiva.getMarca());
        System.out.println("Impermeável: " + esportiva.isImpermeavel());

        System.out.println("\n=== Bolsa de Luxo ===");
        System.out.println("Marca: " + luxo.getMarca());
        System.out.println("Material: " + luxo.getMaterial());
    }
}