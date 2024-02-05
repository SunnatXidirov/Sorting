package org.Sorts;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,1, 12, 5, 3, 9, 7, 0};
        int[] insertion = insertion(arr);
        System.out.println(Arrays.toString(insertion));
    }


    public static int[] insertion(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int currentEl = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentEl) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentEl;
        }
        return arr;
    }
}
