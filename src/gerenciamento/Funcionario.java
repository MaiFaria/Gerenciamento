package gerenciamento;

public abstract class Funcionario extends Pessoa {

    protected double salario;

    protected int ramal;

    public double calculaSalarioAnual() {
        return salario * 13;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
