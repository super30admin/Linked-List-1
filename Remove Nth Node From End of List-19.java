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
 //Time Complexity: O(n) where n is number of elements in the linekd list
//Space Complexity: O(1) constant
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        ListNode dum = new ListNode(-1);
        dum.next = head;
        ListNode slow = dum;
        ListNode fast = dum;
        int count = 0;
        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dum.next;
    }
}
