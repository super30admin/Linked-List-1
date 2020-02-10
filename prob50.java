// S30 Big N Problem #50 {Medium}
// 142. Linked List Cycle II
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


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
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode fast=head;
        ListNode slow=head;
        boolean flag=false;
        
        while(fast !=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        
        if(!flag) return null;
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}