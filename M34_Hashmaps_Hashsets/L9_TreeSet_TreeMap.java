import java.util.TreeMap;
import java.util.TreeSet;

public class L9_TreeSet_TreeMap {
    public static void main(String[] args) {
        
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(100);
        set.add(20);
        set.add(-8);
        set.add(200);
        System.out.println(set);

        // TreeSet is always sorted

        TreeMap<String,Integer> map = new TreeMap<>();

        map.put("Arpit",14);
        map.put("Himanshu",65);
        map.put("Nikhil",58);
        map.put("Shivam",25);
        map.put("Harshit",94);
        map.put("akshay",12);
        for(String key : map.keySet()){
            System.out.println(key+" "+map.get(key));
        }









    }
}
