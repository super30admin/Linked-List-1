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
            int cnt = 0;
        
            ListNode fP = head;
            ListNode sP = head;

            while(fP != null)
            {
                fP = fP.next;
                ++cnt;
            }
        
            if(cnt == n)
            {
                head = head.next;
                return head;
            }
            else
            {
                while(cnt > n+1)
                {
                    sP = sP.next;
                    --cnt;
                }

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
