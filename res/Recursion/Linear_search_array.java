public class Linear_search_array {

    static int searcher(int[] arr,int i,int target){
        if(i==arr.length){
            return 0;
        }
        if(arr[i]==target){
            return 1;
        }

        return searcher(arr,i+1,target);
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,3,6,18,9,7};
        int target=10;

        int z=searcher(arr,0,target);
        if(z==1){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
