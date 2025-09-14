package M15_16_StringsAndStringBuilder;

import java.util.Arrays;

public class sortingString {
    public static void main(String[] args) {
        
        String s = "arpit";
        char[] ch = s.toCharArray();
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();


        




    }
}
