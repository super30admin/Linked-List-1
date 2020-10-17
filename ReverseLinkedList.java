/**
 * Reverse a singly linked list.
 * 
 * The code below shows both approach, iterative and recursive.
 * 
 * Iterative Approach: 
 * Space Complexity: O(1) 
 * Time Complexity: O(n)
 * 
 * Recursive Approach:
 * Space Complexity: O(n), if we consider recusion call stack space as extra, O(1) otherwise 
 * Time Complexity: O(n)
 * 
 * Leetcode Result: Both executed correctly on Leetcode.
 */
class ReverseLinkedList {
    /**
     * Figure:
     * 
     * head ---> 1 ---> 2 ---> 3 ---> 4 ---> NULL
     * 
     * initialization: NULL <--- reverseHead cursor ---> head
     * 
     * somewhere during the iteration: Loop Invariant
     * 
     * NULL <--- 1 <--- 2 <--- reverseHead cursor ---> 3 ---> 4 ---> NULL 
     *                                              next -----^ 
     * 
     * Termination: 
     * NULL <--- 1 <--- 2 <--- 3 <--- 4 <--- reverseHead
     * 
     * @param head
     * @return head to reversed linkedlist
     */
    public ListNode reverseListIterative(ListNode head) {
        ListNode reverseHead, cursor, next;
        reverseHead = null;
        cursor = head;

        while (cursor != null) {
            // pointer rearrangement
            next = cursor.next;
            cursor.next = reverseHead;
            reverseHead = cursor;
            cursor = next;
        }

        return reverseHead;
    }

    public ListNode reverseListRecursive(ListNode head) {
        // base case: LL null or single node.
        if (head == null || head.next == null) {
            return head;
        }
        // Example:
        // head --> 1 --> 2 --> 3 --> 4 --> NULL

        // holds rest of the reversed list.
        ListNode reversed = reverseList(head.next);
        // head --> 1 ------->-------
        //                          |
        // reversed --> 4 --> 3 --> 2 --> NULL
        
        // pointer rearrangement:
        head.next.next = head;
        head.next = null;
        // reversed --> 4 --> 3 --> 2 --> 1 --> NULL
        return reversed;
    }
}