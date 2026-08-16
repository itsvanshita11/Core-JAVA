import java.util.*;

public class reverseNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int rev = 0;

        while(num>0)
        {
            int ld = num % 10;
            rev = rev*10 + ld;
            num = num / 10;   
        }

        System.out.println("Reversed Num: " + rev);
    }    
}
