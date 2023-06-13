public class Array_sorted_or_not {

    private static int helper(int arr[],int i){
        if(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                return 0;
                }
        }
        if(i==arr.length){
            return 1;
        }
        return helper(arr,i+1);
    }
    public static void isSorted(int arr[]){
        int z=helper(arr,0);
        if(z==0){
            System.out.println("not sorted");
        }
        else{
            System.out.println("sorted");
        }
    }
    public static void main(String[] args) {

        int arr[]={1,2,4,7,12,8,10};
        isSorted(arr);
    }
}
