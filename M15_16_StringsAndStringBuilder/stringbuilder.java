package M15_16_StringsAndStringBuilder;

import java.util.Scanner;

public class stringbuilder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("A");
        System.out.println(sb);
        // StringBuilder sbb = new StringBuilder(sc.nextLine());
        // System.out.println(sbb);
        // sbb.setCharAt(2, '5');
        // System.out.println(sbb);

        sb.append("bcdefgh");   
        System.out.println(sb);  

        sb.deleteCharAt(4);
        System.out.println(sb);

        sb.delete(2,5);
        System.out.println(sb);   
        
        sb.insert(2, 'z');
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);





    }
}
