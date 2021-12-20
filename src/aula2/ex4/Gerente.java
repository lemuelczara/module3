package aula2.ex4;

public class Gerente extends FuncionarioCLT {
    private static final double SALARIO_BASE = 6000;

    private int metasBatidas;

    public Gerente(int metasBatidas) {
        super(SALARIO_BASE);
        this.metasBatidas = metasBatidas;
    }

    public double calcularMetas() {
        return (this.salarioBase * 0.125) * metasBatidas;
    }

    @Override
    public void pagarSalario() {
        this.salario = this.salarioBase + calcularMetas();
    }
}
