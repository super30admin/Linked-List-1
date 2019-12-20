/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*Algorithm:
    1. Call the reverse function from the head.next.
    2. When we call the head.next, it returns a reversed linkedlist.
    3. Join the reversed linkedlist with prev head and make prev head a tail.
    
    Time Complexity: O(n)
    Space Complexity: O(1)
    
    Did the code run on leetcode? Yes

*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
            
        return reverse;
        
        
    }
}