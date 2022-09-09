// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/**
 * We are using a dummy node to handle the case when we have to remove the first node (i.e last from the end)/
 * We have two pointers slow and fast and will keep on moving fast till a count of the nth node and then move
 * both slow and fast until we have fast at the end.
 * We are making an initution that the slow pointer would always be one node previous to the node we have to remove.
 * To remove the node, we will just change the reference of the slow pointer.
 */

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
class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null) return null;

        //we will add a dummy node to handle the case when
        //we have to reomve the first node
        ListNode dummy = new ListNode(-1);

        dummy.next = head;


        int count =0;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while(count<=n){

            fast = fast.next;
            count++;

        }

        while(fast!=null){


            fast = fast.next;
            slow = slow.next;

        }
        //removing reference from the node
        slow.next = slow.next.next;

        return dummy.next;
    }
}


/**
 * Another approach would be two pass solution.
 *
 *
 */