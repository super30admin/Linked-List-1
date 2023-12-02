//TC:O(n) //single pass
//SC:O(1)
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while(count <= n){ // to maintain n nodes
            fast = fast.next;
            count++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next; // to consider the condition where we have to remove 1st element
    }
}
