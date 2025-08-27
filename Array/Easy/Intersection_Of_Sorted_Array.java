package Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Intersection_Of_Sorted_Array {
    
  public static void Intersection(int[] array_a,int[] array_b,int n,int m)
    {   
        int i=0;
        int j=0;
        List<Integer> Intersection = new ArrayList<>();
        while(i<n && j<m)
        {
            if(array_a[i]<array_b[j])
            {
               
                i+=1;
            }
            else if(array_a[i]>array_b[j])
            {
                j+=1;
            }
            else
            {
                if (Intersection.isEmpty() || Intersection.get(Intersection.size() - 1) != array_a[i])
                {
                    Intersection.add(array_a[i]);
                }
                i+=1;
                j+=1;
            }
        }
        System.out.println("Intersection:"+Intersection);
    }
   public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no.of Elements in Array A:");

        int n= input.nextInt();
        int[] array_a = new int[n];
       

        System.out.println("Enter Elements for Array A:");

        for(int i=0;i<n;i++)
        {
            array_a[i]=input.nextInt();
        }
         System.out.print("Enter no.of Elements in Array B:");
        int m= input.nextInt();
        int[] array_b = new int[m];
        for(int j=0;j<m;j++)
        {
            array_b[j]=input.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(array_a)); 
        System.out.println("Original Array: " + Arrays.toString(array_b)); 

        Intersection(array_a,array_b,n,m);

        input.close();

    }
    











}
