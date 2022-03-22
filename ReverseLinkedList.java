public class ReverseLinkedList {
  /**
   * Reverse Nodes in a LinkedList
   * 
   * Approach 1:
   *    ITERATIVE
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   */
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    
      // 1 -> 2 -> 3
      while(curr != null){
          ListNode temp = curr.next;
          curr.next = prev;
          prev = curr;
          curr = temp; 
      }
      
      return prev;   
  }

  /**
   * TODO: Reverse Nodes in a LinkedList
   * 
   * Approach 2:
   *    RECURSIVE
   * 
   */
}
