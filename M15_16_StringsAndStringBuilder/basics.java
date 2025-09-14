package M15_16_StringsAndStringBuilder;
import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Mwthod 1
        char[] arr = { 'A','r','p','i','t'};
        for(char ele: arr){
            System.out.print(ele);
        }
        System.out.println();

        // Method-2-)
        String x = "Arpit is a Student";
        System.out.println(x);

        // String str = sc.next();
        // System.out.println(str);
        String stg = sc.nextLine();
        System.out.println(stg);

        


    }
}
