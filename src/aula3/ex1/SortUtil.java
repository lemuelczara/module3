package aula3.ex1;

// ["b", "a", "c"]

public class SortUtil {
    public static <T> Precedente<T>[] sort(Precedente<T> arr[]) {
        int arrLength = arr.length;

        Precedente<T> temp;

        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (arr[j].precedeA((T) arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
