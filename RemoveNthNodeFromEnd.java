// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNthNodeFromEnd {

    /**
     * Approach - using Two pointers -fast and slow maintains the nodes difference of n
     * Finding the fast pointer and move both pointers one step
     * Once we have reached the node, to delete it point the slow to slow.next.next and set slow.next as null
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy =new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        int count =0;
        while(count <= n) {
            fast = fast.next;
            count++;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next;
    }

    /**
     * Approach - Two pass -> first finding the length of the
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy =new ListNode(-1);
        dummy.next = head;
        ListNode first = head;

        int length =0;
        while(first != null) {
            first = first.next;
            length++;
        }

        length = length-n;
        first = dummy;

        while(length >0) {
            first = first.next;
            length--;
        }

        first.next = first.next.next;

        return dummy.next;
    }
}