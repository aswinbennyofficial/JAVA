class Main{

   public static boolean isVowel(char arr[],int n){
        char vow[] = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        int i,flag=0;
        for(i=0;i< vow.length;i++){
            if(arr[n]==vow[i]){
                flag=1;
                break;
            }
        }

        if (flag==1){
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        String str = "Welcome To JAVA";
        char arr[]=str.toCharArray(),temp;
        int left=0,right=arr.length-1,i;
        while(left<right){
            while(left<right && isVowel(arr,left)==false){
                left++;
            }
            while(left<right && isVowel(arr,right)==false){
                right--;
            }

            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        str="";
        for(i=0;i<arr.length;i++){
            str+=arr[i];
        }

        System.out.println(str);
    }
}
