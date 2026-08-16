import java.util.*;

public class electricityBill 
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            int units = sc.nextInt();
            int totalBill = 1;

            if(units>=0 && units<=100)
            {
                totalBill = units * 5;
            }

            else if(units>=101 && units<=200)
            {
                totalBill = units * 7;
            }

            else if(units>=201 && units<=300)
            {
                totalBill = units * 10;
            }

            else
            {
                totalBill = units * 15;
            }

            System.out.println("Total Bill: " + totalBill);
        }
}
