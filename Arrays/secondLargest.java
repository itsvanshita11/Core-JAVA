class secondLargest {
    public static void main(String[] args){

        int arr[] = {12,35,1,34,1};
        // code here
        int largest = arr[0];
        int second_largest = -1;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                second_largest=largest;
                largest=arr[i];
            }
            
            else if(arr[i]>second_largest && arr[i]!=largest)
            {
                second_largest = arr[i];
            }
        }
        
        System.out.println("Second Largest: " + second_largest);
        
    }
}