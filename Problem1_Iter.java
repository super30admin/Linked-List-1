// Time Complexity :
//    reverseList() - O(n) - we go through all nodes
//      
// Space Complexity :
//    reverseList() - O(1) - two pointer approach
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

//Reversing a linked list by iterative method
class Problem1_Iter {
    public ListNode reverseList(ListNode head) {
        //If head is null
        //nothing to reverse
        if(head == null)
            return head;
        else
        {
        	//Use two pointers fP and sP
            ListNode fP = null;
            ListNode sP = head.next;

            while(sP != null)
            {
            	//reverse the head's next pointer to fP
                head.next = fP;
                
                //move all the pointers one node along the chain to the right
                fP = head;
                head = sP;
                sP = sP.next;
            }

            //At the end point head's next to fP
            head.next = fP;

            //return head
            return head;
        }
    }
}
