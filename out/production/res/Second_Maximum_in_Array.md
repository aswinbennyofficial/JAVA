
###V1
```java

class Second_Maximum_in_Array{

    static int operation(int arr[]){
        int max=Integer.MIN_VALUE,maxx=Integer.MIN_VALUE,i;

        for(i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>maxx){
                maxx=arr[i];
            }
        }

        return maxx;
    }

    public static void main(String[] args) {
        int arr[]={-32,-22,-1,1,2,3,4,5,6,7,-15,-22};
        int i;

        System.out.println(operation(arr));

    }
}


```
