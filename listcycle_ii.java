// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
//approach: we use slow fat pointer approach; fast jumps 2 pointers at a time, slow 1 pointer at a time. we iterate like this until slow,fast
//meet;we keep fast pointer there, start slow again from head, simultaneously move fast, slow one step so that they move the same distance.
//we they meet again, that is the point where the cycle happens


// Your code here along with comments explaining your approach
public class listcycle_ii {
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
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=true;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                
                flag=false;
                break;
            }
        }
        if(flag)     return null;
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
    
}
