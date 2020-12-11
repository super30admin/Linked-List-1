/*  Reverse Linked List
* TC O(N) SC O(N)
* Code submitted on leetcode
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
       
        return helper(head, head, head.next);
    }
    ListNode helper(ListNode head, ListNode prev, ListNode temp) {
        if (prev == null || prev.next == null) {
            return head;
        }
            prev.next = temp.next;
            temp.next = head;
            head = temp;
            return helper(head, prev, prev.next);  
    }
     
}
