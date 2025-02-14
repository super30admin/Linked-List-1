// Time complexity:- O(n)
// Space complexity:- O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach 
/**
 * Approach: 
 * This problem is about reversing a singly linked list.
 * I used an iterative approach where I maintained two pointers, pre and head. 
 * The pre pointer initially points to null, and the head pointer traverses the list.
 * As I traverse the list, I reverse the direction of each node's next pointer by pointing 
 * it to the previous node pre, and then move both pointers forward until the list is fully reversed.
 */ 
class Solution {
    public ListNode reverseList(ListNode head) {
        // pre will initially pointing to null
        ListNode pre = null;

        // nextPointer will point to head.next 
        ListNode nextPointer;

        // Traverse the list until we reach the end
        while(head != null) {
            // Store the next node before changing the current node's pointer
            nextPointer = head.next;
            // Reverse the current node's pointer to point to the previous node
            head.next = pre;
            // Move 'pre' one step forward (to the current node)
            pre = head;
             // Move 'head' one step forward to the next node
            head = nextPointer;
        }
        // Return the new head after reversing
        return pre;

    }
}


   

     