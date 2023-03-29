![image](https://user-images.githubusercontent.com/110408942/219432085-d95ca804-4f5c-44d5-9613-d96f65a6263e.png)

```java

import java.util.*;
class Steps_permutation_using_recursion{

    public static int recursiveFxn(int n){
       if (n==0){
           return 1;
       }
       if (n<0){
           return 0;
       }

       return (recursiveFxn(n-1)+recursiveFxn(n-2));
    }

    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();

        System.out.println(recursiveFxn(n));
    }

}

```
