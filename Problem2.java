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
class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // null check
        if(head == null) return null;
        ListNode dummy = new ListNode(-1); // deal with first node deletion
        dummy.next = head;
        ListNode ptr1 = dummy;
        ListNode ptr2 = dummy;
        int count = 0;
        while(count++ <= n){
            ptr2 = ptr2.next;
        }
        while(ptr2 != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        ptr1.next = ptr1.next.next; // removes link to the node to be deleted.
        return dummy.next;// in case head the node that was deleted.
    }
}

//TC: O(n)
//SC: O(1)