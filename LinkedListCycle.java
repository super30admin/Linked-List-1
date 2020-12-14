// Time Complexity :O(N) where n is the number of nodes 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : Missed writing head.next as the base condition.


// Your code here along with comments explaining your approach: maintain two pointers slow fast. If the cycle is present, fast and slow pointewrs
//meet. From the meeting point, we start slow and from the start of the list, we start our fast pointer, both moving at the same pace.
// the point at which they meet is the starting point of the list.

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
        if(head == null || head.next==null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!= null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                fast=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                break;
            }
        }
        return slow==fast?fast:null;
    }
}