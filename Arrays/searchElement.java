public class searchElement 
{
 public static void main(String[] args) 
 {
       int[] arr = {-10,-5,0,5,10};
       
       int search = 0;
       boolean flag = false;

       for(int i =0;i<arr.length;i++)
       {
            if(arr[i]==search)
            {
                flag = true;
                System.out.println("Element found");
                System.out.println("Index: "+ i);
                break;
            }
       }

       if(!flag)
       {
            System.out.println("Element not found");
       }
 }   
}
