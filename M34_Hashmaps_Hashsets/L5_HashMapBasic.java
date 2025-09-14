
import java.util.HashMap;

public class L5_HashMapBasic {
    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("Arpit",14);
        map.put("Himanshu",65);
        map.put("Nikhil",58);
        map.put("Shivam",25);
        map.put("Harshit",94);
        map.put("Akshay",12);
        System.out.println(map);

        System.out.println(map.containsKey("Himanshu"));
        System.out.println(map.containsKey("Chiranjeev"));
        System.out.println(map.containsValue(75));

        map.put("Arpit",100);
        map.put("Karan",12);
        System.out.println(map);

        map.remove("Karan");
        System.out.println(map +  " Size : " + map.size());

        System.out.println(map.get("Himanshu"));


 















    }
}
