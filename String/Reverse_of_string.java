class Main{
    public static void main(String[] args) {
        String str="Welcome to Java";
        char arr[]=str.toCharArray();
        int i;
        str="";
        for(i=arr.length-1;i>=0;i--){
            str+=arr[i];
        }
        System.out.println(str);
    }
}
