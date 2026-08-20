public class tryCatch {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 2;

        try
        {
            int c = a/b;
            int d = 10/0;
            System.out.println(c);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero " + e);
        }


        
    }    
}
