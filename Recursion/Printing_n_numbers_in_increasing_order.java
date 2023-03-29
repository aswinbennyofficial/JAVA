class Printing_n_numbers_in_increasing_order{
    public static void num(int n){

        if (n==0){
            return;
        }
         num(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=9;
        num(n);
    }
}
