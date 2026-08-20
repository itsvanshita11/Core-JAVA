class University
{
    String universityName;

    class Department 
    {
        String departmentName;
        String HOD;

        public void displayDetails()
        {
            System.out.println("University Name: " + universityName);
            System.out.println("Department: "+departmentName);
            System.out.println("HOD: "+HOD);
        }
    }
}

public class innerClasses {
    public static void main(String args[])
    {
        University uni = new University();
        University.Department dept = uni.new Department();

        uni.universityName = "KIET deemed to be University";
        dept.departmentName = "Computer Science and Engineering";
        dept.HOD = "Dr. Vineet Kumar Sharma";

        dept.displayDetails();
        
    }
}
