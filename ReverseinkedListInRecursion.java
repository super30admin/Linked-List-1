package LinkedList1;

/*Reverse a singly linked list.

Example:
Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
Source Link: https://leetcode.com/problems/reverse-linked-list/
     -------------------------------------------------------------------------------------------------------
      Time complexity : o(n) 
      space complexity: o(1) 
      Did this code run successfully in leetcode : yes
      problems faces : No
  */
public class ReverseinkedListInRecursion {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null)
            return head;

       ListNode reversed = reverseList(head.next);
       head.next.next= head;
       head.next = null;
       return reversed;
    }
    

}
