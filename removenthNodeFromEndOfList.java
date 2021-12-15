// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Start with dummy notes and two pointers.
Iterate the list with count incremented.
Until count is less than or equal to n. Increment fast node.
While fast is not equal to zero do fast.next and slow.next
In the end point the slow.next to its next element.
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int count=0;
        ListNode slow=dummy;
        ListNode fast=dummy;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}