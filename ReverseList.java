/*
  * Time complexity - O(N) where N is the size of the linked list.
  * Space complexity - O(1)
  */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null, prev = null, curr = head;

        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}

/*  Solution 2 -------------- RECURSION.
 * Time Complexity - o(N) where N is the length of the linked list.
 * Space Complexity - O(N) stack space.
 */
class Solution {
    public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null)
                return head;
            ListNode curr = head;
            return reverseList(curr, null);
    }
    public ListNode reverseList(ListNode curr, ListNode prev) {
        if(curr == null) return prev;

        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;

        return reverseList(curr, prev);
    }
}
