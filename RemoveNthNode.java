

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class RemoveNthNode {
    public ListNode removeNthNode(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy,fast = dummy;

        for(int index = 0; index <= n; index++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}