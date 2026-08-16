import java.util.*;

public class productBill 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String productName = sc.next();
        String productId = sc.next();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        double total = price * quantity;

        System.out.println("Product Name: " + productName);

        System.out.println("Proudct ID: " + productId);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Total Bill: " + total);


    }
}
