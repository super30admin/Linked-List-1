// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//206. Reverse Linked List
//https://leetcode.com/problems/reverse-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Probelm1 {
    ListNode temp = null;

    public ListNode reverseList(ListNode head) {

        reverse(head);
        return temp;
    }

    private void reverse(ListNode head){
        
        if(head == null || head.next == null) {temp = head; return;}
        
        reverse(head.next);
        
        
        head.next.next = head;
        head.next = null;
        
        return;
    }