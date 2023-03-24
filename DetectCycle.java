/* the time complexity of this implementation is O(n)
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) {
            return null;
        }
        ListNode ptr1 = head;
        ListNode ptr2 = slow;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
    public static void main(String[] args) {
        // create a linked list with a cycle
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        // detect the cycle and print the node where it begins
        ListNode cycleStart = detectCycle(head);
        System.out.println("Cycle starts at node with value: " + cycleStart.val);
    }

}
