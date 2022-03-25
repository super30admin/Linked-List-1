// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

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

        if(head==null)
            return null;

        //we use slow and fast pointer

        ListNode slow = head;
        ListNode fast = head;

        boolean flag = false; //detects cycle or not

        //move one pointer 1x and second pointer 2x
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            //cycle exists
            if(slow==fast)
            {
                flag = true;
                break;
            }
        }

        //no cycle
        if(flag==false)
            return null;

        //if there is a cycle
        //reset one of the pointers to head
        fast = head;

        //move both pointers 1x
        while(slow!=fast)
        {
            slow = slow.next;
            fast = fast.next;
        }

        //wherever they meet is the head of the cycle

        return slow;
    }
}
