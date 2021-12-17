package aula1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex9 {
    public static void radixSort(int arr[]) {
        String arrString[] = new String[arr.length];
        int maiorValor = 0;
        int menorValor = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                maiorValor = arr[i];
                menorValor = arr[i];
            }

            if (arr[i] > maiorValor) {
                maiorValor = arr[i];
            }

            if (arr[i] < menorValor) {
                menorValor = arr[i];
            }
        }

        // Adicionando 0's aos números do Array com base no tamanho no maior valor dentro do array
        // Ex: [15, 920, 3203, 67], o maior número é 3203 com tamanho de 4
        // Então, todos os números tem que ser completados com 0's até estarem com tamanho 4
        // 0015, 0920, 3203, 0067
        for (int i = 0; i < arr.length; i++) {
            String numeroComZeros = String.format("%0" + String.valueOf(maiorValor).length() + "d", arr[i]);

            arrString[i] = numeroComZeros;
        }

        // Enquanto o tamanho do maiorValor não estiver sido totalmente percorrido
        // a cada iteração, o laço continua
        // Ou seja, um numero como 4520, teria que ter 4 repetições para terminar, pois o tamanho dele é 4
        int posVerificada = String.valueOf(maiorValor).length() - 1;
        while (posVerificada >= 0) {
            List<List<String>> listaDeListas = new ArrayList<List<String>>();

            for (int k = 0; k < 10; k++) listaDeListas.add(new ArrayList<String>());

            // Pegando a posVerificada de cada string do Array de Strings
            // Ex: ["003", "052", "912"]
            // n - 1 -> 003 o dígito será 3, 052 o dígito será 2, etc...
            for (String s : arrString) {
                int ultimoDigito = Character.getNumericValue(s.charAt(posVerificada));

                listaDeListas.get(ultimoDigito).add(s);
            }

            // Colocando os valores inseridos anteriores nas listas, para o Array de Strings
            // Percorro cada lista pelo seu tamanho, e insiro os valores pertencentes de cada lista (L0, L1, etc..)
            // dentro da posição determinada pela variavel cont no Array de Strings
            int cont = 0;
            for (List<String> lista : listaDeListas) {
                for (String s : lista) {
                    arrString[cont] = s;

                    cont++;
                }
            }

            posVerificada--;
        }

        Arrays.stream(arrString).forEach(s -> System.out.print(s + " "));
    }

    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(arr);
    }
}
