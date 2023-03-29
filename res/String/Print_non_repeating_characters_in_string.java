public class Print_non_repeating_characters_in_string {
    public static void main(String[] args) {
        String str="aabbbcddfeeeg";
        char[] arr=str.toCharArray();
        str="";
        int i;

        for(i=0;i< arr.length;i++){
            if (i< arr.length-1 && arr[i]==arr[i+1]){
                continue;
            }
            else if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            else{
                str+=arr[i];
            }


        }

        System.out.println(str);
    }

}
