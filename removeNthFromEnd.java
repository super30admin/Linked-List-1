// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

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
        if(head == null)
            return null;
        ListNode temp = new ListNode(-1);
        temp.next = head;
        ListNode start = temp;
        ListNode end = temp;
        for(int i = 0; i<= n; i++){
            end = end.next;
        }
        while(end!=null){
            start = start.next;
            end = end.next;
        }
        ListNode extra = start.next;
        start.next = start.next.next;
        if(extra.next == null){
            extra.next = null;
        }
        head = temp.next;
        return head;
    }
}