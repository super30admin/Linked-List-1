// Time Complexity : O(n)
//      n: elements in linked list
// Space Complexity : O(1)
//      Only 3 extra pointers
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// 1. We add a dummy node for handling remove of the node at head.
// 2. Keep two pointer fast and slow(at differenvce of n)
// 2. Iterate till a node previous to node to be removed(as fast reaches end)
class Problem2 {
    
    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /** remove nth node */
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // for handling removal of head
        ListNode dummy = new ListNode(0);
        // linking to head
        dummy.next = head;
        
        // pointers
        ListNode fast = dummy;
        ListNode slow = dummy;
        int count = 0;
        // keep a difference of n between slow and fast
        while(count <= n){
            fast= fast.next;
            count++;
        }
        
        // till fast reaches end
        while(fast != null ){
           slow = slow.next;
           fast = fast.next;
        }
        // updating link
        slow.next= slow.next.next;
        
        // returing head
        return dummy.next;
    }
}