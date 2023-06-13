public class Pattern_triangle {
//    static void triangle(int r,int c,int f){
//        if(r==f){
//            return;
//        }
//        if(c<=r){
//            System.out.print("* ");
//            triangle(r,c+1,f);
//        }
//        else{
//            System.out.println();
//            triangle(r+1,0,f);
//
//
//        }
//
//    }

    static void triangle(int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            triangle(r,c+1);
            System.out.print("* ");

        }
        else{
            triangle(r-1,0);
            System.out.println();

        }
    }
    public static void main(String[] args) {
        triangle(4,0);
    }
}
