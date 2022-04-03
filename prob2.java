// Time Complexity : O(nodes)
// Space Complexity : O(1)
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
        
        
        ListNode temp = new ListNode(1);
        temp.next = head;
        ListNode p1 = temp;
        ListNode p2 = temp;
        
        int count = 0;
        
        while(count<n)
        {
            p2 = p2.next;
            count++;
        }
        
        while(p2.next!=null)
        {
            p2 = p2.next;
            p1 = p1.next;
        }
        
        p1.next = p1.next.next;
        
        return temp.next;
        
    }
}