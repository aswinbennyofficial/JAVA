import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rl=sc.nextInt();
        int cl= sc.nextInt();
        int i,j;
        int arr[][]=new int[rl][cl] ;

        for (i=0;i<rl;i++){
            for (j=0;j<cl;j++){
            arr[i][j]=sc.nextInt();
            }
        }

        for (i=0;i<arr.length;i++){
            for (j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
