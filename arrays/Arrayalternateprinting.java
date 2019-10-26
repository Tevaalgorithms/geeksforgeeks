class GfG
{
    public static void print(int arr[], int n)
    {
    
        if( arr == null || n <= 0) {
            return;
        } 
        
        for(int i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
