/*
Time complexity : O(n)
Space complexity: O(1)
*/
public class removeNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 0;
        ListNode slow = dummy;
        ListNode fast = dummy;
        //to find the sliding window width
        while(count <= n){
            fast = fast.next;
            count++;
        }
        //remove the value next to slow which ic nth node
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}