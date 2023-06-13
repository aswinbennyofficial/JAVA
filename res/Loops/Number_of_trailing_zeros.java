public class Number_of_trailing_zeros {
    public static void main(String[] args) {
        int N=130,i,fivecount=0;
        for(i=1;i<=N;i++) {

            if (i % 5 == 0) {
                fivecount += counter(i);
            }

        }

            System.out.println(fivecount);

    }

    public static int counter(int i){
        int dig=0;
        while(i%5==0){
            dig++;
            i/=5;
        }
        return dig;
    }
}
