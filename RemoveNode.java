/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Overall Time Complexity : O(n) + O(n) for time take to traverse the list twice (worst-case)
// Overall Space Complexity : O(1) for constant space
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation

//First, count the total number of nodes using a pointer (fast) to determine the length of the list.
//Create a dummy node to handle edge cases (like removing the head).
//Move a second pointer (slow) to the node just before the one to remove, and adjust pointers to skip the target node.

class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null ){
            return null;
        }
        if (head.next == null && n==1 ){
            return null;
        }
        
        ListNode fast = head;
        int count = 0;
        
        while(fast!=null){
            fast = fast.next;
            count++;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode slow = dummyNode;

        int diff = count - n;
        for(int i=0;i<diff;i++){
            slow = slow.next;

        }
        slow.next = slow.next.next;
        return dummyNode.next;
        

        
    }
}