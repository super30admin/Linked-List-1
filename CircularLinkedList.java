// Time Complexity :O(n)
// Space Complexity :1
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
    public ListNode detectCycle(ListNode head) 
    {//making two pointers, slow and fast and initialising to head
        ListNode slow=head;
        ListNode fast=head;
        //making  a flag to easily return if LL is circular or not
        boolean flag=false;
        //if LL is empty return null
        if(head==null || head.next==null) return null;
        //now we'll make fast jump two times the speed of slow if they meet,we come to know that the LL is circular
        while(  fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                //if they meet we exit the loop
            flag=true;
               break;
            }
        }//if they don't meet we return null
          if(!flag ) return null;  
          //we make slow as head
          slow=head;  
        
        //now again we make them move at same speed the point they meet will be the point where tail connects
        while (slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        //we return fast
        return fast;
    }
}

