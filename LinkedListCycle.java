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
// Space Complexity: O(1)
// Time Complexity: O(N)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head ==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        fast=head;
        if(flag==false)
            return null;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
