interface Printable
{
    void print();
}

interface Scannable
{
    void scan();
}

class Printer implements Printable,Scannable
{
    public void print()
    {
        System.out.println("Printer is printing...");
    }

    public void scan()
    {
        System.out.println("Scanner is scanning...");
    }
}

public class multipleInterfaces {
    public static void main(String[] args) {
        Printer p = new Printer();

        p.print();
        p.scan();
    }
}
