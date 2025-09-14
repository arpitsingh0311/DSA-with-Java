import java.util.*;

public class L6_HashMapIterate {
    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Arpit",14);
        map.put("Himanshu",65);
        map.put("Nikhil",58);
        map.put("Shivam",25);
        map.put("Harshit",94);
        map.put("Akshay",12);
        System.out.println(map);

        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key) + " ");
        }

        for(int val : map.values()){
            System.out.print(val + " ");
        }

        System.out.println();
        
        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }








    }
}
