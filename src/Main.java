import Model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Carlos", "ABC-1234", -10);
        v1.abastecer(50);
        v1.gastar(100);
        System.out.println("Dono: " + v1.getProprietario() + " | Placa: " + v1.getPlaca() + " | Gas olina: " + v1.getGas());
    }
 }
