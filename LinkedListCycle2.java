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
// Time Complexity : O(n) -> worst case traverse through the whole list to remove the element
// Space Complexity : O(1) -> no additional space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/*
* Use the concept of fast and slow pointer. As there is a cycle, the fast and slow will meet at some point (imagine it as a circle, two people running with diff speed and they will overlap at some point) if they overlap, that means there is a cycle
* To identify the point where the cycle is forming, reset either of the pointers to the start and move both the pointers with the same speed. Whereever they will meet, that is where the cycle's starting. The reason is because the slow has covered the distance a+b while fast has covered a+2b+c distance, as fast is moving by double the time the equation becomes 2(a+b) = a + 2b + c -> a = c
*/
public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            // cycle detected, break and change the flag to true 
            if(slow == fast){
                flag = true;
                break;
            }
        }

        // no cycle detected
        if(!flag) return null;

        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}