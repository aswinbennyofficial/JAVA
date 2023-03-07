class Main{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,-1,-2};
        int i,count=0,indx=0;
        for(i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }

        int evearr[]=new int[count];

        for(i=0;i< arr.length;i++){
            if(arr[i]%2!=0){
                evearr[indx]=arr[i];
                indx++;
            }
        }
        for(i=0;i<evearr.length;i++) {
            System.out.print(evearr[i]+" ");
        }
    }
}
