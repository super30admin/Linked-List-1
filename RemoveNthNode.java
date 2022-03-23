// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* APPROACH:
Intuition is to create a window of size n, to know which pointer to remove
1. to create a window, increment fast pointer until the length of list is n.
2. start the slow pointer from the start of the link list and move both pointers one step until fast.next hits null.
3. remove slow.next by pointing slow.next to slow.next.next

Note: the head itself might have to be removed, so always take a dummy node with val -1 and return dummy.next instead of head.
 */

public class RemoveNthNode {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head; //taking dummy node so that the code doesn't fail when length of linked list is just 1
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        while(count < n){ //while we make the window of size n
            fast = fast.next;
            count++;
        }
        while(fast.next != null){ // now we start noving both until fast reaches the last node
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next; //removing the nth node from the end
        //return head; // we cannot do this as what if the head was supposed to be removed.
        return dummy.next; // thus we return dummy.next
    }
}
