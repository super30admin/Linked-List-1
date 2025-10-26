// Time Complexity : O(2n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/*
 * Approach
 * we use two pointer and two loops
 * in the first loop we check will there are a cycle or not
 * by moving slow pointer one position at a time and
 * fast two position at a time
 * 
 * when we detect the cycle we break the loop and reset the slow to head
 * 
 * in the next loop we itterate both slow and fast one at a time so that 
 * when they meet it's eventually meet it will be at the start of the cycle
 * 
 * 
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}