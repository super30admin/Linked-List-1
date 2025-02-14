// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


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
/*
 * Using a fast pointer we travel n distance. Slow pointer initially points to head. Then we slide slow and fast till fast becomes null.
 * Slow pointer points to previous node of the node which is to be deleted. Then we delete next node.
 */
class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p=head;
        ListNode nhead=head;
        for(int i=0;i<n;i++){
            head=head.next;
        }
        if(head==null){
            return p.next;
        }
        while(head!=null && head.next!=null){
            head=head.next;
            nhead=nhead.next;
        }
        ListNode prev=nhead;
        nhead=nhead.next.next;
        prev.next=nhead;
        return p;
        
    }
}
