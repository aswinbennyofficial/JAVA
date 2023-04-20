public class Sum_of_digits {
    static int recurse(int n){
        if(n==0) {
            return 0;
        }
//        System.out.print(n+" ");
        return n%10 +recurse(n/10);

    }

    public static void main(String args[]){
        // Print_1_to_n ob=new Print_1_to_n();
        System.out.println(recurse(1742));
    }
}
