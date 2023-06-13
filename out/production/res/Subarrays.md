
```java
class Subarrays{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,9};
        int si,ei,i;
        for(si=0;si<arr.length;si++){
            for(ei=si;ei<arr.length;ei++) {
                for (i = si; i <= ei; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("");
            }

        }
    }
}

```





```java
class Main{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,9};
        int si,ei,i;
        for(si=0;si<arr.length;si++){
            for(i=0;i<arr.length-si;i++) {
                for (ei = si; ei < arr.length-i; ei++) {
                    System.out.print(arr[ei] + " ");
                }
                System.out.println("");
            }

        }
    }
}
```

