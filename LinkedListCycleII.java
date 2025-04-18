// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/* Approach:
1. Check if the cycle exists in the list by using slow and fast pointers, where fast moves at 2x times of slow pointer.
2. If at any point slow and fast pointers meets, there exists a cycle.
3. To find the head of cycle, again start 2 pointers - one from head and other from the meeting point of slow and fast in step 2. both pointers traversing 1 node at a time
4. Now when the pointers will meet, that node will be the head of cycle.
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
 **/
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        boolean hasCycle=false;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                hasCycle=true;
                break;
            }
        }
        if(hasCycle){
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        return null;
    }
}