//import java.util.UUID;
import java.util.*;

public class Unique_Alpha_Num_Gen{
        public static void main(String[] args) {
                HashSet<String> hs=new HashSet<>();
                int i,count=0;
                for(i=0;i<10000;i++) {
                        hs.add(generateString());
                }
                for(String j : hs){
                        System.out.println(j);
                        count++;
                }
                System.out.println("generated: "+count);
        }

        public static String generateString() {
                String uuid = UUID.randomUUID().toString();
                uuid=uuid.replace("-", "");
                return uuid;
        }

}
