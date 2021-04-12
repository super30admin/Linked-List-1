//Time - O(N) - where N is length of the linked list
//Space - O(1) - no additional space
// Iterative
 class Solution {
     public ListNode reverseList(ListNode head) {

         if(head == null || head.next == null){
             return head;
         }


         ListNode prev = null;
         ListNode temp = head;

         while(temp != null){
             ListNode next = temp.next;

             temp.next = prev;
             prev = temp;
             temp = next;
         }

      return prev;
     }
 }


// Recursive

//Time - O(N) - where N is length of the linked list
//Space - O(N) - implicit space allocated for recursion call stack
class Solution {
  public ListNode reverseList(ListNode head) {

    if(head == null || head.next == null){
      return head;
    }

    ListNode reversed = reverseList(head.next);
    System.out.println("reversed: "+reversed.val);
    head.next.next = head;
    head.next = null;

    return reversed;
  }
}
