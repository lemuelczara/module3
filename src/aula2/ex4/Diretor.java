package aula2.ex4;

public class Diretor extends FuncionarioCLT {
    private static final double SALARIO_BASE = 15000;

    private final double lucroEmpresa = 100000;

    public Diretor() {
        super(SALARIO_BASE);
    }

    public double calcularParticipacao() {
        return this.lucroEmpresa * 0.03;
    }

    @Override
    public void pagarSalario() {
        this.salario = this.salarioBase + calcularParticipacao();
    }
}
