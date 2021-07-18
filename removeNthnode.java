// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


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
        
        //edge case: 
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        
        ListNode slow = dummy, fast= dummy;
        int count = 0;
        
        //moving fast pointer till the gap b/w fast - slow = n
        while(count <= n){
            fast = fast.next;
            count++;
        }
        
        //moving slow to (n-1) node and fast to null
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        //removing the Nth node
        slow.next = slow.next.next; //bcz, slow is at n-1 node
            
        return dummy.next;
    }
}