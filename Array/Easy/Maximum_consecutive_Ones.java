package Easy;
import java.util.Arrays;
import java.util.Scanner;

public class Maximum_consecutive_Ones {
    

    public static void Solution(int[] array,int n)
    {
        int current_length=0;
        int max_length=0;

        for(int zero:array)
        {
            if(zero==0)
            {
                max_length+=Math.max(max_length,current_length);
                current_length=0;
            }
            else
            {
                current_length+=1;
            }
        }
        System.out.println("Maximum Consecutive Ones :"+Math.max(max_length,current_length));

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no.of Elements in Array:");

        int n= input.nextInt();
        int[] array = new int[n];

        System.out.println("Array Contains Only zero's and One's");

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
