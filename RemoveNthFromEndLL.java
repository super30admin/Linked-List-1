// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Make a window of n elements between the slow and fast pointer. Then move the fast pointer till the end, now the slow pointer will be at 1 element before the nth from last element. Delete the slow.next element. The dummy node before the head is now edge case of removing the only node in the LL.

public class RemoveNthFromEndLL {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        int count = 0;
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(count<=n){
            fast = fast.next;
            count++;
        }

        while(fast !=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        ListNode tmp = slow.next;
        slow.next = slow.next.next;
        tmp.next = null;
        
        return dummy.next;
    }
}
