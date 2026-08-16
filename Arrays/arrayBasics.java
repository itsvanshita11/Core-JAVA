import java.util.*;

public class arrayBasics
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] arr = new int[num];
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        // 1. print all elements

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // 2. sum
        int sum = 0;

        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);

        // 3. average

        double avg = (double)sum / n;
        System.out.println("Average: " + avg);

        // 4. maximum and minimum in array

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>maximum)
            {
                maximum = arr[i];
            }

            if(arr[i]<minimum)
            {
                minimum = arr[i];
            }
        }

        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

    }

}