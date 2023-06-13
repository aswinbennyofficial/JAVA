public class Number_of_digits_in_factorial {
    public static void main(String[] args) {
        int N=20,i;
        double dig=1;

        if (N==0){
            System.out.print("1");

        }
        else {
            for(i=1;i<=N;i++){
                dig+=Math.log10(i);
            }
        }

        System.out.print((int)(Math.floor(dig)+1));
    }
}
