// Time Complexity :O(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nothing



public class RemoveNthNode {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        int count =0; ListNode slow = dummy; ListNode fast=dummy;

        while(count<=n){
            fast = fast.next;
            count++;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp = null;

        return dummy.next;
    }
}
