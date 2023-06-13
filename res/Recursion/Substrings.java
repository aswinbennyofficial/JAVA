public class Substrings {
    static void subs(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);

        subs(p,up.substring(1)); //ignore
        subs(p+ch,up.substring(1)); //take it
    }

    public static void main(String[] args) {
        subs("","123");
    }
}
