class Employee
{
    String name;
    int salary;

    public void displayEmployee()
    {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee
{
    String department;

    public void displayManager()
    {
        System.out.println("Department: "+department);
    }
}


public class empHierarchy {
    public static void main(String[] args) {
        
        Manager mng = new Manager();

        mng.name = "Ananya Sharma";
        mng.salary = 75000;
        mng.department = "Software Development";

        mng.displayEmployee();
        mng.displayManager();
    }
}
