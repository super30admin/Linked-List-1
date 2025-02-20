// Time Complexity : O(n) n is number of nodes.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class ListNode {
    int val;
   ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    //first we try to find if cycle exists or not by using fast and slow pointers
    //we can detect a cycle when there are two pointers meet
    //after that we place one of them at head and move them at same speed such that when they meet then return the cycle start node
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null)
        {
            slow = slow .next;
            fast = fast.next.next;
            if(slow == fast)
            {
                fast = head;
                while(fast != slow)
                {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}