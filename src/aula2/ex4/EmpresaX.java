package aula2.ex4;

public class EmpresaX extends FuncionarioPJ {
    private static final double VALOR_HORA_TRABALHADA = 50;
    private static final int QTD_HORAS_TRABALHADAS = 100;

    public EmpresaX() {
        super(VALOR_HORA_TRABALHADA, QTD_HORAS_TRABALHADAS);
    }

    @Override
    public void pagarSalario() {
        this.salario = this.horasTrabalhadas * this.valorHoraTrabalhada;
    }
}
