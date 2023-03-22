
### V1
```java
class Prog{
    public static void main(String[] args) {
       int[] arr={1,4,3,2,8,6,5,9};
       int[] chk=new int[arr.length];
       int i;
       for(i=0;i<arr.length;i++){
           if(arr[i]<=arr.length && arr[i]>0){
               chk[arr[i]-1]=1;
           }
       }

       for(i=0;i<arr.length;i++){
           if(chk[i]==0){
               System.out.print((i+1)+" ");
           }
       }
    }
}
```
---

### V2

```java
import java.util.Arrays;

class Prog{
    public static void main(String[] args) {
        int i,count;
       int[] arr={1,3,2,8,6,5,11};
        Arrays.sort(arr);

        for(i=0;i<arr.length-1;i++){
            count=arr[i]+1;
            while(count!=arr[i+1]){
                System.out.println(count);
                count++;
            }
        }


    }
}

```
