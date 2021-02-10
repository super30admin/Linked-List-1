// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :Yes
//I tried the approach of finding the size of the list but could not figure out one pass solution.


// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
            return null;
        int size=1;
        ListNode slow=head;
        while(slow.next!=null)
        {
            slow=slow.next;
             size++;
        }
        int i=0;       
        ListNode temp=head;
        while(i<(size-n) && temp.next!=null)
        {
            if(i==(size-n)-1)
            {
                ListNode targ=temp.next;
                temp.next=temp.next.next;
                targ.next=null;
            }
            temp=temp.next;
            i++;
                
        }
        return head;
        
    }
}