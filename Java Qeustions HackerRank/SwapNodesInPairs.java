// Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

// Input: head = [1,2,3,4]
// Output: [2,1,4,3]
// Example 2:

// Input: head = []
// Output: []
// Example 3:

// Input: head = [1]
// Output: [1]



class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        // If the list has 0 or 1 node, no need to swap
        if (head == null || head.next == null) {
            return head;
        }
        
        // Dummy node to simplify the logic
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Pointer to keep track of the previous node
        ListNode prev = dummy;
        
        while (head != null && head.next != null) {
            // Nodes to be swapped
            ListNode first = head;
            ListNode second = head.next;
            
            // Swapping
            prev.next = second;
            first.next = second.next;
            second.next = first;
            
            // Move pointers forward for next iteration
            prev = first;
            head = first.next;
        }
        
        return dummy.next;
    }
}
