// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode slow = prev;
        ListNode fast = prev;
        
        for(int i=1;i<=n+1;i++){//you do this to create gap between slow and fast of the same distance
            fast = fast.next;
        }
        while(fast!=null){//you do this till you reach the null with fast i.e end of list
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return prev.next;
    }
}