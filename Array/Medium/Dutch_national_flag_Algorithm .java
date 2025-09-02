package Medium;

import java.util.Arrays;

class Dutch_national_flag_Algorithm {

    private void swap(int[] nums ,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }

    public int[] sort_0s1sand2s(int[]nums)
    {   
        int low=0;
        int mid=0;
        int high = nums.length-1;

        while(mid<=high)
        {
            if (nums[mid]==0){
                swap(nums,low,mid);
                low+=1;
                mid+=1;
            }
            else if(nums[mid]==1)
            {
                mid+=1;
            }
            else
            {
                swap(nums,mid,high);
                high-=1;
            }
        }
        return nums;
    }
    

}
class java{
    public static void main(String[] args)
    {
        int [] nums ={0,1,1,0,1,2,1,2,0,0,0};

        System.out.println("Before sorting:");

        System.out.println(Arrays.toString(nums));

        Dutch_national_flag_Algorithm sortalgo = new Dutch_national_flag_Algorithm();

        int[] result = sortalgo.sort_0s1sand2s(nums);

        System.out.println("After sorting:");

        System.out.println(Arrays.toString(result));

    }
}