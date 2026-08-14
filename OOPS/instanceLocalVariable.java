class Student
{
    String name;
    int rollNo;
    double marks;

    public String displayDetails()
    {
        String grade;

        if(marks>=90)
        {
            grade = "A";
        }

        else if(marks>=75 && marks<90)
        {
            grade = "B";
        }

        else if(marks>=60 && marks<75)
        {
            grade = "C";
        }

        else
        {
            grade = "D";
        }
    
    return grade;

    }
}

public class instanceLocalVariable 
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Vanshita";
        s1.rollNo = 101;
        s1.marks = 92.0;
        
        s2.name = "Rahul";
        s2.rollNo = 102;
        s2.marks = 68.0;

        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Marks: " + s1.marks);
        System.out.println("Grade: " + s1.displayDetails());

        System.out.println();
        
        System.out.println("Name: " + s2.name);
        System.out.println("Roll No: " + s2.rollNo);
        System.out.println("Marks: " + s2.marks);
        System.out.println("Grade: " + s2.displayDetails());

    }    
}
