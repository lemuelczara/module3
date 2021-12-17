package aula1;

import java.math.BigDecimal;

public class Ex7 {
    public static void main(String[] args) {
        BigDecimal valorEmpresaX = new BigDecimal(1130000);
        double porcCrescimentoEmpresaX = 1.48;

        BigDecimal valorEmpresaY = new BigDecimal(18400000);
        double porcCrescimentoEmpresaY = 0.32;

        int anoAtual = 2021;

        while (valorEmpresaX.compareTo(valorEmpresaY) < 0) {
            anoAtual++;

            valorEmpresaX = valorEmpresaX.add(new BigDecimal(porcCrescimentoEmpresaX).multiply(valorEmpresaX));
            valorEmpresaY = valorEmpresaY.add(new BigDecimal(porcCrescimentoEmpresaY).multiply(valorEmpresaY));

            System.out.println("Empresa X - 01/01/" + anoAtual + " - Valor da empresa: " + String.format("%.2f", valorEmpresaX.doubleValue() / 1000000) + "m");
            System.out.println("Empresa Y - 01/01/" + anoAtual + " - Valor da empresa: " + String.format("%.2f", valorEmpresaY.doubleValue() / 1000000) + "m\n");

        }
    }
}
