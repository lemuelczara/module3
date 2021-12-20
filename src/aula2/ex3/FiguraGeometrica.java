package aula2.ex3;

public abstract class FiguraGeometrica {
    public abstract double area();

    @Override
    public String toString() {
        return "Sou uma FiguraGeometrica e minha área é: " + area();
    }
}
