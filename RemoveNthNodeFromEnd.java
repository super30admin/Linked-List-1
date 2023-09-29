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
 //TC: O(N) SC: O(1)
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        // maintain diff of n between slow and fast
        while(count <= n) {
            fast = fast.next;
            count++;
        }
        ListNode slow = dummy;
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode temp = slow.next; // node which is to be deleted
        slow.next = slow.next.next;
        temp.next = null;
        
        return dummy.next;
    }
}