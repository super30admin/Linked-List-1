// TC: O(n)
// SC: O(1)
// Approach - take 3 pointers 
// prev , curr and temp
// initially prev will point to null 
// null <- 1 <- 2 <- 3 <- 4 <- 5
// this is how we want new list to look by simply changing pointer

public class ReverseLinkedList {

  class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public ListNode reverseList(ListNode head) {

    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
      ListNode temp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = temp;
    }
    return prev;
  }

}
