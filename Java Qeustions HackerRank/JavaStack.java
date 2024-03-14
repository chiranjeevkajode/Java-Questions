// A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

// Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

// Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

// Given a string, determine if it is balanced or not.

// Input Format

// There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

// The part of the code that handles input operation is already provided in the editor.

// Output Format

// For each case, print 'true' if the string is balanced, 'false' otherwise.

// Sample Input

// {}()
// ({()})
// {}(
// []
// Sample Output

// true
// true
// false
// true
// Language
// Java 8
// More
// 14151612131110893456712
//             System.out.println(checkSing(input,'{', '}')&&checkSing(input,'[', ']')&&checkSing(input,'(', ')'));
// 		}
		
// 	}
    
//     public static boolean checkSing(String input, char opening, char closing){
//         Stack<String> stack = new Stack<String>();
//         for (int i = 0; i < input.length(); i++) {

// Line: 11 Col: 112

// Test against custom input
// Congratulations!

// You have passed the sample test cases. Click the submit button to run your code against all the test cases.


// Sample Test case 0
// Input (stdin)
// {}()
// ({()})
// {}(
// []
// Your Output (stdout)
// true
// true
// false
// true
// Expected Output
// true
// true
// false
// true
// BlogScoring

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(checkSing(input, '{', '}')&& checkSing(input, '[', ']')&&checkSing(input, '(', ')'));
        }
    }

    public static boolean checkSing (String input , char opening, char closing){
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == closing) {
                if (!stack.empty()) {
                    stack.pop();
                }else{
                    return false;
                }
            }
            if (c == opening) {
                stack.push(String.valueOf(c));
            }
        }
        return stack.empty();
    }
}
