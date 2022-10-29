// Approach : Use two pointers. Move the first pointer n positions and then move both pointers at same pace before reaching end. Then remove the node next to second pointer.
// Time Complexity: O(n) where n is the number of nodes
// Space Complexity: O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        ListNode prehead = new ListNode(-1, head);
        var p1 = prehead;
        var p2 = prehead;
        while(n>0){
            p1 = p1.next;
            n--;
        }
        
        while(p1!=null && p1.next!=null){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        p2.next = p2.next.next;
        
        return prehead.next;
    }
}