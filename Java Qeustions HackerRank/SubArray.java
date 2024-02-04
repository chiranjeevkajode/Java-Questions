// We define the following:

// A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
// The sum of an array is the total sum of its elements.
// An array's sum is negative if the total sum of its elements is negative.
// An array's sum is positive if the total sum of its elements is positive.
// Given an array of  integers, find and print its number of negative subarrays on a new line.

// Input Format

// The first line contains a single integer, , denoting the length of array .
// The second line contains  space-separated integers describing each respective element, , in array .

// Constraints

// Output Format

// Print the number of subarrays of  having negative sums.

// Sample Input

// 5
// 1 -2 4 -5 1
// Sample Output

// 9

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n , sum = 0, c = 0;
        n = sc.nextInt();
        int[] a= new int[n];
        for (int i = 0; i <n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int j2 = i; j2 <= j; j2++) {
                    sum+= a[j2];
                }
                if (sum < 0) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
