import java.util.*;
class Remove_even_in_arraylist{
    public static void main(String[] args) {
    ArrayList<Integer> t1=new ArrayList<>();
       Scanner sc=new Scanner(System.in);
       int i;
       for(i=0;i<=6;i++){
           t1.add(sc.nextInt());
       }
        System.out.println("inserted array list: "+t1);

       for(i=t1.size()-1;i>=0;i--){
           if(t1.get(i)%2==0){
               t1.remove(i);
           }
       }
        System.out.println("output arraylist: "+t1);
    }
}
