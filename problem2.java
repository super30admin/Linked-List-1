// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach : I used two pointers - slow and fast, I move fast to the nth node from the beginning. Now there is a gap of n nodes between slow and fast. I move fast and slow together each one step, so when fast reaches the end, there is still n elements between slow and fast -> this means that I can remove slow.next as it will be the nth from the end.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nextHead = new ListNode(0, head);
        ListNode slow = nextHead;
        ListNode fast = nextHead;
        for(int i = 1; i<=n; i++) fast = fast.next;
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return nextHead.next;
    }
}
