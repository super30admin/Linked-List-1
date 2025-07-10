// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach : I use two pointers fast and slow. Fast moves twice the speed of slow. When they meet, slow has covered distance till start of cycle (i) + some distance in the cycle (j), whereas fast has covered twice of it, which is also equal to distance till start of cycle (i) + n cycles + some distance in the cycle (j). Also, fast covered twice distance, so nx+i+j = 2i+2j. So, nx=i+j => nx-j=i. Fast is currently at nx+j inside the cycle, moving slow to 0 and moving it ahead till it meats fast will give us the start of the cycle. This is because, slow will move i steps, and after i steps, fast will be at nx+j+i = nx+j+nx-j=2nx. Basically 2x cycles without any additional steps -> this is the beginning of the cycle.

class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) break;
        }
        if(fast == null || fast.next == null) return null;
        slow = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}