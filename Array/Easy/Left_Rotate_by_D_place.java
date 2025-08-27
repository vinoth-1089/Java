package Easy;


import java.util.*;

class Main{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter the Place for Rotate the Array:");
        int K=input.nextInt();
        int[] array={1,2,3,4,5};
        System.out.println("Before Rotate: \n");
        System.out.println(array);
        K=K%array.length;
        int[] rotated=new int[array.length];
       System.arraycopy(array,array.length-K,rotated,0,K);
       System.arraycopy(array,0,rotated,K,array.length-K);
       System.out.println(Arrays.toString(rotated)); 


        input.close();
    }
   
}