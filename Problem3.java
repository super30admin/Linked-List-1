// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
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
public class Probem3 {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null ){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // Cycle detected
                break;
            }
        }

        if(slow == fast){
            slow = head;

            while(slow != fast){

                slow = slow.next;
                fast = fast.next;
            }
        }else{
            return null;
        }


        return fast;
    }
}