// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode P1 = dummy;
        ListNode P2 = dummy;
        dummy.next = head;
        
        while(n>0){
            P2= P2.next;
            n--;
        }
        
        while(P2.next != null){
            P1=P1.next;
            P2=P2.next;
        }
        
        P1.next = P1.next.next;
        return dummy.next;
    }
}