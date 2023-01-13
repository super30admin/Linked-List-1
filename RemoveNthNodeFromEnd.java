// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We have two pointers slow and fast. We initialize both to point to head, move the slow pointer till we reach count n, and then move both the pointers together till fast reaches end of list
// The slow pointer gives us the node to remove. We use a dummy node to take care of case where we remove first node

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}