package aula2.ex4;

public abstract class FuncionarioPJ extends Funcionario {
    public double valorHoraTrabalhada;
    public int horasTrabalhadas;

    public FuncionarioPJ(double valorHoraTrabalhada, int horasTrabalhadas) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
