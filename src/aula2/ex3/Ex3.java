package aula2.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static double areaMedia(List<FiguraGeometrica> arr) {
        double result = arr.stream().mapToDouble(e -> e.area()).sum();

        return result / arr.size();
    }

    public static void main(String[] args) {
        List<FiguraGeometrica> figurasGeometricas = new ArrayList<FiguraGeometrica>();
        Circulo circulo = new Circulo(5);
        System.out.println(circulo.toString());
        figurasGeometricas.add(circulo);

        Triangulo triangulo = new Triangulo(3, 2);
        System.out.println(triangulo.toString());
        figurasGeometricas.add(triangulo);

        Retangulo retangulo = new Retangulo(8, 2);
        System.out.println(retangulo.toString());
        figurasGeometricas.add(retangulo);

        System.out.println("Área média: " + areaMedia(figurasGeometricas) + " m2");
    }
}
