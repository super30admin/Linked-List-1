// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


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
        ListNode H = head;
        ListNode temp = head;
        while(n>0 && temp.next != null){
            temp = temp.next;
            n--;
        }
        if(n==1) return H.next;
        if(n>1) return null;
        while(temp.next != null){
            temp = temp.next;
            head = head.next;
        }
        head.next = head.next.next;
        return H;
    }
}