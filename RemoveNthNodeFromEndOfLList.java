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
class Solution {

    /**
        3 Pointer Approach - Prev, pointer just to use for deleteing the node
        TC -> O(N), single pass
        SC -> O(1)
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move fast n steps
        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        // Move all Pointers 1 step untill fast reaches null
        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        // Slow is at the curr node which needs to be deleted and prev is the previous node to slow
        if(prev != null){
            prev.next = slow.next;
            return head;
        }
        else return head.next;
        
    }
}
