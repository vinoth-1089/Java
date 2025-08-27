package Easy;

public class Second_largest_element {
    public static void Solution(int array[],int len){
        int Second_largest=Integer.MIN_VALUE;
        int large=array[0];

        for(int i=1;i<len;i++)
        {
            if(array[i]>large)
            {  
                Second_largest=large;
                large=array[i];
                
            }
            else if(array[i] != large && Second_largest < array[i])
            {
                Second_largest=array[i];
            }
        }
        System.out.println("The Largest Element is "+large);
        System.out.println("The Second Largest Element is "+Second_largest);
        
    }
    public static void main(String[] args)
    {
       int [] array={5,2,3,7,1};
       int len = array.length;

       Solution(array,len);

    }
}
