class Main{
    public static void num(int arr[],int n,int i){
        if (i==arr.length){
            System.out.println("Not found");
            return;
        }
        else if(arr[i]==n){
            System.out.println(i);
            return;
        }
         num(arr,n,i+1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
       int n=8;
        num(arr, n,0);
    }
}

/*
or

class Main{
    public static int num(int arr[],int n,int i){
        if (i==arr.length){
            //System.out.println("Not found");
            return -1;
        }
        else if(arr[i]==n){
           // System.out.println(i);
            return i;
        }
         return num(arr,n,i+1);
        //return i;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
       int n=10;
        System.out.println(num(arr, n,0));
    }
}



*/
