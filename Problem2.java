// Time Complexity : O(n) traverses through all nodes of list
// Space Complexity : O(1) not using any additional space except for constant nodes
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }

        int count = 0;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(count <= n){
            fast = fast.next;
            count++;
        }

        if(fast == null){
            slow.next = slow.next.next;
            return dummy.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
