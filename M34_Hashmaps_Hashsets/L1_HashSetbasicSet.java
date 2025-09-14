// package M34_Hashmaps_Hashsets;

import java.util.HashSet;

public class L1_HashSetbasicSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(100);
        set.add(20);
        set.add(-8);
        set.add(200);
        System.out.println(set);

        System.out.println(set.contains(100));
        System.out.println(set.contains(50));
        set.add(50);
        System.out.println(set.contains(50));
        System.out.println(set.size());

        set.remove(100);
        System.out.println(set);
        Object[] arr = set.toArray();
        for(Object ele:arr){
            System.out.print(ele + " ");
        }



    }
}
