// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no



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
        int count = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
            
        }
        curr = dummy;
        int nodeNum = count - n;
        while(nodeNum > 0){
            nodeNum--;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }
}