//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev=new ListNode(0);
        prev.next=head;
        int count=0;
        ListNode slow=prev;
        ListNode fast=prev;
        while(count<n){
            fast=fast.next;
            count++;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return prev.next;
    }
}