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

//TC: O(N)
//SC: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Find the nth node 
        // Once found just skip the next node 
        ListNode fast = head;
        int slowCount = 0;
        int fastCount = 0;
        while(fast!= null && fast.next!=null) {
            slowCount += 1;
            fastCount += 2;
            fast = fast.next.next;
        }
        if(fast != null) {
            fastCount +=1;
        }
        slowCount  = 0;
        fast = head;
        if(fastCount -n == 0)
            return head.next;
        
        while(fast != null) {
            slowCount += 1;
            if(slowCount == fastCount -n ) {
                break;
            }
            fast = fast.next;
        }
        
        fast.next = fast.next.next;
        return head;
        
    }
}
