package Easy;
import java.util.Arrays;
import java.util.Scanner;

public class Find_number_Appers_once {

    public static void Solution(int[] array,int n)
    {
        int xor=0;
        for(int i:array)
        {
            xor^=i;
        }
        System.out.println("Number is Appers once:"+xor);
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
