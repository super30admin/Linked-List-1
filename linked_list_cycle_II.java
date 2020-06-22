/**
 * Time: O(n) n-nodex in the list
 * Space: O(1)
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
        int flag = 0;
        ListNode fast = head,slow = head;
        while(fast!=null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            slow = head;
            int index = 0;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
                index++;
            }
            return slow;
        }
        return null;
    }
}