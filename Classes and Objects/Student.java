public class Student {
    String name;
    int rollNo;
    int marks;

    public void displayDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks: "+marks);
    }

    public static void main(String[] args) {
        Student st = new Student();

        st.name = "Vanshita";
        st.rollNo = 55;
        st.marks = 96;

        st.displayDetails();
    }
}
