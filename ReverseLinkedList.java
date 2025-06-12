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
class Solution {
    //time complexity : O(n)
    // space complexity : O(n)
    ListNode reverseListNode;
    public ListNode reverseList(ListNode head) {
        
        helper(head);
        return reverseListNode;
    }

    private void helper(ListNode head){
        //base
        if(head==null || head.next==null){
            reverseListNode = head;
            return;
        } 
        //logic
        helper(head.next);
        head.next.next = head;
        head.next = null;
    }
}