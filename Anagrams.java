/*Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. 
For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.*/

import java.util.Scanner;
import java.util.Arrays;
public class Solution {

    static boolean isAnagram(String a, String b) {
          char[] s=a.toLowerCase().toCharArray();
           char[] s1=b.toLowerCase().toCharArray();
           Arrays.sort(s1);
           Arrays.sort(s);
           
               return Arrays.equals(s1,s);
            
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
