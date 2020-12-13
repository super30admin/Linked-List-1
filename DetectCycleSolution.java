// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// First we find if cycle is there using Floyd's algorithm.
// If cycle exists then using slow and current pointer we traverse link list
// and return current ptr where slow and curr meet. 

public class DetectCycleSolution {
    class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        while(fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                isCycle = true;
                break;
            }
        }
        if(slow==null || !isCycle)
            return null;
        ListNode curr = head;
        while(curr!=slow && slow.next!=null) {
            curr = curr.next;
            slow = slow.next;
        }
        return curr;
    }
}