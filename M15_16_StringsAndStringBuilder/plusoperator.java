package M15_16_StringsAndStringBuilder;

public class plusoperator {
    public static void main(String[] args) {
        String s ="abc";
        System.out.println(s);
        s = s + "xyz";
        System.out.println(s);
        String t = "pqr";
        s = s + t;
        System.out.println(s);
        s = s + "10";
        System.out.println(s);
        s = "10" + s;
        System.out.println(s);

        System.out.println("abc" + 10 +20);
        System.out.println(10+20+"abc");



    }
}
