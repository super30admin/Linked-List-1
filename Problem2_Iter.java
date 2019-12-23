// Time Complexity :
//    removeNthFromEnd() - O(n) - we go through all nodes
//      
// Space Complexity :
//    removeNthFromEnd() - O(1) - two pointer approach
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
        if(head == null)
            return null;
        else
        {
            //keep a counter
            int cnt = 0;
        
            //two pointer approach
            ListNode fP = head;
            ListNode sP = head;

            //run first pointer till end and count the number of nodes
            while(fP != null)
            {
                fP = fP.next;
                ++cnt;
            }
        
            //if we need to remove first node from the list
            if(cnt == n)
            {
                head = head.next;
                return head;
            }
            else
            {
                //run second pointer till one node before the node to be deleted
                while(cnt > n+1)
                {
                    sP = sP.next;
                    --cnt;
                }

                //delete the node
                //return the head
                if(sP.next != null)
                {
                    sP.next = sP.next.next;
                    return head;
                }
                else
                {
                    sP = null;
                    return head;
                }
            }
        }
    }
}
