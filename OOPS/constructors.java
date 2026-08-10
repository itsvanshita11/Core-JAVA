

class Student
{
    private String name;
    private int rollNo;

    public Student()
    {
        this.name = "Vanshita";
        this.rollNo = 55;
    }

    // para-meterized constructor

    public Student(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getrollNo()
    {
        return rollNo;
    }

    public void setrollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }
}

public class constructors 
{
    public static void main(String args[])
    {

        Student s = new Student();
        Student s1 = new Student("Vivek",56);

        // s.setName("Gaurav");
        // s.setrollNo(37);
        System.out.println(s.getName() + ":" +s.getrollNo());
        System.out.println(s1.getName() + ":" +s1.getrollNo());

    }
    

}
