package Recursion;

public class Reverse_number {
        static int rev=0;
        static void recurse(int n){
            if(n==0){
                return;
            }
            rev=rev*10+ n%10;
            recurse(n/10);

        }


        public static void main(String args[]){
            recurse(184305);
            System.out.println(rev);
        }
}

