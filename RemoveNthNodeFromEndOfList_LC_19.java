/*
Did this code successfully run on Leetcode :  Yes
Any problem you faced while coding this :  No
Approach - one pass
    1. move first pointer till n+1
    2. now our first pointer is n nodes apart, we will move both of the pointer till first != null and second will lie right
       before the n node from end and now we can remove this node with pointing the second.next pointer to its second.next.next pointer
Time complexity of one pass approach- O(N)
Space complexity of one pass approach- O(1)
 */
public class RemoveNthNodeFromEndOfList_LC_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode first = dummy;
        ListNode second = dummy;
        dummy.next = head;


        for(int i = 1;  i<= n+1; i++) { // 0 1 2 3 4 5  first will
            first = first.next;
        }
        while(first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;

    }
}