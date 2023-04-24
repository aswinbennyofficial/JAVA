public class Number_of_zeros {
    public static int numberOfZeros(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            c++;
        }
        return numberOfZeros(n/10,c);
    }

    public static void main(String[] args){
        int z=numberOfZeros(20305060,0);
        System.out.println(z);
    }
}
