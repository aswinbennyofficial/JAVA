public class Remove_A_from_string {

//    static void remove(String i,String f,int j){
//        if(j==i.length()){
//            System.out.println(f);
//            return;
//        }
//        if(i.charAt(j)=='a'){
//            remove(i,f,j+1);
//        }
//        else{
//            remove(i,f+i.charAt(j),j+1);
//        }
//    }

    static void remover(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if(up.charAt(0)=='a'){
            remover(p,up.substring(1));
        }
        else{
            remover(p+up.charAt(0),up.substring(1));
        }
    }

    public static void main(String[] args) {
//        remove("accadafg","",0);
        remover("","accadafg");
    }
}
