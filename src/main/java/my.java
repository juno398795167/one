import java.util.HashSet;
import java.util.Set;

public class my {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        try {

            set.add(1);
            set.add(1);
            System.out.println(set.size());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(set);
    }
}
