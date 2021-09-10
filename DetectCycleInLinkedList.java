// Time Complexity :O(n) length of list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
1. detect if cycle exists or not by two poinyers fast and slow
2. if exists then set one of the pointer to head and start moving by one again towards end until fast not == slow
3. otherwise return null

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
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
         // null case
        if(head == null || head.next == null)
            return null;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        Boolean flag = false;
        while(fast !=  null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow)
            {flag = true; break;}
        }
        
       
        
        if(flag == true )
        { 
             slow = dummy;
            while(fast!= slow)
            {
                slow = slow.next;
                fast = fast.next;
            }
        } 
        else 
            return null;
        
        return slow;
    }
}