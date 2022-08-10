// Time Complexity : O(n)
// Space Complexity : O(1)


class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast=head;
        int i=0;
        while(i<n){
            i++;
            fast=fast.next;
        }
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        if(slow==head)
            return slow.next;
        prev.next = prev.next.next;
        return head;
    }
  
}
