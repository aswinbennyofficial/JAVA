class Main{
    public static void num(int arr[],int n){

        if (n==-1){
            return;
        }
         num(arr,n-1);
        System.out.print(arr[n]+" ");
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        num(arr,arr.length-1);
    }
}
