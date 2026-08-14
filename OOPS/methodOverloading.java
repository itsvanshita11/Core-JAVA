class Calculator
{
    public int calculate(int a, int b)
    {
        return a+b;
    }

    public double calculate(double a, double b)
    {
        return a+b;
    }

    public int calculate(int a, int b, int c)
    {
        return a+b+c;
    }

    public String calculate(String a, String b)
    {
        return a + " " + b;
    }
}



public class methodOverloading
{
    public static void main(String[] args)
    {
        Calculator c = new Calculator();

        System.out.println(c.calculate(10, 20));
        System.out.println(c.calculate(5.5,10.0));
        System.out.println(c.calculate(10,20,30));

        System.out.println(c.calculate("Hello", "Java"));
    }
}