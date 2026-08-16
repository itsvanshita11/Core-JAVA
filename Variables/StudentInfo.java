import java.util.Scanner;

public class StudentInfo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        int rollNo = sc.nextInt();

        double maths = sc.nextDouble();
        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();

        double percentage = (maths + physics + chemistry)/3;

        System.out.println("Name: "+ name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: "+rollNo);

        System.out.println("Percentage: "+percentage);





    }
}