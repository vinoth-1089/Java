package BinarySearch;

public class Book_Allocation {
   

    public static int findStudents(int[]books,int max_pages)
    {
        int pages =0;
        int students=1;

        for(int page:books)
        {
            if( pages+page > max_pages)
            {
                students+=1;
                pages=page;
            }
            else{
                pages+=page;
            }
        }
        return students;

    } 
    public static void main(String[] args)
    {
        int [] books ={12, 34, 67, 90};
        int student =2;

        if (student>books.length){
            System.out.println("-1");
        } 

        int low=books[0];
        for(int i:books)
        {
            low=Math.max(low,i);
        }
        int high=books[0];
         for(int i:books)
        {
            high+=i;
        }
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if (findStudents(books,mid)<=student)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
          System.out.println(ans);
    }
  
}
