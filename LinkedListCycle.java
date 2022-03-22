public class LinkedListCycle {
  /**
   * Find if there is a cycle in the LinkedList and return the node where cycle begins.
   * 
   * Concept: 
   *  Have a slow pointer and a fast pointer. The fast pointer moves at double the speed of the slow pointer.
   *  
   *  Referring back to the class notes. When they both meet, slow pointer would have travelled distance (a + b)
   *     while the fast would have traversed (a + b + c + b)
   * 
   *  Since fast is moving at double speed, the distance (a + 2b + c) = 2 ( a + b ) => a = c
   * 
   *  So, in a cycle, the distance from head to start of cycle should be equal to 
   *      the place where slow and fast pointers meet to the start of cycle.
   * 
   * 
   * Time Complexity: O(n)  -> One Pass (Two Passes worst case)
   * Space Complexity: O(1) -> No extra space used.
  */
  public ListNode detectCycle(ListNode head) {
    if(head == null || head.next == null) { return null; }
    
    ListNode slow = head.next;
    ListNode fast = head.next.next;
    
    while(slow != fast){
        slow = slow.next;
        if(fast == null) { return null; }
        fast = fast.next;
        if(fast == null) { return null; }
        fast = fast.next;
    }
    // reset pointers
    slow = head;
    while(slow != fast){
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
  }
}
