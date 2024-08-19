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
// Time complexity = O(n)
// Space complexity = O(1)
// we have used the fast and slow pointers to first create the gap of n between them
// then we have iterate simply through the list to go till the end of the list.
// the slow refers to the node prior to the node to be deleted.
// so slow.next = slow.next.next;

class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        // used dummy for the case where [1] and n =1.
        // the first node cannot be removed ifdummy is not used.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // since we are setting fast and slow to dummy initially, there won't be any difference with or without dummy. 
        ListNode fast = dummy;
        ListNode slow = dummy;
        // get the gap between slow and fast.
        while(count<=n) {
            fast = fast.next;
            count++;
        }
        // iterate till end of the list.
        while(fast!=null) {
            slow= slow.next;
            fast= fast.next;
        }
        // do the remove.
        slow.next = slow.next.next;
        return dummy.next;
    }
}