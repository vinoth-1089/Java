package Easy;


public class Second_smallest_element {

    public static void Solution(int array[],int len){
        int Second_smallest=Integer.MAX_VALUE;
        int small=array[0];

        for(int i=1;i<len;i++)
        {
            if(array[i]<small)
            {  
                Second_smallest=small;
                small=array[i];
                
            }
            else if(array[i] != small && Second_smallest > array[i])
            {
                Second_smallest=array[i];
            }
        }
        System.out.println("The Smallest Element is "+small);
        System.out.println("The Second Smallest Element is "+Second_smallest);
        
    }
    public static void main(String[] args)
    {
       int [] array={5,2,3,7,1};
       int len = array.length;

       Solution(array,len);

    }
}

