class Prog{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int[] temp=new int[16];
        int i;
        for (i=0;i< arr.length;i++){
            temp[i]=arr[i];
        }
        temp[i+1]=99;
        arr=temp;

        for (i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
