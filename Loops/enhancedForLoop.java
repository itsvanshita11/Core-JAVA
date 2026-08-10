class Student
{
    int rollno;
    String name;
    int marks;
}

class enhancedForLoop
{
   public static void main(String[] args) 
   {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Arjun";
        s1.marks = 65;


        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Bani";
        s2.marks = 98;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Chhavi";
        s3.marks = 90;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Normal-for loop iteration

        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].name + ":" + students[i].marks);
        // }


        // Using for-each loop

        for(Student st: students)
        {
            System.out.println(st.name + ":" + st.marks);
        }


        
   } 
}