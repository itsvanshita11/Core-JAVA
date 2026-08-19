class Methods
{
    public int add(int x,int y)
    {
        return x+y;
    }

    public int subtract(int x,int y)
    {
        return x-y;
    }

    public int multiply(int x,int y)
    {
        return x*y;
    }

    public int divide(int x,int y)
    {
        return x/y;
    }

}

public class createMethods {
    public static void main(String[] args) {
        
        Methods m = new Methods();

        System.out.println("Addition: " + m.add(14,13));
        System.out.println("Subtraction: "+m.subtract(12, 10));
        System.out.println("Multiplication: " + m.multiply(12, 9));
        System.out.println("Divide: "+m.divide(54, 27));
    }    
}
