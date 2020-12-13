// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Use 2 pointers. First pointer moves by n+1 steps and Second pointer
// will point to nth node from last.  

class RemoveNthNodeFromEndSolution {
    class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode start = dummy;
        ListNode end = dummy;
        for(int i=0; i<=n; i++) {
            end = end.next;
        }
        
        while(end!=null) {
            start = start.next;
            end = end.next;
        }
        start.next = start.next.next;
        return dummy.next;
    }
}