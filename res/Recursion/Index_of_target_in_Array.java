import java.util.ArrayList;

//public class Index_of_target_in_Array {
//    static ArrayList<Integer> list=new ArrayList<>();
//    static ArrayList searcher(int[] arr,int i,int target){
//        if(i==arr.length){
//            return list;
//        }
//        if(arr[i]==target){
//            list.add(i);
//        }
//
//        return searcher(arr,i+1,target);
//    }
//    public static void main(String[] args) {
//        int[] arr = {1, 4, 18, 5, 3, 6, 18, 9, 7,18};
//        int target = 18;
//
//
//        searcher(arr, 0, target);
//        System.out.println(list);
//    }
//
//}


public class Index_of_target_in_Array {

    static ArrayList searcher(int[] arr,int i,int target, ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }

        return searcher(arr,i+1,target,list);
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 18, 5, 3, 6, 18, 9, 7,18};
        int target = 18;

        ArrayList<Integer> list=new ArrayList<>();

        System.out.println(searcher(arr, 0, target,list));
    }

}
