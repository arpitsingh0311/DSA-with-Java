// package M15_16_StringsAndStringBuilder;
import java.util.Scanner;
public class questions {

    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
    }

    public static void reverse(StringBuilder sb, int i, int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }

    public static String max(String a, String b){
        String s = purify(a); String t = purify(b);
        if(s.length()>t.length()) return a;
        if(s.length()<t.length()) return b;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>b.length()) return a;
        else return b;
    }

    public static String purify(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= '0') return s.substring(i);
        }
        return s;

    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Ques-1-) Input a string and count all the vowels in the given string.

        /*String s = "Arpit Singh is a Student";
        System.out.print("Number of vowels : ");
        int n = s.length();
        int count =0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(isVowel(ch)==true){
                count++;
            }
        }
        System.out.println(count);*/


        // Ques-2-) Input a string and print all the substring of that string.

        /*System.out.print("Enter a string : ");
        String s = sc.nextLine();
        int n = s.length();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();
        }*/


        // Ques-3-) Take integer input and convert it into a string.

        /*System.out.println("Enter a number = ");
        int n = sc.nextInt();
        String s = "";
        s += n;
        System.out.println(s);*/
    


        // Ques-4-) Return the total number of digits in a number without using loop.

        /*System.out.println("Enter a number : ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        System.out.println(s.length());*/



        // Ques-5-) Input a string and Update all the even positions in the string to character 'a'. Consider 0-basedindexing.

        /*String s = sc.nextLine();
        String t = "";
        for(int i=0;i<s.length();i++){
            if(i%2 == 0) t += 'a';
            else t += s.charAt(i);
        }
        System.out.println(t);*/


        // Ques-6-) Input a string and toggle all the characters of it.(Replace all small case with capital case and vice versa)

        /*StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        for(int i=0;i<n;i++){
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){
                ascii += 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
            else if(ascii>=97 && ascii<=122){
                ascii -= 32;
                ch = (char)ascii;
                sb.setCharAt(i, ch);
            }
        }
        System.out.println(sb);*/


        // Ques-7-)Reverse each word in the given sentence.

        /*StringBuilder sb = new StringBuilder("I am Arpit Singh");
        System.out.println(sb);
        int i=0, j=0;
        int n=sb.length();
        while(j<n){
            if(sb.charAt(j) != ' ') j++;
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j=i;
            }
        }
        reverse(sb,i,j-1); //for reverse last word
        System.out.println(sb);*/


        // Ques-8-) Leetcode 242(Easy) Given two strings s and t, return true if t is an anagram of s and false otherwise.

        /*public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()) return false;
            char[] a = s.toCharArray();
            char[] b = t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<a.length;i++){
                if(a[i] != b[i]) return false;
            }
            return true;
        }*/

        // Ques-9-) Given a string consisting of lowercase English alphabets.PRint the character that is occuring most number of times. 

        /*String s = sc.next();   
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int idx = (int)ch -97;
            freq[idx]++;
        }
        int maxFreq = -1;
        for(int i=0;i<freq.length;i++){
            maxFreq = Math.max(freq[i],maxFreq);
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i] == maxFreq){
                char ch = (char)(i + 97);
                System.out.print(ch + " ");
            } 
        }*/


        // Ques-10-) Leetcode 205(Easy) Given two strings s and t, determine if they are isomorphic (They can consists any valid character)

        /*class Solution {
            public boolean isIsomorphic(String s, String t) {
                if (s.length() != t.length()) {
                    return false;
                }
                char[] a = new char[128];
                for(int i=0;i<s.length();i++){
                    char ch = s.charAt(i);
                    char dh = t.charAt(i);
                    int idx = (int)ch;
                    if(a[idx] == '\0') a[idx] = dh;
                    else{
                        if(a[idx] != dh) return false;
                    }
                }
                char[] b = new char[128];
                for(int i=0;i<t.length();i++){
                    char ch = t.charAt(i);
                    char dh = s.charAt(i);
                    int idx = (int)ch;
                    if(b[idx] == '\0') b[idx] = dh;
                    else{
                        if(b[idx] != dh) return false;
                    }
                }
                return true;
            }
        }*/


        // Ques-11-) Given n string consisting of digits from 0 to 9. Return the string which has maximum value.

        // Method -1 
        /*int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int m = Integer.parseInt(arr[i]);
            max = Math.max(max, m);
        }
        System.out.println(max);*/

        //Method -2-)

        // String[] arr = {"548491549546255432","54987987","899856","000054879"};
        /*String[] arr = {"0074","00074","74","105"};
        String maxS = arr[0];
        for(int i=1;i<arr.length;i++){
            maxS = max(maxS,arr[i]);
        }
        System.out.println(maxS);*/


        // Quees-12-) Leetcode 443(Medium) Compress the given string.
        
        
        /*class Solution {
            public int compress(char[] arr) {
                StringBuilder ans = new StringBuilder("");
                int i=0, j=0;
                while(j<arr.length){
                    if(arr[j]==arr[i]) j++;
                    else{
                        ans.append(arr[i]);
                        int len = j-i;
                        if(len>1) ans.append(len);
                        i=j;
                    }
                }
                ans.append(arr[i]);
                int len = j-i;
                if(len>1) ans.append(len);
                for(int k=0;k<ans.length();k++){
                    arr[k] = ans.charAt(k);
                }
                return ans.length();
            }
        }*/











    }
}