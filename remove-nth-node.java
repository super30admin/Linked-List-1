// Time - O(N)
// Space - O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode start = dummy, end = dummy;
        for(int i=0;i<=n;i++) {
            end = end.next;
        }
        
        while(end!=null){
            start = start.next;
            end = end.next;
        }
        
        start.next = start.next.next;
        
        return dummy.next;
    }
}
