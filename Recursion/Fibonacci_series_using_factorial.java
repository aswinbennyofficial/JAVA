import java.util.*;
class Fibonacci_series_using_factorial{

    public static int recursiveFxn(int n){
        if (n==1){

             return 0;
        }
        if (n==0){

            return 1;
        }

       return (recursiveFxn(n-1) + recursiveFxn(n-2));


    }

    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();

        System.out.println(recursiveFxn(n));
    }

}
