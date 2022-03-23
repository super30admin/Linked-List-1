// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* APPROACH 1 (Iterative):
Take 3 pointers: prev, curr and fast. initially pointing to null, head and head.next.
We first make curr.next to prev and then move all pointers ahead till fast doesn't hit null
when fast hits null, we are still left with one reversal, so we do curr.next = prev.

APPROACH 2 (Recursive):
We keep on calling reverse on head.next until head or head.next become null, in that case we return head.
To maintain the head of the reversed linkedlist, we keep a global variable and return the reverse(head).
then set head.next.next to head and head.next to null
 */

public class ReverseLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode reverseList(ListNode head) {
        // Iterative solution
        /*if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;

        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev; //in the case of last iteration when fast reaches null, we need to point the current's next to prev
        return curr; */

        //Recursive Solution
        if(head == null || head.next == null){
            return head;
        }

        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}
