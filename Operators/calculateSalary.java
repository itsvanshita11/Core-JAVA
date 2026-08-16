import java.util.*;

public class calculateSalary 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Basic Salary: ");
        int basic = sc.nextInt();

        System.out.println("HRA: ");
        int HRA = sc.nextInt();

        System.out.println("DA: ");
        int DA = sc.nextInt();

        int grossSalary = basic + HRA + DA;
        int annualSalary = grossSalary * 12;


        System.out.println("Gross Salary: " + grossSalary);

        System.out.println("Annual Salary: " + annualSalary);

       




    }    
}
