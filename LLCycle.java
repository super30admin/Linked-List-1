//Both the solution take O(n) time complexity where as two pointer soln takes O(1) space
// and using HashSet would take O(n) space complexity


//Two Pointer Solution
public class Solution {

  public ListNode detectCycle(ListNode head) {
    ListNode fastPtr = head;
    ListNode slowPtr = head;
    boolean isCycleFormed = false;

    while (fastPtr != null && fastPtr.next != null) {
      fastPtr = fastPtr.next.next;
      slowPtr = slowPtr.next;
      if (fastPtr == slowPtr) {
        isCycleFormed = true;
        break;
      }
    }
    fastPtr = head;
    if (!isCycleFormed) return null;
    else {
      while (fastPtr != slowPtr) {
        fastPtr = fastPtr.next;
        slowPtr = slowPtr.next;
      }
      return fastPtr;
    }
  }
}


// Using HashSet
public class Solution {
     public ListNode detectCycle(ListNode head) {
         if(head == null)
             return null;
         Set<ListNode> s = new HashSet<>();
         while(head != null){
             if(s.contains(head))
                 return head;
             else{
                 s.add(head);
                 head = head.next;
             }
         }
         return null;
     }
}

