//iterative solution
//time complexity: O(n)
//space complexity: O(n)
import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) {
        //init pointers
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null){
            next = curr.next;   //save next
            curr.next = prev;   //reverse
            prev = curr;        //advance prev and curr
            curr = next;
        }
        return prev;    //new head at the end
    }
  
}