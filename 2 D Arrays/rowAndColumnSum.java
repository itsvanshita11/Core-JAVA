
public class rowAndColumnSum {

    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        // row-sum
        for(int i=0;i<arr.length;i++)
        {
            int rowSum=0;
            for(int j=0;j<arr[0].length;j++)
            {
                rowSum += arr[i][j];

                
            }
            System.out.println("Row "+ (i+1) +" sum = "+rowSum);
        }

        // column-sum
        for(int j=0;j<arr[0].length;j++)
        {
            int colSum=0;

            for(int i=0;i<arr.length;i++)
            {
                colSum += arr[i][j];
            }

            System.out.println("Column "+j+" sum = "+colSum);
        }


    }
}
