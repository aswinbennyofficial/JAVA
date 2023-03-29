

class Minimum_in_an_array{

    static int operation(int arr[]){
        int min=arr[0],i;

        for(i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int arr[]={-1,1,2,3,4,5,6,7};
        int i;

        System.out.println(operation(arr));

    }
}
