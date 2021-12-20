package aula2.ex4;

public class Tecnico extends FuncionarioCLT {
    private static final double SALARIO_BASE = 3200;

    public int metasBatidas;

    public Tecnico(int metasBatidas) {
        super(SALARIO_BASE);

        this.metasBatidas = metasBatidas;
    }

    public double calcularMetas() {
        return (this.salarioBase * 0.05) * metasBatidas;
    }

    @Override
    public void pagarSalario() {
        this.salario = this.salarioBase + calcularMetas();
    }
}
