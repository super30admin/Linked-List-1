package week4;

public class FindCycle {

    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isFound = false;

        while(fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                isFound = true;
                break;
            }
        }

        slow = head;
        if(isFound) {
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        } return null;

    }
}
