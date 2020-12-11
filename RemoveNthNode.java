/** Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * TC O(N). SC O(1)
 * Code submitted on leetcode 
*/
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return head;
        ListNode dummy = new ListNode(-1);
          dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
      
        int count = 0;
        while (count <= n) {
            fast = fast.next;
            count++;
        }
        while(fast!= null) {
            slow = slow.next;
            fast = fast.next;
        }  

        ListNode extra = slow.next;
        //Incase we want to remove the dangling pointer from
        // removal nodes next pointer. Clearing all of the links between nodes is     "unnecessary", but: helps a generational GC if the discarded nodes inhabit
        // more than one generation
        // - is sure to free memory even if there is a reachable Iterator

        slow.next = slow.next.next;
        if (extra != null)
        {
            extra.next = null;
        }
        
        return dummy.next;
    }
}
