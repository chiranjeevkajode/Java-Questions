// You are given a  2D array. An hourglass in an array is a portion shaped like this:

// a b c
//   d
// e f g
// For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

// 1 1 1     1 1 0     1 0 0
//   1         0         0
// 1 1 1     1 1 0     1 0 0
// The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

// In this problem you have to print the largest sum among all the hourglasses in the array.

// Input Format

// There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.

// Output Format

// Print the answer to this problem on a single line.

// Sample Input

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
// Sample Output

// 19

import java.util.Scanner;

public class Array2dHourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int arr_i = 0; arr_i <6; arr_i++) {
            for (int arr_j = 0; arr_j< 6; arr_j++) {
                arr[arr_i][arr_j] = sc.nextInt();
            }
        }
        Sum(arr);
    }

    private static void Sum(int arr[][]){
        int sum = -1000;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int top = arr[i][j]+arr[i][j+1]+arr[i][j+2];
                int middle = arr[i+1][j+1];
                int bottom = arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];

                if (top+middle+bottom>sum) {
                    sum = top + middle +bottom;
                }
            }
        }
        System.out.println(sum);
    }
}
