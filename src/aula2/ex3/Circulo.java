package aula2.ex3;

public class Circulo extends FiguraGeometrica {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }
}
