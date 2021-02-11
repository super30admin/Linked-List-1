// Time Complexity - O(n) 
//Space Complexity - O(constant)

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pointer1 = dummy;
        ListNode pointer2 = dummy;
        
        // Move pointer2 n spaces away from pointer1
        while(n>0){
            pointer2 = pointer2.next;
            System.out.println(pointer2.val);
            n = n - 1;
        }
        // Keep moving both the pointers such that pointer1 is at the desired position
        while(pointer2.next != null){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        pointer1.next = pointer1.next.next;
        return dummy.next;
        
    }
}
