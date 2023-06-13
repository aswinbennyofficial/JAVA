
### V1

```java

class Move_zero_to_end_of_Array{

    static void operation(int arr[]){
        int i,ind;
        for(i=0;i<=arr.length/2;i++){
            ind=arr.length-1;
            if(arr[i]==0){
                while(arr[ind]==0){
                    ind--;
                }
                arr[i]=arr[ind];
                arr[ind]=0;
            }
        }

        for(i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    public static void main(String[] args) {
        int arr[]={0,-22,-1,1,2,3,0,5,6,7,0,-15,-22,0};

        operation(arr);

    }
}


```
---

### V2

```java

class Move_zero_to_end_of_Array{

    static void operation(int arr[]){
        int i,count=0;
        
        //setting all non zeros to forward
        for(i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        
        // filling remaining count with zero
        while(count< arr.length){
            arr[count++]=0;
        }

        for(i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    public static void main(String[] args) {
        int arr[]={0,-22,-1,1,2,3,0,5,6,7,0,-15,-22,0};

        operation(arr);

    }
}


```
