// Time Complexity :O(n)
// Space Complexity :1
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :I was getting an error saying null pointer exception but after using dummy node it was resolved.


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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
    	//we took two pointers prev and end
        ListNode prev,end;
        //if linked list has no element return null
        if(head==null) return null;
        //here we made a dummy node
        ListNode dummy=new ListNode(0);
        //we placed dummy node before the head
        dummy.next=head;
        //prev and end pointers are initialised to dummy
        prev=dummy;
        end=dummy;
      //end made a jump equal to the value of n+1 from dummy 
        for(int i=0;i<=n;i++)
        {
            end=end.next;
        }
        //now end and prev are moving at equal speed
        while(end!=null)
        {
            end=end.next;
            prev=prev.next;
        }
        //when end reached at end we got the node we have to remove, we have to remove the node next to prev
        //
        prev.next=prev.next.next;
        return dummy.next;
    }
}