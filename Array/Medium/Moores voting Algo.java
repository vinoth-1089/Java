package Medium;
import java.util.*;

class MooresvotingAlgo {
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,5,6,6,6,6,6,6,7,7));

        int count=0;
        int element=-1;
        for(int num:nums)
        {
            if (count==0)
            {
                element=num;
                count=1;
            }
            else if(num==element)
            {
                count+=1;
            }
            else{
                count-=1;
            }

        }
        int freq=0;
        for(int num:nums)
        {
            if(element==num) 
            {
                freq+=1;
            }
        }
        if (freq>nums.size()/2)
        {
            System.out.println("Majority Element:"+element);
        }
        else{
            System.out.println("No Majority Element:"+element);
        }
    
    
    }
}