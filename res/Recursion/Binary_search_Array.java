public class Binary_search_Array {
        static int searcher(int[] arr,int target,int s,int e){
            int mid=(s+e)/2;

            if(arr[mid]==target){
                return 1;
            }
            if(mid<s){
                return 0;
            }

            if(arr[s]<=target && target<=arr[mid]){
                e=mid-1;
            }
            else if(arr[mid]<=target && target<=arr[e]){
                s=mid+1;
            }
            else{
                return 0;
            }

            return searcher(arr,target,s,e);
        }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9,10};
        int z=searcher(arr,4,0,arr.length-1);
        if(z==1){
            System.out.println("element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
