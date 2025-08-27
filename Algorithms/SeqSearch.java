package Algorithms;


public class SeqSearch {
    public static void main(String[] args) {
        int[] a = {11, 14, 16, 8, 4, 9};
        int e = 11;

        for (int i = 0; i < 6; i++) {
            if (a[i] == e) {
                System.out.println("found");
                break;
            }
        }
    }
}