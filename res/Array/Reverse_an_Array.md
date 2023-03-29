
### By using a new array

```java
import java.util.*;
//import java.math.*;
class Reverse_an_Array{
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


### Using swapping

#### 1. Swapping using binaries

```java
import java.util.*;

class Reverse_an_Array{
    public static void main(String args[]){
        int arr[]={1,2,-0,-8,-3,-4,-7,9};
        //int rev_arr[]=new int[arr.length];
        int i;
        int l= arr.length;
        for(i=0;i<(l-1-i);i++){
            if(arr[i]!= arr[l-1-i]) {
//                System.out.println(arr[i]);
//                System.out.println(arr[l-i-1]);
                arr[i] = arr[i] ^ arr[l - 1 - i];
                arr[l - 1 - i] = arr[i] ^ arr[l - 1 - i];
                arr[i] = arr[i] ^ arr[l - 1 - i];
            }
        }

        for(i=0;i<l;i++){
            System.out.print(" "+arr[i]);
        }
    }
}


```
