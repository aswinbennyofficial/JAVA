import java.util.*;
class Main{

    public static int recursiveFxn(int n){
       if (n==1){
           return 1;
       }


       return (n+recursiveFxn(n-1));
    }

    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();

        System.out.println(recursiveFxn(n));
    }

}
