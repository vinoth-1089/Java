package Medium;
import java.util.*;

public class Supirior_Elment {
    public static void main(String[] args)
    {
        int[] array={1, 2, 3, 2};
        List <Integer> leaders = findleaders(array);
        System.out.println("Leaders are :"+leaders);
    }

    public static List<Integer> findleaders(int[] array)
    {
        List<Integer> result = new ArrayList<>();

        int n=array.length;
        int maxRight=array[n-1];
        result.add(maxRight);

        for(int i=n-2;i>=0;i--)
        {
            if(maxRight<array[i])
            {
                result.add(array[i]);
                maxRight=array[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}
