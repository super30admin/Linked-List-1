Time Complexity-O(n)
Space Complexity-O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=new ListNode(0);
        ListNode slow=start,fast=start;
        slow.next=head;
        while(n>0 ){
            fast=fast.next;
            n--;
        }
        
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        
        return start.next;
    }
    
}
