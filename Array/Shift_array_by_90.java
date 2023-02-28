// shift by 90=transpose matrix then reverse its row 
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i,j;
        int arr[][]={{1,2,3,4},{5,3,7,8},{9,10,11,12},{13,14,15,16}};


// transpose matrix
        for (i=0;i<arr.length;i++){
            for (j=0;j<i;j++){ //only traversing lower triangular matrix
                if(arr[j][i]!=arr[i][j]){
                    arr[i][j]=arr[i][j]^arr[j][i];
                    arr[j][i]=arr[i][j]^arr[j][i];
                    arr[i][j]=arr[i][j]^arr[j][i];
                }
            }

        }

//reverse row      
        int l= arr.length;
        for(i=0;i< arr.length;i++){
            for(j=0;j<arr[0].length/2;j++){
                if(arr[i][j]!=arr[i][l-j-1]) {
                    arr[i][j] = arr[i][l - j - 1] ^ arr[i][j];
                    arr[i][l - j - 1] = arr[i][l - j - 1] ^ arr[i][j];
                    arr[i][j] = arr[i][l - j - 1] ^ arr[i][j];
                }
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
