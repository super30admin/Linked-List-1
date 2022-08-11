// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Used slow and fast pointer approach, maintained a count to loop through the linkedlist until we reach the nth element kept on moving the fast pointer, once the loop breaks, will have a final fast pointer value until where we can loop again and increase the slow pointer and fast pointer and at the end come out of loop and make the slow pointer value to next and return the dummy node



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
        if(head==null || head.next==null) return null;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count<=n){
            fast=fast.next;
            count++;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}