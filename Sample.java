//**CIRCULAR LINKEDLIST-2**
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

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
        boolean flag=false;
        
        //null case
        if(head==null) return null;
        
        //Checking if the cycle exists
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
            {
                flag=true;
                break;
            }
        }
        
        if(flag==false) return null;
        
        slow=head;
        if (flag)
        {
            while(slow!=fast)
            {
            slow=slow.next;
            fast=fast.next;
            }
            
        }
        return slow;
    }
}
// Your code here along with comments explaining your approach
