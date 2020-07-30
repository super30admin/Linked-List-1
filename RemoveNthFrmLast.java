/**
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :
  //Nope

// Your code here along with comments explaining your approach
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        //get to nth node from strt.
        //no need to check if fast is valid.
        //since we know n is valid.
        while(n > 0){
            fast = fast.next;
            n--;
        }

        //move nth node and slow simultaneously,
        //till nth node != null
        while(fast != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        if(prev != null)
            prev.next = prev.next.next;
        else  //this will only happen if first elem is nth elem.
            head = head.next;

        return head;
    }
}
