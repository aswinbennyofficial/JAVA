
### V1
```java
// finds only one missing number per gap between 1 to n
class Missing_number_in_Array{
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
// finds all missing numbers between minimum and maximum in array
import java.util.Arrays;

class Missing_number_in_Array{


    public static void main(String[] args) {
        int i,count;
       int[] arr={11,3,2,8,6,5};
        Arrays.sort(arr);

        for(i=0;i<arr.length-1;i++){
            count=arr[i]+1;
            while(count!=arr[i+1]){
                if(count>arr[arr.length-1]){
                    break;
                }
                System.out.println(count);
                count++;
            }
        }


    }
}

```
---

### v3
```java
// finds all missing elements from 1 to n
import java.util.Arrays;

class Missing_number_in_Array{
    public static void main(String[] args) {
        int i;
       int[] arr={11,3,2,8,6,5,20};
        Arrays.sort(arr);
        int[] chk=new int[arr[arr.length-1]+1];

        for (i=0;i<arr.length;i++){
            chk[arr[i]]=1;
        }

        for (i=1;i<chk.length;i++){
            if(chk[i]==0){
                System.out.print(i+" ");
            }
        }

    }
}
```
