// 142. Linked List Cycle II
// https://leetcode.com/problems/linked-list-cycle-ii/description/


/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


public class Solution {
    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false;

        // if there's a cycle, fast would reach slow by travelling 2x times
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                flag = true;
                break;
            }
        }

        if(flag == false){
            return null;
        }

        fast = head;

        // slow and fast meets at point where cycle starts 
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
