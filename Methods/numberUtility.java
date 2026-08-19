public class numberUtility {
    public boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        return false;
    }

    public boolean isOdd(int num)
    {
        if(num%2!=0)
        {
            return true;
        }
        return false;
    }

    public boolean isPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
        if(num==2)
        {
            return true;
        }

        else{
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean isPalindrome(int num)
    {
        int rev = 0;
        int n = num;

        while(num>0)
        {
            int ld = num%10;
            rev = rev*10 + ld;
            num = num/10;
        }

        if(rev==n)
        {
            return true;
        }
        return false;
    }


    public static void main(String args[])
    {

        numberUtility obj = new numberUtility();

        System.out.println("12 is even: " + obj.isEven(12));
        System.out.println("12 is odd: " + obj.isOdd(12));
        System.out.println("13 is prime: "+ obj.isPrime(13));
        System.out.println("121 is palindrome: "+obj.isPalindrome(121));
    }    
}
