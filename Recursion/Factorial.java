class Main{
    public static int num(int n){
        if (n==0){
            //System.out.println("Not found");
            return 1;
        }
         return n*num(n-1);

    }
    public static void main(String[] args) {

       int n=5;
        System.out.println(num(n));
    }
}
