// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        int count = 0;
        while(count <= n){
            fast = fast.next;
            count++;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    } 
}
