import java.util.*;
class Main{
    public static void main(String args[]){
        int i,s=0;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];

        for(i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        for(i=0;i<arr.length;i++){
            s+=arr[i];
        }
        System.out.println(s);
    }
}
