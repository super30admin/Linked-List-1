// Iterative solution
// Time Complexity : O(N)
// Space Complexity : O(N) ListNode node takes N space where N is the lenght of the head
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode n = null;
        while(node!=null){
            ListNode temp = node.next;
            node.next = n;
            n = node;
            node = temp;
        }
        return n;
    }
}

// Recursive solution
// Time Complexity : O(N)
// Space Complexity : O(N) stack space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I couldn't do it on my own

class Solution {
    public ListNode reverseList(ListNode head) {
        //base
        if(head == null || head.next == null)
            return head;
        //logic
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
