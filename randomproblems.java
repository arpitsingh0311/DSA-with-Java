import java.util.Scanner;


public class randomproblems {

    public static void printarray(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        String s = "hello";
        int[] ascii = new int[s.length()];
        for(int i=0;i<s.length();i++){
            ascii[i] = (int)s.charAt(i);
        }
        printarray(ascii);
        int i=0, j=1;
        int sum =0;
        while(j<ascii.length){
            sum += Math.abs(ascii[i] - ascii[j]);
            i++;
            j++;
        }
        System.out.println(sum);
    }
}
