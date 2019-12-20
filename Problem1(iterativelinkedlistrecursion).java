/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*Algorithm:
    1. Three pointer approach is used. prev, curr and fast
    2. While the fast node had reached the null, for each node connect curr.next node to prev, move prev to curr, curr to fast and then fast to fast.next.
    3. Make the final connection of curr.next to prev
    
    
    Time Complexity: O(n)
    Space complexity: O(1)
    
    Did the code run on leetcode? Yes

*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;
        
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while(fast!=null){
            curr.next = prev;
            prev = curr;
            curr = fast; 
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}