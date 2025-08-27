package Easy;


public class Array_is_Sorted_Not {
    

    public static boolean Solution(int array[],int len)
    {
        for(int i=1;i<len;i++)
        {
            if(array[i]>array[i-1])
            {
                
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int [] array = {1,2,3};
        int len= array.length;

       boolean result= Solution(array,len);
       System.out.println(result ?"The array is Sorted":"Array is not sorted");
    }
}
