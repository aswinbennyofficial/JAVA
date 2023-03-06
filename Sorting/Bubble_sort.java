class Main{
    public static void main(String[] args) {
        int arr[]={1,5,1,-1,7,4,8,-5};
        int i,j;
        for(i=0;i< arr.length-1;i++){
            for(j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1] && arr[j]!=arr[j+1]){
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                }
            }
        }
        for(i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
