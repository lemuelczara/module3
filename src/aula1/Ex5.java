package aula1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumsInteiros = 0;
        int num = 0;

        System.out.print("Informe o 1º número: ");
        int n = scan.nextInt();

        System.out.print("Informe o 2º número: ");
        int m = scan.nextInt();

        System.out.print("Informe o 3º número: ");
        int d = scan.nextInt();

        while (qtdNumsInteiros < n) {
            num++;

            String numString = String.valueOf(num);

            int totalNumerosString = 0;

            for (int i = 0; i < numString.length(); i++) {
                if (Character.toString(numString.charAt(i)).equals(String.valueOf(d))) {
                    totalNumerosString++;
                }

                if (totalNumerosString == m) {
                    System.out.println(numString);

                    qtdNumsInteiros++;

                    break;
                }
            }
        }
    }
}
