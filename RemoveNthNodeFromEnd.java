//Time Complexity: O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode :Yes
//Approach: In order to delete the nth node from the end, we can use two pointers approach to address this
//move the fast pointer 1 position beyond the position which needs to be removed
//now we move the slow and the fast pointers until fast != null
//now slow will be one node before the position that needs to be removed
public class RemoveNthNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        final ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy, fast = dummy;

        for (int i = 0; i <= n; i++) fast = fast.next;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = temp.next;

        temp.next = null;

        return dummy.next;
    }

    public static void main(String[] args) {
        final RemoveNthNodeFromEnd nthNodeFromEnd = new RemoveNthNodeFromEnd();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode output = nthNodeFromEnd.removeNthFromEnd(head, 3);

        while (output != null) {
            System.out.print(output.val + " -> ");
            output = output.next;
        }
    }
}
