// Time Complexity : O(N), N = #Nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        int len = 0;

        while(curr != null) {
            len+=1;
            curr = curr.next;
        }

        len = len-n;

        curr = dummy;

        while(len>0) {
            curr = curr.next;
            len-=1;
        }
        curr.next = curr.next.next;

        return dummy.next;
    }
}
