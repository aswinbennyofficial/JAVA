
### By using a new array

```java
import java.util.*;
//import java.math.*;
class Main{
    public static void main(String args[]){
        int arr[]={1,2,3,-4,5,6,-7};
        int rev_arr[]=new int[arr.length];
        int i;
        for(i=0;i<arr.length;i++){
            rev_arr[i]=arr[arr.length-1-i];
        }

        for(i=0;i< arr.length;i++){
            System.out.print(" "+rev_arr[i]);
        }
    }
}
```
