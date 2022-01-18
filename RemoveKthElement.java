// Time Complexity = O(N)
// Space Complexity = O(1)
// Approach = Sliding Window
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
        int count = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode Fast = dummy;
        ListNode Slow = dummy;
        while(count<n){
            count++;
            Fast = Fast.next;
        }
        
        while(Fast.next!=null){
            Fast = Fast.next;
            Slow = Slow.next;
        }
        Slow.next = Slow.next.next;
        return dummy.next;
    }
}