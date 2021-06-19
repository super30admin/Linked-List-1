package LinkedList1;

public class question50_RemoveNthNodeFromEndofList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /*
        Two pass method
            Time Complexity: O(n)
            Space Complexity: O(1)
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        int length = 0;

        while(temp != null) {
            length++;
            temp = temp.next;
        }

        length = length - n;
        temp = dummy;
        while(length > 0) {
            length--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }

    /*
        One pass method
            Time Complexity: O(n)
            Space Complexity: O(1)
    */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        while(count < n) {
            fast = fast.next;
            count++;
        }
        //create an appropriate gap
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //slow will be at prev node and one to be removed.
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {

    }

}