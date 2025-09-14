package M15_16_StringsAndStringBuilder;
// package strings;
import java.util.*;

public class practiceSheet {

    public static void reverseString(StringBuilder s, int i, int j) {
        while (i < j) {
            char temp = s.charAt(i);
            s.setCharAt(i, s.charAt(j));
            s.setCharAt(j, temp);
            i++;
            j--;
        }
    }







    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);        


// Ques-1-) Input a string of size n and Update all the odd positions in the string to character ‘#’. Consider 0-based indexing. 
        
        /*System.out.print("Enter n:");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        System.out.print("Enter the string of length n :");
        String input = sc.nextLine();

        if (input.length() != n) {
            System.out.println("The length of the string does not match the specified length.");
        } else {
            StringBuilder sb = new StringBuilder(input);
            for (int i = 1; i < sb.length(); i += 2) {
                sb.setCharAt(i, '#');
            }
            System.out.println("Updated string: " + sb.toString());
        }*/
        
// Ques-2-) Input a string and count all the consonants in the given string.

        /*String s =  sc.nextLine();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') count++;
        }
        System.out.println(count);*/
        
// Ques-3-) Check whether the given string is palindrome or not
    
        /*String s = sc.nextLine();
        int i = 0;
        int j = s.length()-1;
        boolean flag = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
                break;
            } else{
                continue;
            }
        } 
        if(flag) System.out.println("Yes");
        else System.out.println("No"); */

// Ques-4-) Input a string of even length and reverse the second half of the string.

        System.out.print("Enter a string of even length : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        reverseString(sb,n/2,n-1);
        System.out.println(sb);






// Q5.  Input a string of length less than 10 and convert it into integer without using builtin function.
// Q6. Input a string and concatenate with its reverse string and print it.
// Q7.  Find the second largest digit in the string consisting of digits from ‘0’ to ‘9’.
// Q8.  Input a string and return the number of substrings that contain only vowels.
// Q9.  Given an array of strings. Check whether they are anagram or not.
// Q10.  Given a sentence ‘str’, return the word that is lexicographically maximum.































    }
}
