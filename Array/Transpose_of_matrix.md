### If Not Square Matrix

```java 
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i,j;
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int arrcpy[][]=new int[arr[0].length][arr.length];



        for (i=0;i<arr.length;i++){
            for (j=0;j<arr[0].length;j++){
                arrcpy[j][i]=arr[i][j];
            }
            System.out.println();
        }

        for (i=0;i<arrcpy.length;i++){
            for (j=0;j<arrcpy[0].length;j++){
                System.out.print(arrcpy[i][j]+" ");
            }
            System.out.println();
        }

    }
}
```

### If Square Matrix

```java
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i,j;
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};



        for (i=0;i<arr.length;i++){
            for (j=0;j<arr[0].length;j++){
                if(arr[j][i]!=arr[i][j] && (i<j) ){
                    arr[i][j]=arr[i][j]^arr[j][i];
                    arr[j][i]=arr[i][j]^arr[j][i];
                    arr[i][j]=arr[i][j]^arr[j][i];
                }
            }
            System.out.println();
        }

        for (i=0;i<arr.length;i++){
            for (j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

```
