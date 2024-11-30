/*
Time complexity : O(n).
The algorithm makes one traversal of the list of n nodes. Therefore, time complexity is O(n).

Space complexity : O(1).
We only used constant extra space.

Did this code successfully run on Leetcode: Yes
*/

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
class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        int count = 0;

        //moving the fast pointer alone so the distance between slow and fast pointer is n
        while(count <= n)
        {
            fast = fast.next;
            count++;
        }

        //Slow will be pointing to a node which is a previous to the node being deleted
        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        //making temp point to deleted node, so deleted node can be garbage collected
        ListNode temp = slow.next;
        slow.next = temp.next; //or slow.next.next
        temp.next = null;

        /*
        IF we delete the head of the node, then returning head won't work, so we return dummy.next
         */
        return dummy.next;
    }
}