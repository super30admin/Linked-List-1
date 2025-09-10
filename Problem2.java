// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Create a dummy node and point slow and fast pointer to this node
for given n move the fast by one until count reaches n so that fast is always ahead of the node to be removed
Move the slow pointer by 1 such that slow is one node behind the node to be removed
with a help of temp node delete the nth node
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        while(count<=n) {
            fast=fast.next;
            count++;
        }
        while(fast != null) {
            slow = slow.next;
            fast =fast.next;
        }
      //removal of the nth node
        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;
        return dummy.next;
    }
