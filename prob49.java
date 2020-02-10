// S30 Big N Problem #49 {Medium}
// 19. Remove Nth Node From End of List
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        ListNode slow=dummy;
        ListNode fast=dummy;
        
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        
        while(fast !=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        return dummy.next;
    }
}