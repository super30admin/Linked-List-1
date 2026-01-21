// Time Complexity : O(N), all nodes in the linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach :
// Keep 2 additional pointer, once to track the next node and one to track the prev node. Swap the values to point head.next to the
// previous node to reverse the order.
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
