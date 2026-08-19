public class studentMarks {
public static void main(String[] args) {
    
    // Jagged-Arrays

    // int[][] arr = new int[3][];

    // arr[0] = new int[3];
    // arr[1] = new int[4];
    // arr[2] = new int[2];

    int[][] arr = {{54,67,89},{78,90,99,89},{56,87}};

    // Print marks
    for(int i=0;i<arr.length;i++)
    {
        int totalMarks=0;
        int avgMarks;
        for(int j=0;j<arr[i].length;j++)
        {
            totalMarks+=arr[i][j];
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

    // Print total marks
    for(int i=0;i<arr.length;i++)
    {
        int totalMarks=0;
        int avgMarks;
        
        for(int j=0;j<arr[i].length;j++)
        {
            totalMarks+=arr[i][j];
        }
        avgMarks = totalMarks/arr[i].length;
        System.out.println("Student " + i +" total makrs-> " + totalMarks);
        System.out.println("Student " + i +" average makrs-> " + avgMarks);
        System.out.println();
    }
    
    
    

        
        

    
}    
}
