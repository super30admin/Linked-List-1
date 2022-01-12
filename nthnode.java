Time:O(n);
Space:O(1);
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = new ListNode(0);
        slow.next=head;
        ListNode fast=head;
        int i=1;
        while(fast.next!=null){
            if(i<n){
                fast=fast.next;
                i=i+1;
            }
            else{
                slow=slow.next;
                fast=fast.next;
            }
        }
        if(slow.next==head){
            return head.next;
        }
        slow.next=slow.next.next;
        return head;
    }

}