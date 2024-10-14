class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count=n;
        while(count>0){
            fast=fast.next;
            count--;
        }

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;

        return dummy.next;
    }
}
