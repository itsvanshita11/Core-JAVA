class forEach
{
    public static void main(String args[])
    {

        int arr[] = new int[4];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = (int)(Math.random()*100);
        }

        for(int n : arr)
        {
            System.out.print(n+" ");
        }
    }
}