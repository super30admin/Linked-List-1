public class ReverseLinkedList {
    // Idea is to create links to point to previous elements 
    // Time Complexity: O(n)
    // Space Complexity: O(1)
        public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode temp = null;
        while(current!=null)
        {
           temp = current.next;
           current.next = prev;
           prev = current;
           current = temp;
        }
        return prev;
    }
}
