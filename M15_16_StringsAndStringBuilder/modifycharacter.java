package M15_16_StringsAndStringBuilder;

public class modifycharacter {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s);
        // heyle
        // second index change kar do
        s = s.substring(0,2) + "y" + s.substring(3);
        System.out.println(s);









    }
}
