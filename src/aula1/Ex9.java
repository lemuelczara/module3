package aula1;

// d(n, pos) = (n / 10^pos) % 10
// d(2819, 3) = (2819 / 10^3) % 10 = 2,819 % 10 = 2

import java.util.Arrays;

public class Ex9 {
    public static void countingSort(int arr[], int pos) {
        int countArray[] = new int[10];
        int outputArray[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ++countArray[(arr[i] / pos) % 10];
        }

        for (int i = 1; i < 10; i++) {
            countArray[i] = countArray[i - 1] + countArray[i];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            outputArray[--countArray[(arr[i] / pos) % 10]] = arr[i];
        }

        System.arraycopy(outputArray, 0, arr, 0, arr.length);
    }

    public static void radixSort(int arr[]) {
        int maxElem = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);

        for (int pos = 1; maxElem / pos > 0; pos *= 10) {
            countingSort(arr, pos);
        }
    }

    public static void main(String[] args) {
        int arr[] = {432, 8, 530, 90, 88, 231, 11, 45, 677, 199};

        radixSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }
}
