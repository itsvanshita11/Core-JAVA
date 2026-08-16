import java.util.*;

public class palindromeNum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int n = num;
        int rev = 0;

        while(num>0)
        {
            int ld = num % 10;
            rev = rev*10 + ld;
            num = num / 10;   
        }

        if(n == rev)
        {
            System.out.println(n + " is palindrome number");
        }

        else
        {
            System.out.println(n + " is not palindrome");
        }
    }    
}
