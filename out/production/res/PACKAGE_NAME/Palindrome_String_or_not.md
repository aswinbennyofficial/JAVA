### V1

```java
class Palindrome_String_or_not{
    public static void main(String[] args) {
        String str="MADAM";
        str=str.toLowerCase();

        int chk=1,i=0;

        while(chk==1 && i<str.length()/2){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                chk=0;
                break;
            }
            i++;
        }

        if(chk==0){
            System.out.println("Not palindrome");
        }
        else{
            System.out.println("Palindrome");
        }

    }
}

```
