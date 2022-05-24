/** Time Complexity : O(n)
Space Complexity : O(1)
Did your code run on leetcode : yes**/


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
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        int count = 0;
        //incrementing fast pointer till count<=n 
        while(count <= n)
        {
            fast = fast.next;
            count ++ ;
        }
        //after fast reach the n th position start slow pointer till slow pointer is one node behind the node to be removed
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next; //removing the node
        
        return dummy.next;
        
    }
}
