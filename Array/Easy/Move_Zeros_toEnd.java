package Easy;
import java.util.*;


public class Move_Zeros_toEnd {


    public static void Solution(int[] array,int n)
    {   int j=0;
        for(int i=0;i<n;i++)
        {
            
            
            if(array[i]!=0)
            {
                array[j++]=array[i];
            }
            
        }

        while(j<n)
        {
            array[j++]=0;
        }
         System.out.println("After Moving Zeros: " + Arrays.toString(array));
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
