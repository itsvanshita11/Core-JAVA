interface Payment
{
    void pay();
}

class UPI implements Payment
{
    public void pay()
    {
        System.out.println("Paid through UPI...");
    }
}

class Card implements Payment
{
    public void pay()
    {
        System.out.println("Paid through card...");
    }
}

class Cash implements Payment
{
    public void pay()
    {
        System.out.println("Paid through cash...");
    }
}

public class Interfaces {
    public static void main(String[] args)
    {
        Payment p1 = new UPI();
        Payment p2 = new Card();
        Payment p3 = new Cash();

        p1.pay();
        p2.pay();
        p3.pay();
    }
}
