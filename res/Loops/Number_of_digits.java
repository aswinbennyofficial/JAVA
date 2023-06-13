public class Number_of_digits {
    public static void main(String[] args) {
        int n=115,dig=0;

        while(n>0){
            n/=10;
            dig++;
        }
        System.out.print(dig);
    }
}
