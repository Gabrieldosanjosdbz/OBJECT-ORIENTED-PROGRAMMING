public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("ABC1234", 15000.0, 3);
        Pacote pacote = new Pacote("BR999", 18.5, "Pendente");

        Rota rota = new Rota(pacote, caminhao);
        rota.iniciarEntrega();
        
        Moto moto = new Moto("XYZ5678", 50.0, true);
        Rota rotaMoto = new Rota(pacote, moto);
        rotaMoto.iniciarEntrega();
    }
}