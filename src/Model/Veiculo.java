package Model;

public class Veiculo {
    private String proprietario;
    private String placa;
    private int gas;

    public Veiculo(String proprietario, String placa, int gas) {
        this.proprietario = proprietario;
        this.placa = placa;
        this.gas = gas;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void abastecer(int gas) {
        this.gas += gas;
    }

    public void gastar(int gas) {
        this.gas -= gas;
    }
}