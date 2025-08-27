package Easy;

import java.util.*;
public class Left_Rotated_Array_by_one_place {
    

    public static void Solution(int[]array,int len)
    {
        int temp=array[0];
       
        for(int i=0;i<len-1;i++)
        {
            array[i]=array[i+1];
        }
        array[len-1]=temp;
        System.out.println("Left Rotated Array By One place: " + Arrays.toString(array));
    
    }

    public static void main(String[] args)
    {
        int [] array = {1,2,3,4,5};
        int len = array.length;
        Solution(array,len);
    }
}
