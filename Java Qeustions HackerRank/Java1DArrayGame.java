// Let's play a game on an array! You're standing at index  of an -element array named . From some index  (where ), you can perform one of the following moves:

// Move Backward: If cell  exists and contains a , you can walk back to cell .
// Move Forward:
// If cell  contains a zero, you can walk to cell .
// If cell  contains a zero, you can jump to cell .
// If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.
// In other words, you can move from index  to index , , or  as long as the destination index is a cell containing a . If the destination index is greater than , you win the game.

// Function Description

// Complete the canWin function in the editor below.

// canWin has the following parameters:

// int leap: the size of the leap
// int game[n]: the array to traverse
// Returns

// boolean: true if the game can be won, otherwise false
// Input Format

// The first line contains an integer, , denoting the number of queries (i.e., function calls).
// The  subsequent lines describe each query over two lines:

// The first line contains two space-separated integers describing the respective values of  and .
// The second line contains  space-separated binary integers (i.e., zeroes and ones) describing the respective values of .
// Constraints

// It is guaranteed that the value of  is always .
// Sample Input

// STDIN           Function
// -----           --------
// 4               q = 4 (number of queries)
// 5 3             game[] size n = 5, leap = 3 (first query)
// 0 0 0 0 0       game = [0, 0, 0, 0, 0]
// 6 5             game[] size n = 6, leap = 5 (second query)
// 0 0 0 1 1 1     . . .
// 6 3
// 0 0 1 1 1 0
// 3 1
// 0 1 0
// Sample Output

// YES
// YES
// NO
// NO

import java.util.Scanner;

public class Java1DArrayGame {
    public static boolean find_path(int leap , int[] game, int x){
        if (x < 0) {
            return false;
        }
        if (x > game.length -1) {
            return true;
        }
        if (game[x] != 0) {
            return false;
        }
        game[x] = 5;

        if (find_path(leap, game, x+1)) {
            return true;
        }
        if (find_path(leap, game, x + leap)) {
            return true;
        }
        if (find_path(leap, game, x -1)) {
            return true;
        }
        
        game[x] =0;
        return false;
    }

    public static boolean camWin(int leap, int[] game){
        return find_path(leap, game, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k =sc.nextInt();
        while (k-- > 0) {
            int n = sc.nextInt();
            int[] game = new int[n];
            int leap = sc.nextInt();
            for (int i = 0; i <n; i++) {
                game[i] = sc.nextInt();
            }
            System.out.println((camWin(leap, game)) ? "YES" : "NO");
        }
        sc.close();
    }
}
