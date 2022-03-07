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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        int gap = 0;
        while(gap < n){
            fastPtr = fastPtr.next;
            gap++;
        }
        
        if(fastPtr==null){
            return head.next;
        }
        
        while(fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        
        
        slowPtr.next = slowPtr.next.next;
        return head;
    }
}
