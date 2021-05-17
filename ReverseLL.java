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

// Time Complexity :  O(N) as there is traversal of all nodes in LL
// Space Complexity : O(1) as no extra space is used and only pointers are used
// Did this code successfully run on Leetcode : Yes

class ReverseLL {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            
            ListNode temp= curr.next; // Assign temp node to current next node
            curr.next=prev; // make curr next node to prev so pointer becomes backward
            prev=curr; // make prev as current
            curr=temp; // make current as temp 
            
        }
        
        return prev; // return prev to get reverse
    }
}