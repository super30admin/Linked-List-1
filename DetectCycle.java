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
        ListNode slow = head, fast = head;
        boolean flag = false;
        while(fast != null &&fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        //reset our pointer
        slow = head;
        while(slow != fast ){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}


/*
HashSet will work, will be able to do so in O(N) space and time complexity.
Can have slow and fast iterators. If there's two runners, and one is 2x the speed, it will catch up to the 1st runner eventually.  
*/