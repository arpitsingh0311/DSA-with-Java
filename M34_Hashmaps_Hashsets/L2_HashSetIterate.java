
import java.util.HashSet;


// package M34_Hashmaps_Hashsets;

public class L2_HashSetIterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(100);
        set.add(20);
        set.add(-8);
        set.add(200);
        for(int ele : set){
            System.out.print(ele + " ");
        }
        System.out.println();
        set.clear();   // clear whole set

        System.out.println(set);







    }
}
