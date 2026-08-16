import java.util.*;

public class studentGrade 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int marks = sc.nextInt();
        if(marks<0 || marks>100)
        {
            System.out.println("Invalid marks!");
        }

        else if(marks>=90)
        {
            System.out.println("A");
        }

        else if(marks>=75 && marks<90)
        {
            System.out.println("B");
        }

        else if(marks>=60 && marks<75)
        {
            System.out.println("C");
        }

        else if(marks>=40 && marks<60)
        {
            System.out.println("D");
        }

        else
        {
            System.out.println("F");
        } 
        
    }    
}
