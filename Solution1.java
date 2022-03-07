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
    Time Complexity : O(n)
    Space Complexity : O(n)
*/
class Solution {
    
    static ListNode final_head = null;
    
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        head = helper(head);
        head.next = null;
        return final_head;
    }
    
    public ListNode helper(ListNode node){
        if(node.next == null){
            final_head = node;
            return node;
        }
        ListNode rres = helper(node.next);
        
        rres.next = node;
        
        return node;
    }
}
