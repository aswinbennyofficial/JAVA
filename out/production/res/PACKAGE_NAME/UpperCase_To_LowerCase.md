### V1

```java
class UpperCase_To_LowerCase{
    public static void main(String[] args) {
        String str="WeLCome To JAVA",newstr="";
        int i;
        for(i=0;i<str.length();i++){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){
                newstr+=(char)(str.charAt(i)+32);
            }
            else{
                newstr+=str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}

```


###V2
```java
class UpperCase_To_LowerCase{
    public static void main(String[] args) {
        String str="WeLCome To JAVA",newstr="";
        int i;
        for(i=0;i<str.length();i++){
            if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                newstr+=(char)(str.charAt(i)+('a'-'A'));
            }
            else{
                newstr+=str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}

```
