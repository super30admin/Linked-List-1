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
 //Time complexity - O(n)
 //Space complexity - O(1)
 // Did you face any issues - No
 // Solved on leet code - yes
 // Creating a slow and fast pointers in such a way that slow moves by 1 pointer and fast moves by 2 pointers. hence these 2 will be always meeting at a point if there is cycle. Then we are identifying the 1st place of the cycle, by moving each pointer by 1.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        Boolean flag = false;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {flag = true;break; }
        }

        if(!flag) return null;
        slow = head;
        while(slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
