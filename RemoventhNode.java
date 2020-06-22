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
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
        dummy.next = head;  //attach dummy(0) to head(1)
        int count = 0;
        while(count <= n){
            fast = fast.next;
            count++;
        }
        //now fast ponter at 3
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
       
        //reached n-1th  node and removed as below
        slow.next = slow.next.next;
       
        return dummy.next;
       
       
    }
}