class Solution {

  // space complexity - o(1)
      //time - o(n) where n is length of linked list
      //Ran on Leetcode successfully : Yes
      // Problem faced  : No
// Iterative approach : 
  public ListNode reverseList(ListNode head) {

      ListNode prev = null;
      ListNode curr = head;

      while(curr != null){
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }

      return prev;
  }
  // space complexity - o(n) - implicit stack used , where n is length of linked list
      //time - o(n) where n is length of linked list
      //Ran on Leetcode successfully : Yes
      // Problem faced  : No
  // Recursive approach :
    public ListNode reverseList(ListNode head) {
        return reverseList(null, head);
    }

    public ListNode reverseList(ListNode prev, ListNode curr) {
        if(curr == null) return prev;
        ListNode lastNode = reverseList(curr, curr.next);
        curr.next = prev;
        return lastNode;
    }
}
