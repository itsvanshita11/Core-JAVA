class demo
{
    String name;
    int marks;

    public void displayInfo()
    {
        char grade = 'C';
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade);
    }
}

public class instanceLocalVariable {
    public static void main(String args[])
    {
        demo d = new demo();

        d.name = "Gauri";
        d.marks = 99;
        
        d.displayInfo();
    }
}
