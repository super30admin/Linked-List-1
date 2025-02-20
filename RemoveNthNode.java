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
    //The approach is that we use fast and slow pointers to maintain distance of n between them 
    //and traversing them at same speed till the fast reaches the end. now the node after the slow pointer can be removed.
    //to handle one edge case where the nth node points to head, then we need to remove the head and update it to the next node
    //for this we are using dummy node.
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while(n>0)
        {
            fast = fast.next;
            n--;
        }

        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        if(slow == dummy)
            head = head.next;
        
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return head;
    }
}
