import java.util.*;
class Prime_Arraylist{
    public static void main(String[] args) {
    ArrayList<Integer> A=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
       int i,j,isPrime,N;
       N=sc.nextInt();
       for(i=1;i<=N;i++){
           A.add(sc.nextInt());
       }
        System.out.println("inserted array list: "+A);

        for(i=A.size()-1;i>=0;i--){
            isPrime=1;
            for(j=2;j<=A.get(i)/2;j++){
                if(A.get(i)%j==0 ){
                    isPrime=0;
                    break;
                }
            }
            if(isPrime==0 || A.get(i)==1 || A.get(i)==0){
                A.remove(i);
            }
        }

        System.out.println("output arraylist: "+A);
    }
}


