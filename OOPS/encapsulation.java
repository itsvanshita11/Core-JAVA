class Details
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}

public class encapsulation
{
    public static void main(String args[])
    {

        Details d = new Details();

        d.setAge(21);
        d.setName("Vanshita");

        System.out.println(d.getName() + ":" + d.getAge());
    }

}