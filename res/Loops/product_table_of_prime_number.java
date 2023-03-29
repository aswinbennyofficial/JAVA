import java.util.*;
class product_table_of_prime_number{
    public static void main(String args[]){
        int s,e,i,j,isPrime=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        s=sc.nextInt();
        System.out.println("Enter the ending number: ");
        e=sc.nextInt();

        for (i=s;i<=e;i++){
            isPrime=1;
            for(j=2;j<=i/2;j++){
                if (i%j==0){
                    isPrime=0;
                    break;
                }
            }

            if(isPrime==1 && (i!=1 && i!=0) ){
                for(j=1;j<=10;j++){
                    System.out.format("%d X %d = %d\n",i,j,j*i);
                }
                System.out.println();
            }

        }
    }
}
