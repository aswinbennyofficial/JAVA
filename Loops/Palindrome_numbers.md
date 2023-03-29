/*
Given an integer x, return true if x is a
palindrome, and false otherwise.
*/


```java

class Palindrome_numbers {
    public boolean isPalindrome(int x) {
        
        int y=x,rev=0;

        while(y>0){
            rev=rev*10+y%10;
            y/=10;
        }

        if(rev==x || x==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}

```





```java
class Palindrome_numbers {
    public boolean isPalindrome(int x) {
        boolean flag=true;
        int i;
        String str=Integer.toString(x);
        int l=str.length();
        if(x>=0){
            for(i=0;i<l/2;i++){
                if(str.charAt(i)!=str.charAt(l-1-i)){
                    flag=false;
                    break;
                }
            }
        }
        else{
            flag=false;
        }
        return flag;
    }
}

```

