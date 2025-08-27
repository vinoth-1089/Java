package Easy;
import java.util.*;


public class Union_of_Sorted_Array {

   

    public static void Union(int[] array_a,int[] array_b,int n,int m)
    {   
        int i=0;
        int j=0;
        List<Integer> union = new ArrayList<>();
        while(i<n && j<m)
        {
            if(array_a[i]<array_b[j])
            {
               if (union.isEmpty() || union.get(union.size() - 1) != array_a[i])
                {
                    union.add(array_a[i]);
                }
                i+=1;
            }
            else if(array_a[i]>array_b[j])
            {
               if (union.isEmpty() || union.get(union.size() - 1) != array_b[j])
                {
                    union.add(array_b[j]);
                }
                j+=1;
            }
            else
            {
                if (union.isEmpty() || union.get(union.size() - 1) != array_a[i])
                {
                    union.add(array_a[i]);
                }
                i+=1;
                j+=1;
            }
        }
        while(i<n)
        {
             if (union.isEmpty() || union.get(union.size() - 1) != array_a[i])
            {
                union.add(array_a[i]);
            }
            i+=1;
        }
        while(j<m)
        {
            if (union.isEmpty() || union.get(union.size() - 1) != array_b[j])
            {
                union.add(array_b[j]);
            }
            j+=1;
        }
        System.out.println("Union:"+union);
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

        Union(array_a,array_b,n,m);

        input.close();

    }
    
}
