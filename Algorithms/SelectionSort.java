package Algorithms;


public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {12, 6, 3, 8, 9, 23};

        for (int i = 0; i < a.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }

            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}