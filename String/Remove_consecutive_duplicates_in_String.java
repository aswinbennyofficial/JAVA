public class Prog {
    public static void main(String[] args) {
        String str="aaabbcddfeeg";
        char[] arr=str.toCharArray();
        str="";
        int i;

        for (i=0;i<arr.length;i++){
            while(i< arr.length-1&& arr[i]==arr[i+1]){
                i++;
            }
            str+=arr[i];
        }
        System.out.println(str);
    }

}
