import java.util.*;
class Maximum_in_array{
    public static void main(String args[]){
        int i;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];

        for(i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],index=0;
        for(i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
