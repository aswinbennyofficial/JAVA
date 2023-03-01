class Main{
    public static void main(String[] args) {
        String str="Welcome to JAVA",newstr="";
        char vow[]={'A','E','I','O','U','a','e','i','o','u'};
        int i,j,flag;
        for(i=0;i<str.length();i++){
            flag=1;
            for(j=0;j<vow.length;j++){
                if(str.charAt(i)==vow[j]){
                    flag=0;
                    break;
                }
            }

            if(flag==1){
                newstr+=str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}
