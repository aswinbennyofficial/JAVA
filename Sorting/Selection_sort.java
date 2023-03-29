class Selection_sort{
    public static void main(String[] args) {
        int arr[]={5,6,3,4,7,1,-5,6};

        int i,j,min_ind=0;
        for(i=0;i<arr.length-1;i++){
            min_ind=i;
            for(j=i;j< arr.length;j++){
                if(arr[min_ind]>arr[j]){
                    min_ind=j;
                }
            }
            if(arr[i]!=arr[min_ind]) {
                arr[i] = arr[i] ^ arr[min_ind];
                arr[min_ind] = arr[i] ^ arr[min_ind];
                arr[i] = arr[i] ^ arr[min_ind];
            }
        }
        for (i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
