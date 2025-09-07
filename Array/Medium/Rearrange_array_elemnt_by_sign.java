package Medium;
import java.util.*;
class Rearrange_array_elemnt_by_sign {
    
   public static void main(String[] args)
   {
        int[] array={3,1,-2,-5,2,-4};
        int[] ans = new int[array.length];

        System.out.print("Before Rearraning:");
        System.out.println(Arrays.toString(array));

        int posInd= 0;
        int negInd= 1;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]<0)
            {
                ans[negInd]=array[i];
                negInd+=2;
            }
            else
            {
                ans[posInd]=array[i];
                posInd+=2;
            }
        }
        System.out.print("After Rearraning:");
        System.out.println(Arrays.toString(ans));
    }

}


