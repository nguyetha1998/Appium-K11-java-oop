package Lab3;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = new int[]{55, 10, 3, 22, 5, 17, 31, 26, 12, 55, 32};
        int b;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    b = arr[i];
                    arr[i] = arr[j];
                    arr[j] = b;
                }
            }
        }
        for (int k : arr) {
            System.out.println(k);
        }

    }
}
