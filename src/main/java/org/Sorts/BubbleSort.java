package org.Sorts;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 9, 7, 0};
        int[] ints = bubblesort(arr);
        System.out.println(Arrays.toString(ints));
    }


    public static int[] bubblesort(int[] arr) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }

        return arr;
    }


}
