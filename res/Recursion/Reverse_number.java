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

        public static void recurse2(int n){
            int no_digit=(int)(Math.log10(n))+1;

            //no_digit=6;
            System.out.print(rev(n,no_digit));
        }
        private static int rev(int n,int dig){
            if(n%10==n){
                return n;
            }

            return (int)(n%10*Math.pow(10,dig-1)+rev(n/10,dig-1));
        }

        public static void main(String args[]){
            recurse2(170965);
            //recurse(184305);
            //System.out.println(rev);
        }
}

