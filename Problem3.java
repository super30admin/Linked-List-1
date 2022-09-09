// Time Complexity :O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
/**
 * We are using a two pointer approach, one slow and one fast pointer.
 * For the distance where the cycle starts, it would be equal to the distance of head from slow, until
 * slow and fast meets.
 */


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
public class Problem3 {
    public ListNode detectCycle(ListNode head) {
        boolean flag = false;
        //return false if empty
        if(head==null) return null;

        ListNode slow = head;
        ListNode fast = head;


        //to consider both odd and even cases
        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                flag = true;
                break;
            }

        }

        if(!flag) return null; //return null if there is no cycle

        //to detect the starting point
        //distance from head to start and start to meeting point would be same
        slow = head;

        while(slow!=fast){


            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}
