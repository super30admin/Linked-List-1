/*Running Time Complexity: O(2*n)
Space Complexity: O(1)
Successfully Run and Compile on leetcode
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                flag = true;
                break;   
            }
        }
        if(!flag) return null;
        slow = head;
        //int temp = 0;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        
        return fast;
    }
}