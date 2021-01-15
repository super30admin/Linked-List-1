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
// Iterative approach
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode currentHead = head;
        ListNode reverseHead = null;
        ListNode temp;
        while(currentHead != null){
            temp = currentHead.next;
            currentHead.next = reverseHead;
            reverseHead = currentHead;
            currentHead = temp;
        }
        return reverseHead;
    }
}
*/

// recursive approach
// Time Complexity : O(n)
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
class Solution {
    public ListNode reverseList(ListNode head) {
        //base
        if(head == null || head.next == null)
            return head;
        //logic
        ListNode temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
}
