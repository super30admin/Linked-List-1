// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Understood


// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //create a dummy node that is one before the first node in given linked list
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        //go forward n steps from dummy
        int count = 0;
        while(count <= n && fast != null){
            fast = fast.next;
            count++;
        }
        //iterate until you reach the end
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        //link n-1 node to last node so nth node is skipped
        slow.next = slow.next.next;
        return dummy.next;//returning head basically
    }
}