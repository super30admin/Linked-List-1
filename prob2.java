// Time Complexity o(n) space complexity o(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int count = 0;
        while(count<=n){
            fast=fast.next;
            count++;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode temp = slow.next;
        slow.next=slow.next.next;
        temp.next=null;
        return dummy.next;

    }
}