// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//Solution: Remove nth node from end of the linked list
//Move fast pointer till count is less than equal to n.
//This will create a sliding window between fast and slow pointer.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = dummy;  
        int count=0;
        while(count<=n){
            fast = fast.next;
            count++;
        }

        ListNode slow = dummy;
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next;
        
    }
}