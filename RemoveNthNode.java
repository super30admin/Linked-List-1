// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode slow = temp;

        ListNode fast = temp;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast=fast.next;
        }

        ListNode t = slow.next.next;
        slow.next = slow.next.next;
        t.next = null;
        return temp;
    }
}
