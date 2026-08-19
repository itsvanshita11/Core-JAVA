class details
{
    int id;
    String name;
    int salary;

    public details(int id,String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}



public class Employee
{
    public static void main(String args[])
    {
        details d1 = new details(101,"Rahul",45000);
        details d2 = new details(102,"Priya",52000);

        System.out.println("Employee-id: "+d1.id);
        System.out.println("Name: "+d1.name);
        System.out.println("Salary: "+d1.salary);

        System.out.println();

        System.out.println("Employee-id: "+d2.id);
        System.out.println("Name: "+d2.name);
        System.out.println("Salary: "+d2.salary);

        
    }
}