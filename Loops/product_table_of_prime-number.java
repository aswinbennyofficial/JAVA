import java.util.*;
class Main{
    public static void main(String args[]){
        int s,e,i,j,factCount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        s=sc.nextInt();
        System.out.println("Enter the ending number: ");
        e=sc.nextInt();

        for (i=s;i<=e;i++){
            factCount=0;
            for(j=1;j<=i/2;j++){
                if (i%j==0){
                    factCount++;
                }
            }

            if(factCount<2 && (i!=1 && i!=0) ){
                for(j=1;j<=10;j++){
                    System.out.format("%d X %d = %d\n",i,j,j*i);
                }
                System.out.println();
            }

        }
    }
}
