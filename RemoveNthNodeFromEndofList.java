// TC: O(N)
// SC: O(1)


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
        
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode start = dummy, end = dummy;
        
        for(int i=0;i<=n;i++){
            end = end.next;
        }
        while(end!=null){
            start = start.next;
            end = end.next;
        }
        
        ListNode extra = start.next;
        start.next = start.next.next;
        
        if(extra!=null){
            extra.next = null;
        }
        
        head = dummy.next;
        
        return head;
    }
}