import java.util.*;
class Main{

    public static int recursiveFxn(int n){
        if (n==0){

             return 1;
        }
        System.out.println(n);
       return recursiveFxn(n-1);


    }

    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();

        recursiveFxn(n);
    }

}
