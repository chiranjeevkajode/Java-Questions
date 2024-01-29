
// Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

// Function Description

// Complete the isAnagram function in the editor.

// isAnagram has the following parameters:

// string a: the first string
// string b: the second string
// Returns

// boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
// Input Format

// The first line contains a string .
// The second line contains a string .

// Constraints

// Strings  and  consist of English alphabetic characters.
// The comparison should NOT be case sensitive.
// Sample Input 0

// anagram
// margana
// Sample Output 0

// Anagrams

import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
       String A=a.toLowerCase();
        String B=b.toLowerCase();
        if(A.length()!=B.length()) return false;
            for(int i=0;i<A.length();i++)
           {
            int countA=0;
            int countB=0;
            for(int j=0;j<A.length();j++){
                if (A.charAt(i)==A.charAt(j)) countA++;

                if (A.charAt(i)==B.charAt(j)) countB++;
            } 
            if(countA==countB)  continue;
            else  return false;
            }

        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a ="anagram";// scan.next();
        String b = "margana";//scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
