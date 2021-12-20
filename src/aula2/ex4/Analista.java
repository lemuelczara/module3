package aula2.ex4;

public class Analista extends FuncionarioCLT {
    private static final double SALARIO_BASE = 4000;

    public int metasBatidas;

    public Analista(int metasBatidas) {
        super(SALARIO_BASE);

        this.metasBatidas = metasBatidas;
    }

    public double calcularMetas() {
        return (this.salarioBase * 0.08) * metasBatidas;
    }

    @Override
    public void pagarSalario() {
        this.salario = this.salarioBase + calcularMetas();
    }
}
