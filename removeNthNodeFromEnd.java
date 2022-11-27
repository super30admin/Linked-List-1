// Time Complexity : O(n) //one pass
// Space Complexity :O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        int cnt=0;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy, fast=dummy;
        while(cnt<=n){
            fast=fast.next;
            cnt++;
        }
        
         
            while(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
        
        
        slow.next=slow.next.next;
        return dummy.next;
    }
}