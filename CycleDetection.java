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

/*
Time Complexity: O(n)
Space Complexity: O(1)
Did the code run on leetcode? Yes
Approach: We define 2 pointers and move the slow ptr at one step and the fast ptr two steps at a time. If they meet we know there is a cycle. To get the location at where cycle is beginning we reset slow pointer to head and then move both fast and slow ptr one step at a time.
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;

        ListNode slow = head;
        ListNode fast = head;

        boolean cycle = false;

        while(fast!=null && fast.next!=null){ //Condition to check if there is no cycle

            slow = slow.next;
            fast= fast.next.next;
            if(slow==fast){
                cycle=true;
                break;

            }

        }

        if(!cycle)
            return null;

        slow = head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }


        return slow;
    }
} 