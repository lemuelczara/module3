package aula1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o 1º número: ");
        int n = scan.nextInt();

        System.out.print("Informe o 2º número: ");
        int m = scan.nextInt();

        int qtdNumMultiplos = 0;

        for (int i = 1; qtdNumMultiplos < n; i++) {
            if (i % m == 0) {
                System.out.println(i);

                qtdNumMultiplos++;
            }
        }

        scan.close();
    }
}
