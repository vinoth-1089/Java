package Easy;
import java.util.Arrays;
import java.util.Scanner;

public class Missing_Number {

    public static void Solution(int[] array,int n)
    {
        int XorAll=0;

        for(int i=1;i<=n+1;i++)
        {
            XorAll^=i;
        }
        for(int v:array)
        {
            XorAll^=v;
        }
        System.out.println(XorAll);
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
