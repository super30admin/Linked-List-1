// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // initliaze dummy node at the start of the linked list
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // initalize slow and fast pointers
        ListNode slow = dummy;
        ListNode fast = dummy;
        // initialze count
        int count = 0;
        // keep moving fast until difference between slow
        // and fast = n
        while(count <= n){
            fast = fast.next;
            count++;
        }
        // keep moving slow and fast together so that slow ends
        // up to n - 1 th element from end
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        // remove the nth element
        slow.next = slow.next.next;
        return dummy.next;
    }
}