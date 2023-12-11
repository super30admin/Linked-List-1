// Time Complexity : O(n) // 2 times O(n) 1 cycle for checking for cyclic dependency, another to find the cycle node
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

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
//Using 2 pointer approach to find if there is cyclic dependency, if yes, then move slow to head and move slow and
// fast at 1x speed until they meet.
public class LLCycle2 {
    public ListNode detectCycle(ListNode head) {

        //Check if there is a circular dependency or not
        boolean  flag = false;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;//in circular, they meet with 1x speed
        }
        return fast;
    }
}