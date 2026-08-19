import java.util.*;

public class frequencyOfElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = {10,20,10,30,10,40};
        int count = 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                count++;
            }
        }

        System.out.println(num+" occurs " + count + " times");
    }
}
