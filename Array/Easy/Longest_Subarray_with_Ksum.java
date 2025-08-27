package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Longest_Subarray_with_Ksum {
    
    public static void Solution(int[] array, int n) {
        int Sum = 0;
        int left = 0;
        int Max_length = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter K Value:");
        int K= input.nextInt();

        for (int right = 0; right < n; right++) {
            Sum += array[right];

            // Shrink from left if sum exceeds K
            while (left <= right && Sum > K) {
                Sum -= array[left];
                left++;
            }

            // Check if current window equals K
            if (Sum == K) {
                Max_length = Math.max(Max_length, right - left + 1);
            }
        }

        System.out.println("Maximum Subarray With K sum: " + Max_length);
        input.close();
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no.of Elements in Array:");

        int n= input.nextInt();
        int[] array = new int[n];

      

        System.out.println("Enter Elements for Array:");

        for(int i=0;i<n;i++)
        {
            array[i]=input.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(array)); 

        Solution(array,n);

        input.close();

    }
}
