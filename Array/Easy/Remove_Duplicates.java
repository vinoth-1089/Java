package Easy;

import java.util.*;
public class Remove_Duplicates {
    

    public static void Solution(int[]array,int len)
    {   int j=0;
        System.out.println("Before Remove Duplicates: "+Arrays.toString(array));

        for(int i=1;i<len;i++)
        {
            if(array[i]!=array[i-1])
            {    j++;
                array[j]=array[i];
              
            }
        }
        int [] result =Arrays.copyOfRange(array,0, j+1);
        System.out.println("After Remove Duplicates: " +Arrays.toString(result));

    }

    public static void main(String[] args)
    {
        int [] array ={1,1,1,2,2,2,3,3,3};
        int len = array.length;

        Solution(array,len);
    }
}
