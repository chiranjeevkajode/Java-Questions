// In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

// Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

// Deque deque = new LinkedList<>();
// or
// Deque deque = new ArrayDeque<>();
// You can find more details about Deque here.

// In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .

// Note: Time limit is  second for this problem.

// Input Format

// The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.

// Constraints




// The numbers in the array will range between .

// Output Format

// Print the maximum number of unique integers among all possible contiguous subarrays of size .

// Sample Input

// 6 3
// 5 3 5 2 3 2
// Sample Output

// 3



import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet set =new HashSet<>();

        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            deque.add(num);
            set.add(num);

            if (deque.size() == m) {
                if (set.size() > max) {
                    max = set.size();
                }

                int first = (int) deque.remove();
                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }
        }
        System.out.println(max);
    }
}
