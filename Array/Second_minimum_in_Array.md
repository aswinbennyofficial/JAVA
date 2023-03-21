

V1  
```java



class Prog{

    static int operation(int arr[]){
        int min=arr[0],minx=Integer.MAX_VALUE,i;

        for(i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        for(i=0;i<arr.length;i++){
            if(arr[i]!=min && arr[i]<minx){
                minx=arr[i];
            }
        }

        return minx;
    }

    public static void main(String[] args) {
        int arr[]={-32,-22,-1,1,2,3,4,5,6,7,-15,-22};
        int i;

        System.out.println(operation(arr));

    }
}

```
