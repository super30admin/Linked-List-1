// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :i have implemented this by using slow and fast pointer where 
// slow pointer moves in 1x speed and fast 2x speed till fast is not null.at the pointer where slow and fast met t
// hen i came to know that there is a cycle then i return true.

// Your code here along with comments explaining your approach

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
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;

            }
        }
        return false;
        
    }
}