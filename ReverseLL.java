// Time Complexity : O(n) going over the Linked List
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
/* Your code here along with comments explaining your approach: Move the current pointer next to the temp pointer. Previous pointer prev will take care
of the previous node to the temp. Current will take care of the next node to the temp. Point temp to prev to establish a backward link and then
prev move to temp and temp further goes to curr and the steps repeat. At the end, move the head to prev as prev is now pointing at the end of the
original linked list.
*/
class Solution {
    public ListNode reverseList(ListNode head) {
      ListNode prev = null;
      ListNode temp = head;
      ListNode curr = temp;
      if(head == null){return head;}                // Base case
      while(curr != null){
          curr = temp.next;                         // Curr takes care of the next node ot the temp
          temp.next = prev;                         // Temp estabalishes a backward link to previous node
          prev = temp;                              // Prev points to the current node temp.
          temp = curr;                              // Temp moves to the next node
    }
        head = prev;                                // head moves to the prev to display the LL
        return head;
}
}

/* RECURSIVE
    private ListNode reverse(ListNode head){                            // Standard function to Reverse a Linked List
        if(head == null || head.next == null){return head;}				// Head reaches the end first, and r points the last element as the head of the reversed LL
        ListNode r = reverse(head.next);
        head.next.next = head;							// Current's next node's next is the current. We want our next node to point to us back.
        head.next = null;							// Current node points to null
        return r;								// Return the head of the linked list
    }
*/