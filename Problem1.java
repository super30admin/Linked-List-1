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
//Problem - Reverse Linked List
//Time Complexity - O(n) where n is the number of nodes in linked list
//Space Complexity - O(1) we are using constant amount of extra space 
//Code run successfully on Leetcode - Yes

class Solution {
    public ListNode reverseList(ListNode head) {
        
        //Checking condition for empty linked list
        if(head == null) return head;

        //declaring the initials
        ListNode prev = null;
        ListNode current = head;
        
        //reversing the linkedlist
        while(current != null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}