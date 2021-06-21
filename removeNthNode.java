// Time Complexity: O(n)
// Space Complexity: O(1)
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
        ListNode dummy = new ListNode(-1, head);
        ListNode sPtr = dummy;
        ListNode fPtr = dummy;
        int count=0;
        while(count <= n){
            fPtr = fPtr.next;
            count++;
        }
        
        while(fPtr != null){
            sPtr = sPtr.next;
            fPtr = fPtr.next;
        }
        
        sPtr.next = sPtr.next.next;
        
        
        return dummy.next;
    }
}